
public class Principal {

	public static void main(String[] args) {
	
		// Existem 5 construtores sobrecarregados na classe String

		// Heap (Objeto)
		String nome1 = new String ("Infnet");
		String nome2 = new String ("Infnet");
		System.out.println(nome1 == nome2);

		// Poll (Verifica se existe)
		String nome3 = "Infnet";
		String nome4 = "Infnet";
		System.out.println(nome3 == nome4);

		System.out.println("Infnet"); // <- Cria no Poll (caso igual a um existente já está criado)

		// Formas de criar String
		char[] nome = new char[]{'I', 'N', 'F', 'N', 'E', 'T'};
		String nomeDaInstituicao = new String(nome);
		
		// StringBuffer é mutável e tem todos os seus métodos synchronized
		StringBuffer sBuffer = new StringBuffer("Infnet");
		sBuffer.append(" - instituto!"); // Não cria uma nova string, concatena a existente
		String nomeDaInstituicao2 = new String(sBuffer);
		
		// StringBuilder é similar a StringBuffer mas seus métodos não são synchronized
		StringBuilder sBuilder = new StringBuilder("Infnet");
		sBuilder.append(" - instituto"); // Não cria uma nova string, concatena a existente
		String nomeDaInstituicao1 = new String(sBuilder);

		// Pega caractere por indice, charAt(int)
		String nome5 = new String("Infnet");
		System.out.println(nome5.charAt(0)); // imprime “I”

		// Pega posição do char/string, permitidos: indexOf(char), indexOf(String), indexOf(char, int) ou indexOf(String,int)
		// indexOf() retorna -1 caso não encontre
		System.out.println(nome5.indexOf('I')); // char, imprime “0”
		System.out.println(nome5.indexOf("N")); // String, imprime “1”
		System.out.println(nome5.indexOf("N", 2)); // String, imprime “3”

		// Pegando por intervalos substring, substring(int) ou substring(int, int)
		String nome6 = "Infnet";
		String parte  = nome6.substring(2); // Pega da posição 2 até o final = "fnet"
		String parte2 = nome6.substring(2,4); // Pega da posição 2 até posição 4-1 = "fn"

		// trim(), retira espaços em brancos no início e no final
		String nome7 = " Inf net ";
		System.out.println(nome7.trim());

}
