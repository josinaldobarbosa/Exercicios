import json
import serial
import sys
import time
import urllib2

# Configuration
JENKINGS_URL = "YOU URL"
JENKINGS_JOBS = ["YOU PROJECT 1", "YOU PROJECT 2", "..."]
PORT_SERIAL = "YOU SERIAL PORT"
PORT_SPEED = 9600
TIME_TRY_AGAIN = 5
# if authentication is required [403 forbidden]
# change HAS_AUTHENTICATION to True, USER and PASSWORD
HAS_AUTHENTICATION = False
USER = "YOU USER"
PASSWORD = "YOU PASSWORD"

# Serial send status
SUCCESS = 'a'
FAILURE = 'b'
BUILDING = 'c'
UNSTABLE = 'd'

# Connection serial
print "> Start serial connection"
ser = serial.Serial(PORT_SERIAL, PORT_SPEED)
ser.setDTR(False)  # to not restart(It works in arduino uno)
time.sleep(2)


class HTTPBasic403AuthHandler(urllib2.HTTPBasicAuthHandler):
    def http_error_403(self, req, fp, code, msg, headers):
        host = req.get_host()
        realm = None
        return self.retry_http_basic_auth(host, req, realm)


def install_auth_opener():
    auth_handler = HTTPBasic403AuthHandler()
    auth_handler.add_password(
        realm=None,
        uri=JENKINGS_URL,
        user=USER,
        passwd=PASSWORD)
    opener = urllib2.build_opener(auth_handler)
    urllib2.install_opener(opener)


def get_status(jobName):
	try:
		jobUrl = JENKINGS_URL + "/job/" + jobName + "/lastBuild/api/json"
		jenkingsStream = urllib2.urlopen(jobUrl)
	except urllib2.HTTPError, e:
		print "URL ERROR: " + str(e.code)
		print "Job name: " + jobName
		sys.exit(2)

	try:
		buildStatusJson = json.load(jenkingsStream)
	except:
		print "Failed to parse json"
		sys.exit(3)
	return buildStatusJson["result"]

def main_loop():
	while(True):
		allSuccess = True
		
		for job in JENKINGS_JOBS:
			status = get_status(job)
			print job + " - " + status
			
			if status == "FAILURE":
				ser.write(FAILURE)
				allSuccess = False
				break
			elif status == "UNSTABLE":
				ser.write(UNSTABLE)
				allSuccess = False
				break
			elif status == "BUILDING":
				ser.write(BUILDING)
				allSuccess = False
				break

		if allSuccess:
			ser.write(SUCCESS)

		time.sleep(TIME_TRY_AGAIN)


# Start
if HAS_AUTHENTICATION:
	install_auth_opener()

try:
	main_loop()
except:
	ser.setDTR(True)
	ser.close()
	print
	print "> Close serial connection"
