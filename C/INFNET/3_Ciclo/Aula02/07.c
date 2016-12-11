#include <stdio.h>

/*
    7. Faça um programa que leia uma sequência de nomes no formato “nome sobrenome” e armazene-os em um arquivo texto.
       A lista de nomes termina com um nome igual ao ponto.
*/

main(){

    char nome[255];
    char file_name[50];

    printf("Qual o nome do arquivo para salvar?(.txt): ");
    gets(file_name);
    printf("\n");
    FILE *file = fopen(file_name, "w");

    if(file != NULL){
        int fim = 0, cont = 1;

        // Loop para entrada e salvamento de dados até digitar ponto
        do{
            printf("Por favor, digite nome e sobrenome: ");
            fflush(stdin);
            gets(nome);

            if(strcmp (nome, ".") != 0){
                fprintf(file, "%s\n", cont, nome); // Salva nome
                cont++;
            }else{
                fim = 1;
            }
        }while(fim == 0);

    }else{
        printf("\nErro ao criar arquivo.\n");
    }
    fclose(file);

    printf("\nTerminado.\n");

}
