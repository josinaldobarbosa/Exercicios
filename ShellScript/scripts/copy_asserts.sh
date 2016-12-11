#!/bin/bash

#############################################
# Script para copiar asserts                #
# Created by: JBarbosa                      #
# Version: 1.0                              #
#############################################
DIR_TEMP="TEMP"
FOLDER_SOURCE="$DIR_TEMP/_Assets/"
IGNORE_SOURCE_FOLDERS=("NAME_FOLDER")
LOCALE_FLAVORS="../app/src"
INSIDE_FOLDER="Android"
################## Metodos ##################

function clearTemp() {
    rm -rf $DIR_TEMP
}

function renameDirAndroidToRes() {
    folder=$1
    locale="$FOLDER_SOURCE$folder"
    old_locale="$locale/$INSIDE_FOLDER"
    new_locale="$locale/res"
    mv $old_locale $new_locale
    test $? == 1 && clearTemp && exit
    echo $new_locale
}

function copyDir() {
    cp -rf $1 $2
    test $? == 1 && clearTemp && exit
}

function renameFiles() {
    folder=$1
    name_file=$2
    new_name_file=$3

    # return files of path recursive
    files=($(ls -R $folder | awk '/:$/&&f{s=$0;f=0}/:$/&&!f{sub(/:$/,"");s=$0;f=1;next}NF&&f{ print s"/"$0 }'))

    for file in "${files[@]}"
    do
        if [[ $file =~ $name_file ]]; then
            new_path_file=$(dirname $file)
            extencao=".${file##*.}"
            mv $file "$new_path_file/$new_name_file$extencao"
            test $? == 1 && clearTemp && exit
        fi
    done
}

function replaceFoldersName() {
    folder=$1
    name_path=$2
    new_name_path=$3

    files=($(ls "$folder"))

    for file in "${files[@]}"
    do
        if [[ $file =~ $name_path ]]; then
            # replace [// = all / = one] name
            new_folder_name=${file/$name_path/$new_name_path}
            mv "$folder/$file" "$folder/$new_folder_name"
            test $? == 1 && clearTemp && exit
        fi
    done
}
################### START ###################

# Pegar arquivo zip com assets
FILE=$(zenity --file-selection --title="Selecione os assert's" --file-filter="*.zip")
test "$FILE" == "" && echo "Error: nao foi possivel selecionar os asserts" && exit

# Limpa pasta temp e unzipa arquivo
clearTemp
unzip "$FILE" -d $DIR_TEMP > /dev/null 2>&1
test ! -d "$DIR_TEMP" && echo "Error: nao foi possivel descompactar." && clearTemp && exit

# Lista flavors existentes
flavors=($(ls $LOCALE_FLAVORS))
for (( i=0; i < ${#flavors[@]}; i++ )); do
    echo "[$i] - ${flavors[$i]}"
done

# Usuario entra com o flavor
echo -n "Escolha o flavor destino: "
read flavor_escolhido
echo
if ! [[ $flavor_escolhido =~ ^[0-9]+$ ]]; then
    echo "Error: opcao invalida"
    clearTemp
    exit
fi

############ [ Copiando pastas ] ############
flavor_destino="$LOCALE_FLAVORS/${flavors[$flavor_escolhido]}"
files_source=($(ls $FOLDER_SOURCE))

# Percorre pasta por pasta para copiar
for folder in "${files_source[@]}"
do
    is_copy=1
    # Verifica se esta na pasta de ignorados
    for isf in "${IGNORE_SOURCE_FOLDERS[@]}"
    do
        if [[ "$folder" == "$isf" ]]; then
            is_copy=0
        fi
    done

    # Copia caso nao ignorado
    if [[ $is_copy == 1 ]]; then
        echo ">> Copiando $folder"
        res_locale=$(renameDirAndroidToRes $folder)

        ##### RENOMEIA PASTA/ARQUIVOS #####
        case $folder in
            #"name_folder")
            #    renameFiles "$res_locale" "contains_name_file" "new_name_file"
            #;;
        esac
        ###################################

        copyDir $res_locale $flavor_destino
    fi
done
#############################################

echo
echo "[ Finalizado com sucesso ]"
echo "OBS: Confira o resultado e remova os unversioned files no git, cuidado pois os assert's novos estÃ£o lÃ¡, atenÃ§Ã£o tambÃ©m a extenÃ§Ã£o diferente."
clearTemp