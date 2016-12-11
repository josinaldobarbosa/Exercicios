#include <stdio.h>

/*
    11.	Faça um programa que leia do teclado o número do aluno e mostre a sua média a partir do arquivo criado no exercício anterior.
        O programa deverá evitar acessos a registros fora do arquivo.
*/

const int total_alunos = 6;
const int total_notas  = 3;

typedef struct {
        char nome[50];
        int  notas[3];
} tp_aluno;

main() {

    tp_aluno alunos[total_alunos];

    FILE *arq = fopen("alunos.pqp", "rb");

    if(arq == NULL){
        printf("Erro ao abrir arquivo.\n");
    } else {
        int buffer = fread(alunos, sizeof(tp_aluno), total_alunos, arq);
        if(buffer == total_alunos) {
            printf("Total de alunos: %d\n", total_alunos);
            printf("Digite o numero do aluno: ");
            int n, i;
            scanf("%d", &n);
            n -= 1;
            if((n < 0) || (n > total_alunos-1)) {
                printf("\nErro, aluno inexistente.\n");
            } else {
                printf("\nAluno: %s", alunos[n].nome); // Nome
                float notas_aluno = 0, media_aluno;
                for(i=0;i < total_notas;i++) {
                    notas_aluno += alunos[n].notas[i];
                }
                media_aluno = notas_aluno / total_notas; // Média
                printf("\nMedia: %2.1f\n", media_aluno);
            }
        } else {
            printf("Foram lidos apenas %d elementos\n", buffer);
        }
        fclose(arq);
    }

}
