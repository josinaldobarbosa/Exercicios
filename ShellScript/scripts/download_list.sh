#!/bin/bash

# Script para fazer donwload de uma lista com url's
continue=1; # 1 para perguntar a cada arquivo, 0 baixa todos sem perguntar

path_list=();

start() {
 escolhe_arquivo
}

escolhe_arquivo() {
 path_list=`zenity --file-selection --title "Escolha o arquivo com a lista de links:"`
 percorre_lista
}

percorre_lista() {
  for url in $(cat $path_list);
   do
    # Verifica se é necessário perguntar
    if test $continue == 1;
     then
      echo -n ">> Deseja baixar o arquivo $url?(s/n)"
      read valor;
      # Verifica opção escolhida
      if test $valor == "s";
       then
        download $url
       else
        echo "chau"
        exit
      fi
      # -----
     else
      download $url
    fi
    # -----
  done
  
  echo ">>> Download finalizado com sucesso!"
}

download() {
 echo
 echo "[>>> ------------ BAIXANDO ------------ <<<]"
 wget $1
}

### Inicia script ###
start
