package exercicio4;

import java.util.List;

/*
 Exercicio 4: Implemente uma corrida de sapos utilizando Threads em Java. A corrida deve
 comportar 10 participantes, cada um sendo executado em uma Thread diferente, e cada
 sapo deve possuir uma distância de pulo entre 1 e 3 e uma resistência entre 1 e 5. Cada
 vez que o sapo der um número de passos igual à sua resistência, ele deve parar por meio
 segundo. A cada pulo, o sapo deve andar uma distância igual à sua distância de pulo. O
 sapo termina a corrida ao percorrer uma distância igual a 100. Depois que todos os sapos
 terminarem, exiba o resultado na tela.
*/
public class Principal {
	
	private static final int TOTAL_PARTICIPANTES = 10;

	public static void main(String[] args) {
		
		Corrida corrida = new Corrida(TOTAL_PARTICIPANTES);
		corrida.inicia(new StatusCorrida() {
			@Override
			public void onStart() {
				System.out.println("[ CORRIDA INICIADA ]");
			}
			
			@Override
			public void onColocado(Sapo sapo, int posicao) {
				showColocado(sapo, posicao);
			}
			
			@Override
			public void onFinish(List<Sapo> sapos) {
				System.out.print("\n[ CORRIDA FINALIZADA ]");
			}
		});

	}
	
	private static void showColocado(Sapo sapo, int posicao) {
		System.out.println();
		System.out.println("[------------- " + posicao + "º -------------]");
		System.out.println();
		System.out.println(sapo);
	}

}
