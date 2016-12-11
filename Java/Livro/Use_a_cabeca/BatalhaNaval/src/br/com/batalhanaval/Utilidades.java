package br.com.batalhanaval;

import java.util.Random;


public class Utilidades {
	/* Utilidades do programa */

	// Inteiro aleatório com tamanho máximo
	public static int intRandom(int tamanho){
		Random random = new Random();
		return random.nextInt(tamanho);
	}

	// Boolean aleatório
	public static boolean booleanRandom(){
		Random random = new Random();
		return random.nextBoolean();
	}

}
