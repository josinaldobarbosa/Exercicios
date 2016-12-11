#!/bin/bash

# Do arquivo /etc/passwd, mostra o usuario e nome completo de cada usuario do sistema campos 1 e 5 separados por um tab.

cat /etc/passwd | cut -d : -f 1,5 | tr : '\t'

