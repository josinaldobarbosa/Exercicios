#include <stdio.h>
#include <string.h>

/*
    1. Faça um programa que leia um arquivo texto e mostre o arquivo na tela com as linhas numeradas, a partir da linha um.
    O programa deverá ler o arquivo caractere a caractere.
*/

main(){

    char arq_nome[50];
    printf("Nome do arquivo(.txt): ");
    gets(arq_nome);

    FILE *file = fopen(arq_nome, "r");
    if(file != NULL){
        // Arquivo encontrado
        printf("\nArquivo encontrado:\n\n");
        int buffer = fgetc(file); // Ler um caracter
        int lista = 1;
        printf("%d: ", lista);
        while(buffer != EOF){
            putchar(buffer);
            // Verifica quebra de linha
            if(buffer == '\n'){
                lista++;
                printf("%d: ", lista);
            }
            buffer = fgetc(file); // Ler proximo caracter
        }
        printf("\n");
    }else{
        // Arquivo não encontrado
        printf("\nErro: arquivo nao encontado.\n");
    }
    fclose(file);

}
