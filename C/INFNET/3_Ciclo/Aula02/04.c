#include <stdio.h>

/*
    4. Faça um programa que leia um arquivo texto e mostre o total de bytes do arquivo.
    Faça o mesmo programa abrindo o arquivo como binário e verifique se houve alguma diferença. Se houver diferença, qual o motivo?
*/

main(){

    char file_name[50];

    printf("Nome do arquivo: ");
    gets(file_name);
    FILE *file1 = fopen(file_name, "r");

    if(file1 != NULL){
        int tamanho = 0;
        int buffer = fgetc(file1);
        while(buffer != EOF){
            tamanho += sizeof(buffer);
            buffer = fgetc(file1);
        }
        fclose(file1);
        printf("\nTamanho txt eh: %d bytes\n", tamanho);

        FILE *file2 = fopen(file_name, "rb");
        

    }else{
        printf("Erro: arquivo nao encontrado.");
    }

}
