// >> sudo apt-get install nodejs
// >> rodar servidor: nodejs name.js
// >> testar em: 127.0.0.1:porta

var porta = 3000;

var http = require('http');

var server = http.createServer(function(request, response) {
	response.write("<h1>Funciona :)</h1>");
	response.end();
});

server.listen(porta, function() {
	console.log('Servidor iniciado na porta ' + porta);
});