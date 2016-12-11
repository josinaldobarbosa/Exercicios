// Requisitando o arquivo calculadora.js
var Calculadora = require('./calculadora');

// Criando uma instância do objeto Calculadora
var calculadora = new Calculadora();

// Chama a função soma
var resultado = calculadora.soma(5, 5);

// Exibe resutado
console.log("Valor total = " + resultado);