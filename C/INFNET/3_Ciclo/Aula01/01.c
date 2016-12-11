#include <stdio.h>

/*
    1. Faça um programa que crie um registro de um funcionário com as seguintes informações: nome, identidade, data de nascimento e salário.
       O programa deve inicializar a estrutura e depois mostra-la na tela.
*/

typedef struct {
    int dia;
    int mes;
    int ano;
} tp_data_nascimento;

typedef struct {
    char nome[255];
    int  idade;
    tp_data_nascimento data_nascimento;
    double salario;
} tp_funcionario;

main(){

    // Inicializa
    tp_funcionario funcionario = {"Josinaldo A.Barbosa", 21, {10,10,1993}, 9999};

    // Mostra
    printf("[ Dados funcionarios ]\n\n");
    printf(" Nome: %s\n", funcionario.nome);
    printf(" Idade: %d\n", funcionario.idade);
    printf(" Data nascimento: %d/%d/%d\n", funcionario.data_nascimento.dia, funcionario.data_nascimento.mes, funcionario.data_nascimento.ano);
}
