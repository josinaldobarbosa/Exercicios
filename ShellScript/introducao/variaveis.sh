#!/bin/bash

nome="Jesus"
echo "Com $nome não se brinca."

_site="www.google.com.br"
echo "Site é $_site"

echo "Não esqueça de utilizar a varivavel correta \$_site"

endereco_local="127.0.0.1"
echo "Meu endereço $endereco_local"

caminho=`pwd`
echo "Estou em: $caminho"

arquivos=$(ls)
echo -e "E tenho os arquivos: \n$arquivos"

system_info=$(df -h)
echo -e "Partições do sistema: \n$system_info"

info="Sim"
echo $'Quebra\nLinha\n'$info

soma=$((5 + 5))
echo "Valor da soma: $soma"
