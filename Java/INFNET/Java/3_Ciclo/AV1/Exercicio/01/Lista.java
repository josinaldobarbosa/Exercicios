import java.util.Random;

public class Lista {

	public static final int TOTAL_NUMEROS = 1000;
	public static final int MAX_RANDOM    = 11; // 0 a 10

	private int lista[] = new int[TOTAL_NUMEROS];

	public int[] getLista() {
		return lista;
	}

	// 1º Construtor
	public Lista(int lista[]) {
		if(lista.length == TOTAL_NUMEROS) {
			this.lista = lista;
		}
	}

	// 2º Construtor
	public Lista() {
		for(int i=0;i < TOTAL_NUMEROS;i++) {
			this.lista[i] = intRandom(MAX_RANDOM);
		}
	}

	/* Exibe trio */
	public void exibeTrio() {
		final int trio = 3;
		int total      = 0;
		int anterior   = this.lista[0];
		int contador   = 1;

		for(int i=1;i < TOTAL_NUMEROS;i++) {
			if(anterior == this.lista[i]){
				contador++;
			}else{
				contador = 1;
			}
			if(contador == trio){
				total++;
				contador = 1;
			}
			anterior = this.lista[i];
		}

		// Exibe
		System.out.println("Total de trio foi: " + total);
	}

	/* Exibe Sequencia(mais de dois) */
	public void exibeSequencia() {
		final int dois = 2;
		int total      = 0;
		int anterior   = this.lista[0];
		int contador   = 1;

		for(int i=1;i < TOTAL_NUMEROS;i++) {
			if(anterior == this.lista[i]){
				contador++;
			}else{
				contador = 1;
			}
			if(contador == dois){
				total++;
			}
			anterior = this.lista[i];
		}

		// Exibe
		System.out.println("Sequências de números iguais foi: " + total);
	}

	public static int intRandom(int max) {
		Random r = new Random();
		return r.nextInt(max);
	}

}
