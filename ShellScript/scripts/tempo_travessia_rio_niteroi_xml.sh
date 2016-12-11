#!/bin/bash

# Script para exibir tempo de travessia da ponte rio-niteroi

NOME_ARQUIVO="TempoViagem.xml"

# Baixa xml
wget --quiet http://www.ecoponte.com.br/Xml/TempoViagem.xml -O $NOME_ARQUIVO

# Coleta do xml as informações
CAMINHO_DEFAULT="TEMPOVIAGEM/PONTE_RIO_NITEROI"
SENTIDO_NITEROI=$(xmllint --xpath "string(//$CAMINHO_DEFAULT/RIODEJANEIRO/NITEROI/@MINUTOS)" $NOME_ARQUIVO)
#SENTIDO_NITEROI=$(xmlstarlet select -t -v "$CAMINHO_DEFAULT/RIODEJANEIRO/NITEROI/@MINUTOS" $NOME_ARQUIVO)
SENTIDO_RIO=$(xmllint --xpath "string(//$CAMINHO_DEFAULT/NITEROI/RIODEJANEIRO/@MINUTOS)" $NOME_ARQUIVO)

# Exibe
echo "[--------- Tempo de travessia: Ponte Rio-Niterói ---------]"
echo
echo " Sentido Niterói: $SENTIDO_NITEROI"
echo " Sentido Rio de Janeiro: $SENTIDO_RIO"
echo
echo "[---------------------------------------------------------]"

# Remove xml
rm $NOME_ARQUIVO