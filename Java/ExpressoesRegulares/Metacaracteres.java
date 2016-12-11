
public class Metacaracteres {

	public static void main(String[] args) {

		/*  METACARACTERES
		 * 
		 *  .	qualquer caracter
		 *  \d	digitos      	  	[0-9]
		 *  \D  não é dígito      	[!0-9]
		 *  \s  espaços, tabulações	[\t\n\x0B\f\r]
		 *  \S  não é espaço      	[^\s]
		 *  \w  letra             	[a-z A-Z 0-9]
		 *  \W  não é letra		[^\w]
		 * 
		 * */

		// Exemplo .
		String texto = "@";
		String regex = ".";
		System.out.println("1: " + texto.matches(regex));

		// Exemplo \d
		texto = "5";
		regex = "\\d";
		System.out.println("2: " + texto.matches(regex));

		// Exemplo \D
		texto = "5";
		regex = "\\D";
		System.out.println("3: " + texto.matches(regex));

		// Exemplo \s
		texto = " ";
		regex = "\\s";
		System.out.println("4: " + texto.matches(regex));

		// Exemplo \S
		texto = " ";
		regex = "\\S";
		System.out.println("5: " + texto.matches(regex));

		// Exemplo \w
		texto = "@";
		regex = "\\w";
		System.out.println("6: " + texto.matches(regex));

		// Exemplo \W
		texto = "@";
		regex = "\\W";
		System.out.println("7: " + texto.matches(regex));

	}

}
