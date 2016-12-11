#!/bin/bash

# Recebe um número como parametro e diminui até chegar a zero, mostrando na tela cada passo, em uma mesma linha.

valor=$1

while test $valor -ge 0;
do
 echo -n "$valor "
 valor=$((valor-1))
done

echo
