
public class Agrupadores {

	public static void main(String[] args) {

		/*  AGRUPADORES
		 *
		 *  [...]             	Agrupamento
		 *  [a-z]             	Alcance
		 *  [a-e][i-u]        	União
		 *  [a-z&&[aeiou]]	Interseção
		 *  [^abc]          	Exceção
		 *  [a-z&&[^m-p]	Subtração
		 *  \x                	Fuga literal
		 *
		 **/

		// Exemplo [...]
		String texto = "True";
		String regex = "[tT]rue|[fF]alse"; // t minusculo ou T maiusculo ou fFalse
		System.out.println("1: " + texto.matches(regex));

		// Exemplo [a-z]
		texto = "b";
		regex = "[a-z]"; // ex.:[0-9]
		System.out.println("2: " + texto.matches(regex));

		// Exemplo [a-e][i-u]
		texto = "madalena3";
		regex = "madalen[a-e][0-5]";
		System.out.println("3: " + texto.matches(regex));

		// Exemplo [a-z&&[aeiou]]
		texto = "i";
		regex = "[a-z&&[aeiou]]"; // true caso esteja entre a-z e seja aeiou
		System.out.println("4: " + texto.matches(regex));

		// Exemplo [^abc]
		texto = "olho";
		regex = "[^abc]lho";
		System.out.println("5: " + texto.matches(regex));

		// Exemplo [a-z&&[^m-p]]
		texto = "q";
		regex = "[a-z&&[^m-p]]"; // true caso esteja entre a-z e não esteja entre m-p
		System.out.println("6: " + texto.matches(regex));

		// Exemplo \x
		texto = ".";
		regex = "\\.";
		System.out.println("7: " + texto.matches(regex));

	}

}
