#!/bin/bash

#- BEGIN
#Com o begin, o AWK não espera por uma entrada (como digitar enter duas vezes), ele executa tudo daquele bloco:
awk 'BEGIN {print "Vai ser tudo \n imprimido \n de uma vez só\n"}'

# é preciso dar enter 2x para aparecer isso no console, pois o comando AWK espera mais um argumento, um filename.
awk '{ print "Tutorial de AWK - Site Linux Progressivo" }'
