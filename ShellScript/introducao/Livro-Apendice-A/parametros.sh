#!/bin/bash

i=0

while test "$1"
do
  i=$((i+1))
  echo "Parâmetro $i: $1"
  shift # muda o valor do parametro para a variavel i
done
