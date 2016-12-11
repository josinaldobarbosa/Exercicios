#include <stdio.h>
#include <string.h>

/*
    3.	Faça um programa que crie um registro de um funcionário com as seguintes informações: nome, identidade, data de nascimento e salário.
    O programa deve inicializar a estrutura a partir de dados digitados pelo usuário e depois mostra-la na tela.Utilize subprogramas e passagem de parâmetros.
    * Obs: o exercicio 2 é a mema coisa so que sem as funções.
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
    int salario;
} tp_funcionario;

void cria_funcionario(tp_funcionario *fun){
    printf("Digite o nome do funcionario: ");
    gets(fun->nome); // Gets pra evitar bug ao colocar espaço
    printf("Digite a idade do funcionario: ");
    scanf("%d", &fun->idade);
    printf("Digite o dia de nascimento: ");
    scanf("%d", &fun->data_nascimento.dia);
    printf("Digite o mes de nascimento: ");
    scanf("%d", &fun->data_nascimento.mes);
    printf("Digite o ano de nascimento: ");
    scanf("%d", &fun->data_nascimento.ano);
    printf("Digite o salario: ");
    scanf("%d", &fun->salario);
}

void exibe_funcionario(tp_funcionario fun){
    printf("\n[ Exibe dados ]\n\n");
    printf("Nome: %s\n", fun.nome);
    printf("Idade: %d\n", fun.idade);
    printf("Data nascimento: %d/%d/%d\n", fun.data_nascimento.dia, fun.data_nascimento.mes, fun.data_nascimento.ano);
    printf("Salario: %d\n", fun.salario);
}

main(){

    tp_funcionario funcionario;

    cria_funcionario(&funcionario);

    exibe_funcionario(funcionario);

}
