
public class Quantificadores {

	public static void main(String[] args) {

		/*  QUANTIFICADORES
		 *
		 *  X{n}	X, exatamente n vezes
		 *  X{n,}	X, pelo menos n vezes
		 *  X{n, m} 	X, pelo menos n mas não mais do que m vezes
		 *  X?		X, 0 ou 1 vez
		 *  X*		X, 0 ou + vezes
		 *  X+		X, 1 ou + vezes
		 *
		 **/

		// Exemplo {n}
		String texto = "12";
		String regex = "\\d{2}";
		System.out.println("1: " + texto.matches(regex));

		// Exemplo {n,}
		texto = "123";
		regex = "\\d{2,}";
		System.out.println("2: " + texto.matches(regex));

		// Exemplo {n, m}
		texto = "abc";
		regex = "[a-z]{1,3}";
		System.out.println("3: " + texto.matches(regex));

		// Exemplo ?
		texto = "1";
		regex = "\\d?";
		System.out.println("4: " + texto.matches(regex));

		// Exemplo *
		texto = "";
		regex = "\\d*";
		System.out.println("5: " + texto.matches(regex));

		// Exemplo +
		texto = "";
		regex = "\\d+";
		System.out.println("6: " + texto.matches(regex));

	}

}
