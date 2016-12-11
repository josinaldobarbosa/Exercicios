#!/bin/bash

# Copia pasta e arquivos

entrada=$(zenity --file-selection --directory --title="Pasta de origem")

echo $entrada
