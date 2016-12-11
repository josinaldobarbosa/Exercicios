#!/bin/bash

echo -n "Digite o arquivo: "
read ARQUIVO

test -d "$ARQUIVO" && echo "$ARQUIVO é um diretório"
test -f "$ARQUIVO" && echo "$ARQUIVO é um arquivo"
test -f "$ARQUIVO" -o -d  "$ARQUIVO" || echo "O arquivo '$ARQUIVO' não foi encontrado"

echo
