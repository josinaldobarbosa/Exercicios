package exercicio4;

import java.util.Random;

public class Utils {
	
	// Retornar um valor de 1 a max
	public static int valorRandomico(int max) {
		Random r = new Random();
		return (r.nextInt(max) + 1);
	}

}
