
public class MetacaracteresDeFronteira {

	public static void main(String[] args) {

		/*  METACARACTERES DE FRONTEIRA
		 *
		 *  ^	inicia
		 *  $	finaliza
		 *  |	ou
		 *
		 **/

		// Exemplo ^
		String texto = "Formula 1";
		String regex = "^For.*";
		System.out.println("1: " + texto.matches(regex));

		// Exemplo $
		texto = "Formula 1";
		regex = ".* 1$";
		System.out.println("2: " + texto.matches(regex));

		// Exemplo |
		texto = "verdadeiro";
		regex = "falso|verdadeiro";
		System.out.println("3: " + texto.matches(regex));

	}

}
