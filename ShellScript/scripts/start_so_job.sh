#!/bin/bash
#
# ---------------------------------------------------------------------
# Script para iniciar meus programas ao logar no sistema.
# criar arquivo se não existir: .bash_login no usuario
# ---------------------------------------------------------------------
#

# ---------------------------------------------------------------------
# Programas que devem ser abertos: 1 = SIM, 0 = NAO
# ---------------------------------------------------------------------
CHROME=0;
# ---------------------------------------------------------------------

# argumentos: 1º variavel da variavel, 2º nome do programa, 3º comando para abrir
open() {
 if [ $1 == 1 ];
 then
  echo ">> OPEN $2"
  $3
 fi
}

open $CHROME "Google Chrome" google-chrome
