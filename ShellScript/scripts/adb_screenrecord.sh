#!/bin/bash

#############################################################
# Script para gravar a tela(só acima de 4.4 (API level 19)) #
# Created by: JBarbosa                                      #
# Version: 1.0                                              #
# GitHub: github.com/josinaldobarbosa                       #
#############################################################

# more info: adbshell.com/commands/adb-shell-screenrecord

TEMP_FILE="/sdcard/record-`date +%Y%m%d%H%M%S`.mp4"

echo -n "Record: ctrl + c to stop"
$(adb shell screenrecord $TEMP_FILE)

#TODO: fazer manual

adb pull $TEMP_FILE
echo "transferido $TEMP_FILE"

adb shell rm $TEMP_FILE
echo "removido $TEMP_FILE"