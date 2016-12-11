# Importa biblioteca Flask
from flask import Flask

# Inicializa a aplicacao instanciando Flask
app = Flask(__name__)

# Atribui uma rota ao hello_world
@app.route('/')
def hello_world():
	return 'Hello World!'

# Roda a aplicacao em: http://localhost:8085
app.run(debug=True,port=8085)