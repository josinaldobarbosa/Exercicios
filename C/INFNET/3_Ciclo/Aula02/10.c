#include <stdio.h>
#include <limits.h>
#include <string.h>

/*
    10.	Faça um programa que processe o arquivo binário criado no exercício anterior.
        O programa deverá mostrar a média de cada aluno, com seu nome, e a média da turma.
        Além disso, o programa deverá mostrar o melhor aluno da turma.
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

    if(arq == NULL) {
        printf("Erro ao abrir arquivo.\n");
    } else {

        int buffer = fread(alunos, sizeof(tp_aluno), total_alunos, arq);

        if(buffer == total_alunos) {
            printf("Lidos %d registros com sucesso\n\n", buffer);
            int i, j, notas_aluno = 0, melhor_aluno, nota_melhor_aluno = INT_MIN;
            float media_aluno, media_turma = 0;

            for(i=0;i < total_alunos;i++) {
                printf("%s: ", alunos[i].nome); // Exibe nome

                for(j=0;j < total_notas;j++) {
                   notas_aluno += alunos[i].notas[j]; // soma notas
                }

                media_aluno = (float) notas_aluno / total_notas; // media notas

                // Melhor aluno
                if(media_aluno > nota_melhor_aluno) {
                    melhor_aluno = i;
                    nota_melhor_aluno = media_aluno;
                }

                printf("media: %2.1f\n", media_aluno);
                media_turma += media_aluno;
                notas_aluno = 0; // zera
            }

            media_turma /= total_alunos;
            printf("\nMedia da turma: %2.1f\n", media_turma);
            printf("Melhor aluno: %s\n", alunos[melhor_aluno].nome);

        } else {
            printf("Foram lidos apenas %d elementos\n", buffer);
        }
        fclose(arq);
    }

}
