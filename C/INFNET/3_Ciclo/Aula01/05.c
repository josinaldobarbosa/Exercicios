#include <stdio.h>
#include <string.h>
#include <limits.h>

/*
    * registro de aluno com o nome e suas notas.
      O programa deverá mostrar a média de cada aluno, com seu nome, e a média da turma. Além disso, o programa deverá mostrar o melhor aluno da turma.
    * 5. Refaça o programa anterior para uma lista de alunos terminada com um nome igual ao ponto. A turma pode ter, no máximo, 50 alunos.
*/

const int max_alunos = 50;
int total_alunos = 0;
int total_notas  = 3;

typedef struct {
    char nome[255];
    int  notas[3];
} Aluno;

void cadastra_aluno(Aluno *aluno) {
    char nome[255];
    int fim = 0;
    do{
        if(total_alunos < max_alunos){
            printf("Por favor, digite um nome: ");
            fflush(stdin);
            gets(nome);
            if(strcmp (nome, ".") != 0){
                strcpy(aluno[total_alunos].nome , nome);
                int i;
                for(i=0;i < total_notas;i++){
                    printf("Por favor, digite a nota %d: ", i+1);
                    scanf("%d", &aluno[total_alunos].notas[i]);
                }
                total_alunos++;
            }else{
                printf("\nTerminado[.]\n\n");
                fim = 1;
            }
        }else{
            printf("\nTotal maximo[%d] de alunos atingido.\n\n", total_alunos);
            fim = 1;
        }
    }while(fim == 0);
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

    Aluno alunos[max_alunos];

    cadastra_aluno(&alunos);

    calcula_media(&alunos);

}
