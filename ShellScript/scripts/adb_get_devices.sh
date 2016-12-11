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
    echo "Esperando device..."
    adb wait-for-device &> /dev/null
}

get_devices() {
    ADB_DEVICES=($(adb devices | grep -v "List" | awk '{print $1}'))
}

show_devices() {
    # Se igual a 1 não mostra opcao de escolha
    if test ${#ADB_DEVICES[@]} == 1; then
        CHOSEN_DEVICES[0]=${ADB_DEVICES[0]}
    else
        echo
        echo "[ Devices encontrados ]"
        echo "[0] - TODOS"
        for ((i=0; i < ${#ADB_DEVICES[@]}; i++)); do
            contador=$(($i + 1))
            echo "[$contador] - ${ADB_DEVICES[$i]}"
        done
    fi
}

read_escolha_device() {
    if test ${#CHOSEN_DEVICES[@]} == 0; then
        echo
        echo -n "Qual device deseja?: "
        read opcao

        if test $opcao == 0; then
            CHOSEN_DEVICES=(${ADB_DEVICES[@]})
        else
            index_devices=$(($opcao - 1))
            CHOSEN_DEVICES[0]=${ADB_DEVICES[$index_devices]}
        fi
    fi
}

show_current_device() {
    echo
    echo "Device escolhido(s):"

    for ((i=0; i < ${#CHOSEN_DEVICES[@]}; i++)); do
        echo ${CHOSEN_DEVICES[$i]}
    done
}

################# INICIA #################
wait_device
get_devices
show_devices
read_escolha_device
show_current_device
