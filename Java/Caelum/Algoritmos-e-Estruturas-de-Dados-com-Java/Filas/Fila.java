import java.util.LinkedList;
import java.util.List;

public class Fila<T> {

	private List<T> objetos = new LinkedList<T>();

	public void insere(T t) {
		// Insere um Aluno (coloca um aluno no fim da Fila).
		this.objetos.add(t);
	}

	public T remove() {
		// Remove um Aluno (retira o aluno que está no começo da Fila).
		return this.objetos.remove(0);
	}

	public boolean vazia() {
		// Informa se a Fila está vazia.
		return this.objetos.size() == 0;
	}

}
