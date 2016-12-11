#include <stdio.h>
#include <string.h>

// Autor: Josinaldo A.Barbosa

const int tamanho_arvore;
const char desenho[];
const int fim = 0;

void pede_tamanho(){
    printf("Tamanho da arvore(minimo de 6, maximo depende do tamanho do terminal): ");
    scanf("%d",&tamanho_arvore);
}

void pede_caracteres(){
    printf("Caracteres de desenho(2 caracteres!, ex.:01): ");
    scanf("%s",desenho);
}

void arvore_topo(int fim_arvore){
    int i;
    // Espaço
    printf("\n\n");
    // Espaço a esquerda do topo
    for(i=tamanho_arvore;i>=fim_arvore;i--){
        printf(" ");
    }
    // Topo
    printf("()\n");
}

void arvore_meio(int fim_arvore){
    int i, j;
    while(fim_arvore < tamanho_arvore){
        // Espaços a esquerda
        for(j=tamanho_arvore;j>=fim_arvore;j--){
            printf(" ");
        }
        // Desenho da árvore
        for(i=0;i<=fim_arvore;i++){
            printf("%s", desenho);
        }
        // Espaços a direita
        for(j=tamanho_arvore;j>=fim_arvore;j--){
            printf(" ");
        }
        printf("\n");
        fim_arvore++;
    }
}

void arvore_base(){
    int fim_base = fim;
    const int base_arvore  = tamanho_arvore/6;
    int i;
    while(fim_base < base_arvore){
        // Desenha espaços a esquerda
        for(i=0;i<=tamanho_arvore-base_arvore;i++){
            printf(" ");
        }
        // Desenho da árvore
        for(i=0;i<=base_arvore;i++){
            printf("%s", desenho);
        }
        printf("\n");
        fim_base++;
    }
    // Espaço
    printf("\n\n");
}

main(){

    int fim_arvore = fim;

    // Titulo
    printf("/* Arvore de natal */\n");

    // Pede tamanho da árvore
    pede_tamanho();

    // Pede caracteres de desenho
    pede_caracteres();

    // Exibe topo da árvore
    arvore_topo(fim_arvore);

    // Exibe meio da árvore
    arvore_meio(fim_arvore);

    // Base da árvore
    arvore_base();

}
