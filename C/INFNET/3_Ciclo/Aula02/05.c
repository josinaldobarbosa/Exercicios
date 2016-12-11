#include <stdio.h>

/*
    5. Faça um programa que leia um arquivo texto e mostre o total de cada vogal encontrada no arquivo, ou seja, o número de as, es, is, os e us.
*/

main(){

    char file_name[50];
    int a = 0,
        e = 0,
        i = 0,
        o = 0,
        u = 0;

    printf("[ Contagem de vogais ]\n");
    printf("Nome do arquivo(.txt): ");
    gets(file_name);

    FILE *file = fopen(file_name, "r");

    if(file != NULL){
        printf("\nLendo arquivo...\n\n");
        int buffer = fgetc(file); // Pega primeiro caracter
        while(buffer != EOF){
            switch(buffer){
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
            buffer = fgetc(file); // Pega outro caracter
        }
        fclose(file);

        printf("Total de a: %d\n", a);
        printf("Total de e: %d\n", e);
        printf("Total de i: %d\n", i);
        printf("Total de o: %d\n", o);
        printf("Total de u: %d\n", u);

    }else{
        printf("\nErro: arquivo nao encontrado.\n");
    }

}
