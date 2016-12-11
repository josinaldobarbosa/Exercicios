package exercicio1;

public class ExibeLetra extends Thread {
	private int repeticao;
	private char[] letras;
	
	private static long ultimaThread;
	
	public ExibeLetra(int totalRepeticoes, char... letras) {
		this.repeticao = totalRepeticoes;
		this.letras = letras;
	}
	
	@Override
	public void run() {
		//TODO: Repeti em for nas letras
		//TODO: Repeti em uma thread por vez
		for (int i = 0; i < letras.length; i++) {
			for (int repet = 0; repet < 1; repet++) {
				show(letras[i]);
			}
		}
	}
	
	private synchronized void show(char caracter) {
		System.out.println(caracter);
	}
	
}
