#!/bin/bash

# todas as opções em: zenity --help

zenity_forms() {
	zenity --forms --text="Seleciona as opções" --add-list="opcao1" --list-values="valor1|valor2|valor3|valor4|valor5"
}



menu() {
	echo "1 - forms"
	echo "x - sair"
	echo -n "Escolha uma opção: "
	read opcao
	case $opcao in
 		1)
  			zenity_forms
 	 	;;
 	 	"x")
			clear
			exit
		;;
	esac

	#clear
	menu
}

### START ###
echo "Exemplos em: http://linux.byexamples.com/archives/259/a-complete-zenity-dialog-examples-1/"
menu