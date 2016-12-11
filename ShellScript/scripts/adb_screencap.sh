#!/bin/bash

#############################################
# Script para tirar screnshot da tela       #
# Created by: JBarbosa                      #
# Version: 1.0                              #
# GitHub: github.com/josinaldobarbosa       #
#############################################

# more info: adbshell.com/commands/adb-shell-screencap

TEMP_FILE="/sdcard/screen-`date +%Y%m%d%H%M%S`.png"

adb shell screencap $TEMP_FILE
adb pull $TEMP_FILE
adb shell rm $TEMP_FILE