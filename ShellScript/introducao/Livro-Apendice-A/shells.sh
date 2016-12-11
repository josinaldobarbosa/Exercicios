#!/bin/bash

# Do arquivo /etc/passwd, mostrar todos os shells (ultimo campo) que os usuarios usam. Não mostrar linhas repetidas.

cat /etc/passwd | cut -d : -f 7 | sort | uniq
