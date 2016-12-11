#!/bin/bash

# Forma moderna de expressões condicionais:
# (<Expressão>) agrupa expressões que influenciam na precedencia
# && = AND
# || = OR
# == = <string> verifica se é igual ao pattern
# =  = igual ao operador ==
# != = verifica se é diferente ao pattern
# =~ = verifica se é igual a expressão regular
# OBS: não usar "test" -a e -o para AND e OR 

#COMPLETO: http://wiki.bash-hackers.org/syntax/ccmd/conditional_expression

valor1=5
valor2=10

# Exemplo com AND
if [[ $valor1 == 5 && $valor2 == 10 ]]; then
 echo "1 - Verdadeiro"
else
 echo "1 - Falso"
fi

# Exemplo com OR
if [[ $valor1 == 10 || $valor2 == 10 ]]; then
 echo "2 - Verdadeiro"
else
 echo "2 - Falso"
fi

# Exemplo com ==
valor3=5
test $valor1 == $valor3 && echo "3 - $valor1 é igual a $valor3"

# Exemplo com !=
valor4=10
test $valor1 != $valor4 && echo "4 - $valor1 é diferente de $valor4"

# Exemplo com =~
REGEX=".fim"
valor="olafim"

if [[ $valor =~ $REGEX ]]; then
 echo "5 - Verdadeiro"
else
 echo "5 - Falso"
fi
