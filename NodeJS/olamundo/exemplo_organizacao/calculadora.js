// Construtor
var Calculadora = function() {

};

// Soma os valores
Calculadora.prototype.soma = function(n1, n2) {
	return n1 + n2;
};

// Exportando o construtor Calculadora neste módulo(pode ser qualquer coisa)
module.exports = Calculadora;