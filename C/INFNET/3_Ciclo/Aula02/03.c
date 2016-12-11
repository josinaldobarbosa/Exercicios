#include <stdio.h>

/*
    3. Faça um programa que leia dois arquivos texto e gere um terceiro arquivo que seja a concatenação dos arquivos lidos.
*/

main(){

    FILE *file1;
    char nome_file1[50];
    FILE *file2;
    char nome_file2[50];
    FILE *file3;
    char nome_file3[50];

    printf("Nome arquivo 1(.txt): ");
    gets(nome_file1);
    printf("Nome arquivo 2(.txt): ");
    gets(nome_file2);
    printf("Nome arquivo copiado(.txt): ");
    gets(nome_file3);

    file1 = fopen(nome_file1, "r");
    file2 = fopen(nome_file2, "r");

    // Verifica se existem
    if((file1 != NULL) && (file2 != NULL)){
        file3 = fopen(nome_file3, "a"); // Arquivo destino

        printf("\nCopiando arquivo 1...\n");
        int buffer = fgetc(file1); // Ler cada caractere
        // Repede um caracter por vez até acabar
        while(buffer != EOF){
            fputc(buffer, file3); // Grava caractere
            buffer = fgetc(file1);
        }
        fclose(file1);

        fputc('\n', file3); // Quebra de linha

        printf("Copiando arquivo 2...\n");
        buffer = fgetc(file2);
        while(buffer != EOF){
            fputc(buffer, file3);
            buffer = fgetc(file2);
        }
        fclose(file2);

        printf("Copia finalizada.\n");

        fclose(file3);
    }else{
        printf("\nArquivo 1 ou 2, nao foi encontrado\n");
    }

}
