#!/bin/bash

echo "Nome do script executado: $0"

total_argumentos=$#;
if [ $total_argumentos == "0" ];
 then
  echo "Você não passou nenhum argumento :("
 else

  # Exibe argumentos
  echo "Total: $#"
  for args in $*
  do
   echo $args
  done

  echo "Argumento 1: $1"

fi
