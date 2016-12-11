package exercicio1;

/*
Exercicio 1: Faça um programa em Java capaz de imprimir a seguinte saída:
AAAAABBBBBCCCCCDDDDD. Para tal, seu programa deve disparar duas Threads. A Thread
1 deve imprimir as letras “A” e “C” e a Thread 2 deve imprimir as letras “B” e “D”. Ambas
Threads devem ser disparadas ao mesmo momento (ou seja, os comandos “start()” devem
vir um logo após o outro). 
*/
public class Principal {
	
	

	public static void main(String[] args) {
		
		new ExibeLetra(5, 'A', 'C').start();
		new ExibeLetra(5, 'B', 'D').start();
		
	}

}
