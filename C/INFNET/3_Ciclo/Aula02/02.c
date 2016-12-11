#include <stdio.h>
#include <string.h>

/*
    2. Faça um programa que leia um arquivo texto e mostre o arquivo na tela com as linhas numeradas, a partir da linha um.
    O programa deverá ler o arquivo em linhas de no máximo 80 caracteres.
*/

main(){

    char arq_nome[50];
    printf("Nome do arquivo(.txt): ");
    gets(arq_nome);

    FILE *file;
    file = fopen(arq_nome, "r");
    if(file != NULL){
        // Arquivo encontrado
        printf("\nArquivo encontrado:\n\n");
        int lista = 1;
        printf("%d: ", lista);
        int linha = 0;
        int buffer = fgetc(file); // Ler um caracter

        while(buffer != EOF){
            if(linha <= 80){
                putchar(buffer);
                // Verifica quebra de linha
                if(buffer == '\n'){
                    lista++;
                    printf("%d: ", lista);
                    linha = 0;
                }
                buffer = fgetc(file); // Ler proximo caracter
                linha++;
            }else{
                printf(" (stop) - Linha excedeu o limite.");
                do{
                    buffer = fgetc(file); // Ler proximo caracter
                    if(buffer == EOF){
                        break;
                    }
                }while(buffer != '\n');
                linha = 0;
            }
        }
        printf("\n");

    }else{
        // Arquivo não encontrado
        printf("\nErro: arquivo nao encontado.\n");
    }
    fclose(file);

}
