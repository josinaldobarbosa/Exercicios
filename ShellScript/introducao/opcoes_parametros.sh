#!/bin/bash

# Criando opções para parametros na linha de comando

MSG_VERSAO="v1.0"
MSG_AJUDA="Tela de ajuda"

######### Verifica opcoes de parametros #########
test "$1" == '-v' && echo $MSG_VERSAO
test "$1" == '-h' && echo $MSG_AJUDA

