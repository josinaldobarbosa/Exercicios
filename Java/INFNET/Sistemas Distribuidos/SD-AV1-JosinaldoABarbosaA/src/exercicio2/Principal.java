package exercicio2;

import java.util.ArrayList;
import java.util.List;

/*
 2. Faça um programa em Java capaz de somar uma matriz utilizando Threads. Cada
 Thread deve ser responsável por uma linha (dica: utilize um índice para informar à Thread
 qual linha ela deve processar) e no final uma outra Thread deve somar o resultado
 calculado pelas Threads anteriores e exibir o resultado.
*/
public class Principal {
	
	private static List<Long> somaLinhas = new ArrayList<Long>();

	public static void main(String[] args) {
		
		long[][] matriz1 = {{2, 3},
							{4, 1}};
		
		long[][] matriz2 = {{0, -1},
							{2 , 3}};
		
		// 2264
		//R: 2 + 2 + 6 + 4 = 14
		
		SomaListener somaListener = new SomaListener() {
			@Override
			public synchronized void soma(long result) {
				somaLinhas.add(result);
				System.out.println(result);
			}
			
			@Override
			public void resultado(long result) {
				System.out.println("Resultado: " + result);
			}
		};
		
		List<Thread> threads = new ArrayList<>();
		
		if (isValidMatriz(matriz1, matriz2)) {
			SomaMatriz sm;
			for (int linha = 0; linha < matriz1.length; linha++) {
				sm = new SomaMatriz(linha, matriz1, matriz2, somaListener);
				sm.start();
				threads.add(sm);
			}
			
			for (Thread t : threads) {
				try {
					t.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			new SomaResultado(somaLinhas, somaListener).start();
		}
		
	}
	
	private static boolean isValidMatriz(long[][] matriz1, long[][] matriz2) {
		return (matriz1.length == matriz2.length && matriz1[0].length == matriz2[0].length);
	}

}
