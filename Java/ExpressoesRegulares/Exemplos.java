
public class Exemplos {

	public static void main(String[] args) {

		/* EXEMPLOS */

		// Validando CEP
		System.out.println("CEP: " + "12345-123".matches("\\d{5}-\\d{3}"));

		// Validando DATA
		System.out.println("DATA: " + "10/10/1993".matches("\\d{2}/\\d{2}/\\d{4}"));

		// Validando Nome Sobrenome(Começa com maiusculo, espaço, maiusculo)
		System.out.println("Nome Sobrenome: " + "Josinaldo Barbosa".matches("^[A-Z].* [A-Z].*"));

		// Validando Email
		System.out.println("Email: " + "nome.sobrenome@gmail.com.br".matches("[\\w _ .]+@[\\w .]+\\.[a-z]{2,3}$"));
		
	}

}
