
public class Modificadores {

	public static void main(String[] args) {

		/*  MODIFICADORES
		 * 
		 *  (?i), Ignora maiúscula e minúscula
		 *  (?x), Permite inclusão de espaços e comentários
		 *  (?m), Multilinhas
		 *  (?s), Dottal(Faz com que o caractere encontre novas linhas)
		 *  
		 **/

		// Pode-se usar mais de um modificador, ex.: (?ixms)

		// Exemplo (?i)
		String texto = "Café";
		String regex = "(?i)café";
		System.out.println("1: " + texto.matches(regex));

		// Exemplo (?x)
		regex = "(?ix)ca fé";
		System.out.println("2: " + texto.matches(regex));

	}

}
