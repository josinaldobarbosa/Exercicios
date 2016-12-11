#!/bin/bash

###################################################################
# Script para desinstalar UM ou N apps android que possuem a mesma variação de pacote
# autor: Josinaldo A.Barbosa
# github: https://github.com/josinaldobarbosa
###################################################################

########################### Pacotes ###############################

# Nome inicial padrão
PACKAGE_INIT="br.com.teste."

# Nome depois do inicial
package_list=("exemplo1" "exemplo2")

# Pacotes que não estão no padrão
app1="br.com.outracoisa.app"
package_list_excecoes=($app1)

# Variações de pacote
variacoes_list=(".debug" ".homolog" ".log.release") #release é PACKAGE_INIT + LOJA
###################################################################

package_found=()

montaPacoteEPercorreLista() {
	for app in $@; do
		package_name=$PACKAGE_INIT$app
 		percorreLista $package_name
	done
}

percorreLista() {
	for app in $@; do
		searchApp $app
 		for variacao in ${variacoes_list[@]}; do
  			searchApp $app$variacao
 		done
	done
}

searchApp() {
	package=$1

	#FIXME: duplicado se tem em alguma variacão o grep da mat no "release"
	#FIXME: evitar carregar a lista toda vez
	busca=$(adb shell pm list packages | grep "$package")
	
	GREEN='\033[1;32m'
	RED='\033[1;31m'
	NC='\033[0m' # No Color

	if test "$busca" != ""; then
		echo -e $GREEN$package$NC
		size_found=${#package_found[@]}
		package_found[$((size_found + 1))]=$package
	else
		echo -e $RED$package$NC
	fi
}

removeAllApp() {
	for package in ${package_found[@]}; do
		adb uninstall $package
	done
}

############################# INICIA ##############################

echo ">> Esperando plugar o device <<"
adb wait-for-device

echo ">> Aparelho conectado <<"
adb devices -l

echo ">> Buscando APPS <<"
montaPacoteEPercorreLista ${package_list[@]}
percorreLista ${package_list_excecoes[@]}

total_found=${#package_found[@]}
echo "$total_found app(s) encontrado(s)."

if test "$total_found" != "0"; then
	echo -n "Deseja remover os APPS encontrados?(s/n): "
	read opcao
fi

test "$opcao" == "s" && removeAllApp || exit
