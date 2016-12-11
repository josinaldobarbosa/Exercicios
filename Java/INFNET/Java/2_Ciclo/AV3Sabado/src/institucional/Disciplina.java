package br.com.infnet.institucional;

public class Disciplina {
	private String 	nome;
	private String 	horario;
	private Professor 	professor;
	private int[] 		nota = new int[3];

	// Cria disciplina
	public static Disciplina criaDisciplina(String nome, String horario, Professor professor, int nota[]){
		// instancia disciplina
		Disciplina dis = new Disciplina();
		dis.setNome(nome);
		dis.setHorario(horario);
		dis.setProfessor(professor);
		dis.setNota(nota);
		return dis;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public int getNota(int indice) {
		return nota[indice];
	}

	public int[] getNotaVetor() {
		return nota;
	}

	public void setNota(int nota[]) {
		this.nota = nota;
	}

}
