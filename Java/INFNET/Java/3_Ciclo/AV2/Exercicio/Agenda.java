import java.util.ArrayList;

public class Agenda {
	private String nome;
	private ArrayList<Contato> contato;

	// Construtor
	public Agenda(String nome, ArrayList<Contato> contato) {
		this.nome = nome;
		this.contato = contato;
	}

	// Get's
	public String getNome() {
		return nome;
	}

	public ArrayList<Contato> getContato() {
		return contato;
	}

}
