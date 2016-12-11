#!/bin/bash

# Mostra na tela todos grudados todos os parametros como uma unica palavra.

while test "$1"
 do
 echo -n "$1"
 shift # Renomeia o $1 para o proximo.. até finalizar
done

echo

# ou:
# echo $* | tr -d ' '
