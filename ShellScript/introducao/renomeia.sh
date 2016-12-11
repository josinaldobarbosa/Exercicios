#!/bin/bash

# Script para renomear um arquivo
# Se passado por parametro, é renomeado diretamente
# ex.: ./renomeia nome_atual.txt nome_novo.txt

renomeia() {
 ls
 echo "[--- RENOMEADOR DE ARQUIVO ---]"
 echo -n "Nome e extenção do arquivo: "
 read antigo;
 echo -n "Nome e extenção novo: "
 read novo;
 mv $antigo $novo
 echo "Renomeado com sucesso"
}

# Verifica se tem 2 parametros
if [ "$#" == "2" ];
 then
  mv $1 $2
  echo "Renomeado com sucesso para $2"
 else
  renomeia
fi
