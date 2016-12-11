import java.util.HashMap;

public class Estoque {

	private HashMap<Integer, Animal> estoque = new HashMap<Integer, Animal>();

	public void salvaNome(Integer index, Animal animal) {
		this.estoque.put(index, animal);
	}

	public void exibeTodos() {
		for(int i = 0; i < estoque.size(); i++) {
			System.out.println("-----------------------------");
			System.out.println("Nome: " + estoque.get(i).getNome());
		}
		System.out.println("-----------------------------");
	}

}
