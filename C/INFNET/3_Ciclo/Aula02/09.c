#include <stdio.h>
#include <string.h>

/*
    9.	Faça um programa que crie um arquivo binário com as informações abaixo,
    sendo que cada linha representa um registro de aluno com o nome e suas notas.
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
        char nome[50];
        int  notas[3];
} tp_aluno;

void cadastra_aluno(tp_aluno *aluno) {
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

main() {

    tp_aluno alunos[total_alunos];
    cadastra_aluno(&alunos);

    // Cria arquivo
    char nome_arq[50] = "alunos.pqp";
    FILE *arq = fopen(nome_arq, "wb");

    if(arq == NULL) {
        printf("Erro ao criar arquivo.\n");
    } else {
        int i;
        for(i=0;i < total_alunos;i++) {
            int grava = fwrite(&alunos[i], sizeof(tp_aluno), 1, arq);
        }
        fclose(arq);
        printf("Arquivo salvo, \"%s\".\n", nome_arq);
    }

}
