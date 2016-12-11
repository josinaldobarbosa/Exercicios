import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {

		Person pessoa0 = new Person("Geraldo Nunes", 175);
		Person pessoa1 = new Person("Silva Andre"  , 578);
		Person pessoa2 = new Person("Andre Luis"   , 634);
		Person pessoa3 = new Person("Silva Andre"  , 578);

		ArrayList<Person> pessoas = new ArrayList<Person>();

		pessoas.add(pessoa0);
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);

		// Exibe todos
		for (Person p : pessoas) {
			System.out.println(p);
		}

		// Verifica se são iguais
		final int primeira = 1;
		final int segunda  = 3;

		if (pessoas.get(primeira).equals(pessoas.get(segunda))) {
			System.out.println("\nPessoas Iguais");
		} else {
			System.out.println("\nPessoas Diferentes");
		}

	}

}
