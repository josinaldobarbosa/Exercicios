#!/bin/bash

# Recebe 2 numeros por parametro e mostra a relação entre eles: maior, menor e igual

valor1=$1
valor2=$2

if test $valor1 -eq $valor2;
  then
  echo "$valor1 é igual a $valor2"
  else
  if test $valor1 -gt $valor2;
   then
    echo "$valor1 é maior que $valor2"
   else
    echo "$valor1 é menor que $valor2"
  fi
fi
