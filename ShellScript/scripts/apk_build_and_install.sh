#!/bin/bash

./gradlew mobile:assembleDebug # Buildar debug

CAMINHO_DEFAULT="mobile/build/outputs/apk"

ARQUIVOS=($(ls $CAMINHO_DEFAULT))

echo "Apk's encontrados: "
for ((i=0; i < ${#ARQUIVOS[@]}; i++)); do
	echo "[$i] - ${ARQUIVOS[$i]}"
done

echo -n "Qual deseja instalar?: "
read opcao

adb install "$CAMINHO_DEFAULT/${ARQUIVOS[$opcao]}"