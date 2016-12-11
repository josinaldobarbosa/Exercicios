package estudando.av;

import java.util.ArrayList;
import java.util.Random;

public class PalavraAleatoria {

	private String palavra;
	private final int MIN = 4;
	private final int MAX = 10;

	Random randomize = new Random();

	// Construtor default
	public PalavraAleatoria() {
		this(true);
	}

	// Segundo construtor
	public PalavraAleatoria(boolean verifica) {

		int tamanhoPalavra = randomize.nextInt(MAX - MIN + 1) + MIN;

		if (verifica) {
			palavra = gerarPalavraMinusculo(tamanhoPalavra); // minusculo
		} else {
			palavra = geraPalavraMaiusculo(tamanhoPalavra); // maiusculo
		}
	}

	// Gera uma palavra em minusculo
	private String gerarPalavraMinusculo(int tamanho) {
		char[] retorno = new char[tamanho];
		String alfabeto = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < tamanho; i++) {
			int indice = randomize.nextInt(alfabeto.length());
			char letra = alfabeto.charAt(indice);
			retorno[i] = letra;
		}
		return String.copyValueOf(retorno);
	}

	// Gera uma palavra em maiusculo
	private String geraPalavraMaiusculo(int tamanho) {
		return gerarPalavraMinusculo(tamanho).toUpperCase();
	}

	// Recebe um inteiro N e retorna uma lista com N Palavras Aleatórias
	public ArrayList<String> listaPalavras(int quantidade) {
		ArrayList<String> retorno = new ArrayList<>();

		for (int i = 0; i < quantidade; i++) {
			int tamanhoPalavra = randomize.nextInt(MAX - MIN + 1) + MIN;
			if (randomize.nextBoolean()) {
				retorno.add(gerarPalavraMinusculo(tamanhoPalavra));
			} else {
				retorno.add(geraPalavraMaiusculo(tamanhoPalavra));
			}
		}

		return retorno;
	}

	public String getPalavra() {
		return palavra;
	}
}
