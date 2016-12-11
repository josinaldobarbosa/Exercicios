public class Palindromo {

	public static void main(String[] args) {

		String palavra = "natan";

		System.out.println("São palindromo? " + isPalindromo(palavra));

	}

	private static boolean isPalindromo(String palavra) {
		int tamanhoPalavra = palavra.length();

		for (int i = 0; i < tamanhoPalavra; i++) {
			int ordemInversa = ((tamanhoPalavra - i) - 1);
			// Log
			System.out.println(i + "("+palavra.charAt(i)+")" + " - " + ordemInversa + "("+palavra.charAt(ordemInversa)+")");
			if (palavra.charAt(i) != palavra.charAt(ordemInversa)) {
				return false;
			}
		}

		return true;
	}

}
