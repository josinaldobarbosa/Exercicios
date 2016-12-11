#include <stdio.h>
#include <string.h>

/*
    6. Faça um programa que leia uma palavra do teclado e pesquise quantas vezes essa palavra aparece em um arquivo texto.
*/

main(){

    char file_name[50], palavra[50];

    printf("Nome do arquivo(.txt): ");
    gets(file_name);
    printf("Palavra para pesquisar: ");
    gets(palavra);

    FILE *file = fopen(file_name, "r");
    // Verifica se arquivo existe
    if(file != NULL){
        int buffer = fgetc(file); // Pega caracter
        int total_vezes = 0;
        int indice      = 0;

        while(buffer != EOF){
            if(buffer == palavra[indice]){ // Caracter igual ao caracter da palavra
                indice++;
                if(indice == strlen(palavra)){
                    total_vezes++;
                    indice = 0;
                }
            }else{
                indice = 0;
            }
            buffer = fgetc(file);
        }
        fclose(file);

        printf("\nTotal de vezes: %d\n", total_vezes);
    }else{
        printf("\nErro: arquivo nao encontrado.\n");
    }

}
