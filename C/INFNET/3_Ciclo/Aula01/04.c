#include <stdio.h>
#include <string.h>
#include <limits.h>

/*
    4.	Faça um programa que processe as informações abaixo, sendo que cada linha representa um registro de aluno com o nome e suas notas.
    O programa deverá mostrar a média de cada aluno, com seu nome, e a média da turma. Além disso, o programa deverá mostrar o melhor aluno da turma.
        Luiz     5  7  4
        Paulo    5  6  7
        Maria    3  5  2
        Luiza    4  5  6
        Felipe   8  9  7
        Fabiana  2  6  4
*/

const int total_alunos = 6;
const int total_notas  = 3;

typedef struct {
    char nome[255];
    int  notas[3];
} Aluno;

void cadastra_aluno(Aluno *aluno) {
    // Luiz
    strcpy(aluno[0].nome, "Luiz");
    aluno[0].notas[0] = 5;
    aluno[0].notas[1] = 7;
    aluno[0].notas[2] = 4;
    // Paulo
    strcpy(aluno[1].nome, "Paulo");
    aluno[1].notas[0] = 5;
    aluno[1].notas[1] = 6;
    aluno[1].notas[2] = 7;
    // Maria
    strcpy(aluno[2].nome, "Maria");
    aluno[2].notas[0] = 3;
    aluno[2].notas[1] = 5;
    aluno[2].notas[2] = 2;
    // Luiza
    strcpy(aluno[3].nome, "Luiza");
    aluno[3].notas[0] = 4;
    aluno[3].notas[1] = 5;
    aluno[3].notas[2] = 6;
    // Felipe
    strcpy(aluno[4].nome, "Felipe");
    aluno[4].notas[0] = 8;
    aluno[4].notas[1] = 9;
    aluno[4].notas[2] = 7;
    // Fabiana
    strcpy(aluno[5].nome, "Fabiana");
    aluno[5].notas[0] = 2;
    aluno[5].notas[1] = 6;
    aluno[5].notas[2] = 4;
}

void calcula_media(Aluno *aluno){
    int i, j;
    float media_notas, media_turma = 0, melhor_aluno_media = INT_MIN;
    char melhor_aluno_nome[255];

    for(i=0;i < total_alunos;i++){
        media_notas = 0;
        for(j=0;j < total_notas;j++){
            media_notas += aluno[i].notas[j];
        }
        media_notas = (float) media_notas / total_notas;
        media_turma += media_notas;
        printf("Nome: %s\n", aluno[i].nome);
        printf("Media das notas: %.1f\n", media_notas);
        // Verifica melhor aluno
        if(media_notas > melhor_aluno_media){
            melhor_aluno_media = media_notas;
            strcpy(melhor_aluno_nome, aluno[i].nome);
        }
    }
    media_turma = (float) media_turma / total_alunos;
    printf("\nMedia da turma: %.1f\n", media_turma);

    printf("\nMelhor aluno eh: %s\n", melhor_aluno_nome);
    printf("Com media: %.1f\n", melhor_aluno_media);
}

main(){

    Aluno alunos[total_alunos];

    cadastra_aluno(&alunos);

    calcula_media(&alunos);

}
