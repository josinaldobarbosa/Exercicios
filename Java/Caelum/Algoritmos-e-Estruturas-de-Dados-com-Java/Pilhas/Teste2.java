import java.util.Stack;

public class Teste2 {
	public static void main(String[] args) {

		Stack<Peca> pilha = new Stack<Peca>();

		Peca pecaInsere = new Peca();
		pilha.push(pecaInsere);

		Peca pecaRemove = pilha.pop();

		if (pilha.isEmpty()) {
			System.out.println("A pilha está vazia");
		}
	}
}
