import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Animal> animal = new ArrayList<Animal>();

		animal.add(new Cachorro("Jack"));
		animal.add(new Humano("João"));
		animal.add(new Cachorro("Dog 1.0"));

		Estoque meuEstoque = new Estoque();

		for(int i = 0; i < animal.size(); i++) {
			meuEstoque.salvaNome(i, animal.get(i));
		}

		meuEstoque.exibeTodos();

	}

}
