#!/bin/bash

########################################################
# Pega devices e coloca em um array                    #
# Create by: JBarbosa - github.com/josinaldobarbosa    #
# Version: 1.0                                         #
# 1 device = não exibe opcao                           #
# 2 ou mais devices = exibe opcao, e opcao para todos  #
########################################################
ADB_DEVICES=() # devices lidos
CHOSEN_DEVICES=() # devices escolhidos

wait_device() {
    (adb wait-for-device) | zenity --progress \
    --title="Esperando device" \
    --text="Plugue o device..." \
    --pulsate \
    --auto-close \
    --auto-kill
}

choose_devices() {
    get_devices

    # Se igual a 1 não mostra opcao de escolha
    if test ${#ADB_DEVICES[@]} == 1; then
        CHOSEN_DEVICES[0]=${ADB_DEVICES[0]}
    else
        devices_escolhidos=$(zenity --list --separator=" " --title="Escolha o device" --text="Use o ctrl para selecionar mais de um." --column="Device" "${ADB_DEVICES[@]}" --multiple)
        not_duplicated=$(echo ${devices_escolhidos[@]} | tr ' ' '\n' | nl | sort -u -k2 | sort -n | cut -f2-)
        CHOSEN_DEVICES=$not_duplicated
    fi
}

get_devices() {
    ADB_DEVICES=($(adb devices | grep -v "List" | awk '{print $1}'))
}

show_current_device() {
    echo $CHOSEN_DEVICES
}

################# INICIA #################
wait_device
choose_devices
show_current_device