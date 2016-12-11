import java.util.Scanner;

/**
 * Troco, Funcionários de empresas comerciais que trabalham como caixa tem uma
 * grande responsabilidade em suas mãos. A maior parte do tempo de seu
 * expediente de trabalho é gasto recebendo valores de clientes e, em alguns
 * casos, fornecendo troco. Seu desafio é fazer um programa que leia o valor
 * total a ser pago e o valor efetivamente pago, informando o menor número de
 * cédulas e moedas que devem ser fornecidas como troco. Deve-se considerar que
 * há: cédulas de R$100,00, R$50,00, R$10,00, R$5,00 e R$1,00; moedas de R$0,50,
 * R$0,10, R$0,05 e R$0,01.
 * 
 * http://dojopuzzles.com/problemas/exibe/troco/
 * 
 */
public class Troco {

	public static void main(String[] args) {
		/* Sem validações :P */
		Scanner in = new Scanner(System.in);
		
		System.out.print("Valor total a ser pago: ");
		double valorTotal = in.nextDouble();
		
		System.out.print("Valor pago: ");
		double valorPago = in.nextDouble();
		
		double troco = troco(valorTotal, valorPago);
		
		System.out.println("Troco é de: " + troco);
		
		System.out.println("\n-------------------------");
		exibeTrocoEmNotas(troco);
		System.out.println("-------------------------");
		
		in.close();
	}
	
	// Desconta o valor e retorna o troco
	private static double troco(double valorTotal, double valorPago) {
		return valorPago - valorTotal;
	}
	
	// Exibe o menor número de cédulas e moedas do troco
	private static void exibeTrocoEmNotas(double troco) {
		
		// Cédulas: R$100,00, R$50,00, R$10,00, R$5,00 e R$1,00
		double nota = 100;
		int cedulaCem = descontaNotas(troco, nota);
		troco = atualizaTroco(troco, cedulaCem, nota);
		exibeNota(nota, cedulaCem);
		
		nota = 50;
		int cedulaCinquenta = descontaNotas(troco, nota);
		troco = atualizaTroco(troco, cedulaCinquenta, nota);
		exibeNota(nota, cedulaCinquenta);
		
		nota = 10;
		int cedulaDeiz = descontaNotas(troco, nota);
		troco = atualizaTroco(troco, cedulaDeiz, nota);
		exibeNota(nota, cedulaDeiz);
		
		nota = 5;
		int cedulaCinco = descontaNotas(troco, nota);
		troco = atualizaTroco(troco, cedulaCinco, nota);
		exibeNota(nota, cedulaCinco);
		
		nota = 1;
		int cedulaUm = descontaNotas(troco, nota);
		troco = atualizaTroco(troco, cedulaUm, nota);
		exibeNota(nota, cedulaUm);
		
		// Moedas: R$0,50, R$0,10, R$0,05 e R$0,01
		nota = 0.50;
		int moedaCinquenta = descontaNotas(troco, nota);
		troco = atualizaTroco(troco, moedaCinquenta, nota);
		
		nota = 0.10;
		int moedaDez = descontaNotas(troco, nota);
		troco = atualizaTroco(troco, moedaDez, nota);
		
		nota = 0.05;
		int moedaCinco = descontaNotas(troco, nota);
		troco = atualizaTroco(troco, moedaCinco, nota);
		
		nota = 0.01;
		int moedaUm = descontaNotas(troco, nota);
		troco = atualizaTroco(troco, moedaUm, nota);
		
	}
	
	// Retorna a quantidade de notas possiveis
	private static int descontaNotas(double troco, double nota) {
		int totalNotas = 0;
		while(troco >= nota) {
			totalNotas++;
			troco -= nota;
		}
		return totalNotas;
	}
	
	// Atualiza o troco com base na quantidade de notas e o valor dela
	private static double atualizaTroco(double troco, int totalNotas, double valorNotas) {
		if(totalNotas > 0) {
			troco -= totalNotas * valorNotas;
		}
		return troco;
	}
	
	// Exibe a nota
	private static void exibeNota(double nota, int quantidade) {
		if(quantidade > 0) {
			System.out.println(" Valores de R$" + nota + " = " + quantidade);
		}
	}

}
