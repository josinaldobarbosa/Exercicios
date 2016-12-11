/*
   Jenkins monitor 1.0
   by: JBarbosa
*/

const int BUZZER = 11;
const int LED_GREEN = 8;
const int LED_YELLOW = 9;
const int LED_RED = 10;

// Config status
const char SUCCESS = 'a';
const char FAILURE = 'b';
const char BUILDING = 'c';
const char UNSTABLE = 'd';

int TIME_TO_RETRY = 1000;
int antepenultByte = 0;
int lastByte = 0;

void setup() {
  Serial.begin(9600);

  pinMode(BUZZER, OUTPUT);
  pinMode(LED_GREEN, OUTPUT);
  pinMode(LED_YELLOW, OUTPUT);
  pinMode(LED_RED, OUTPUT);
}

void loop() {

  if (Serial.available() > 0) {
    antepenultByte = lastByte;
    lastByte = Serial.read();
  }

  switch (lastByte) {
    case SUCCESS:
      changeLed(LED_GREEN);
      break;
    case FAILURE:
      changeLed(LED_RED);
      buzzerFail();
      break;
    case BUILDING:
      changeLedBuilding(LED_YELLOW);
      break;
    case UNSTABLE:
      changeLed(LED_YELLOW);
      break;
  }

  delay(TIME_TO_RETRY);
}

void changeLed(int ledActive) {
  digitalWrite(LED_GREEN, LOW);
  digitalWrite(LED_YELLOW, LOW);
  digitalWrite(LED_RED, LOW);

  digitalWrite(ledActive, HIGH);
}

void changeLedBuilding(int led) {
  digitalWrite(led, LOW);
  delay(1000);
  digitalWrite(led, HIGH);
}

void buzzerFail() {
  if (antepenultByte == FAILURE) {
    return;
  }

  digitalWrite(BUZZER, HIGH);
  delay(2000);

  for (int i = 0; i < 10; i++) {
    digitalWrite(BUZZER, HIGH);
    delay(250);
    digitalWrite(BUZZER, LOW);
    delay(100);
  }
}
