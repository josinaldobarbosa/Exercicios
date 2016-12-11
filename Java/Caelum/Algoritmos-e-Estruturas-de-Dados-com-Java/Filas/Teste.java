public class Teste {

	public static void main(String[] args) {
		
		Fila<Aluno> fila = new Fila<Aluno>();

		Aluno aluno = new Aluno();
		fila.insere(aluno);

		Aluno alunoRemovido = fila.remove();

		if (fila.vazia()) {
			System.out.println("A fila está vazia");
		}
	}
}
