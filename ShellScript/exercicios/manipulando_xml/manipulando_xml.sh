#!/bin/bash

ARQUIVO="teste.xml";

# update
xmlstarlet edit -L -u "/titulo/nome" -v 'Mudou :)' $ARQUIVO

# append
xmlstarlet edit -L --append "/titulo/nome" -t elem -n "nome" -v "Novo nome" $ARQUIVO

# -L: modifica no arquivo original xml, sem isso so mostra como ficaria o resultado
# Ajuda: xmlstarlet, xmlstarlet ed --help

# exibe nomes
NOMES=($(xmlstarlet select -t -v "/titulo/nome" $ARQUIVO))
for (( i=0; i < ${#NOMES[@]}; i++ )); do
	echo ${NOMES[$i]}
done

