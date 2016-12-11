#!/bin/bash

# Funções são carregadas primeiro
ola() {
 echo "Função olá"
}

# Função com parametro, caso tenha mais de 9 parametros: ${10}
ola_nome() {
 echo "Olá $1"
}

# Chamando as funções
ola

ola_nome "Boss"

