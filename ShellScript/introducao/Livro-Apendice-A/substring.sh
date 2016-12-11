#!/bin/bash

# Recebe duas palavras como parametro e verifica se a primeira palavra está
# contida dentro da segunda. Só mostra mensagem informativa em caso de sucesso, do
# contrário não mostra nada.

test $# -ne 2 && exit # Verifica se o parametro é diferente de 2, verdadeiro fecha

# grep -qs = q: inibe todas as mensagens normais de saída, s: suprime mensagens de erro 
echo $2 | grep -qs $1 && echo "$1 está contido em $2"
