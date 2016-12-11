#!/bin/bash

# Exemplo de dialogs
altura=10
largura=50

calendario() {
	dialog --calendar "Selecione uma data:" 5 40
}

dialog_menssagem() {
 msg="Seu micro está pegando fogo"
 test "$1" != "" && msg=$1
 dialog --msgbox "$msg" $altura $largura
}

dialog_input() {
 dialog --inputbox "Qual seu nome?" $altura $largura "you name" 2> /tmp/resposta.tmp
 canal=`cat /tmp/resposta.tmp`
 dialog_menssagem "Olá, $canal" # entre "" para não cortar os espaços
}

menu_dialog() {
 dialog --clear --backtitle "Backtitle here" --title "Title here" --menu "Choose one of the following options:" 15 40 4 1 "Option 1" 2 "Option 2" 3 "Option 3"
}

menu() {
	echo "1 para exibir uma dialog exemplo"
	echo "2 para entrar com um texto na dialog"
	echo "3 para exibir menu de opções"
	echo "4 para exibir calendário"
	echo "x para sair"
	echo -n "Escolha uma opção: "
	read opcao

	case $opcao in
 		1)
  			dialog_menssagem
 	 	;;
 	 	2)
  			dialog_input
 	 	;;
 		3)
  			menu_dialog
 	 	;;
 	 	4)
			calendario
		;;
 	 	"x")
			clear
			exit
	esac

	clear
	menu
}

### START ###
menu
