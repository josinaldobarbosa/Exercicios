package br.com.infnet.aluno;

import br.com.infnet.institucional.Disciplina;
import br.com.infnet.institucional.Professor;

public class Aluno {
	private int				matricula;
	private String			nome;
	private int				idade;
	private String			curso;
	private Disciplina[] 	disciplinas = new Disciplina[5];

	// Cria aluno
	public static Aluno criaAluno(int matricula, String nome, int idade, String curso, Disciplina dis[]){
		// instancia
		Aluno a = new Aluno();
		// salva
		a.setMatricula(matricula);
		a.setNome(nome);
		a.setIdade(idade);
		a.setCurso(curso);
		a.setDisciplinas(dis);
		return a;
	}

	// Cadastra disciplina
	public void cadastraDisciplina(Disciplina dis, int indice){
		this.disciplinas[indice] = dis;
	}

	// Calcula CR
	public static float calculaCR(Disciplina dis[]){
		float somaNotas, mediaNotas = 0, CR = 0;

		for(int i=0;i < dis.length;i++){
			somaNotas = 0;
			for(int j=0;j < dis[i].getNotaVetor().length;j++){
				somaNotas += dis[i].getNota(j);
			}
			mediaNotas += (somaNotas / dis[i].getNotaVetor().length);
		}

		CR = mediaNotas / dis.length;
		return CR;
	}

	// Professor mais malvado
	public static String maisMalvado(Disciplina dis[]){
		int maldade = Integer.MIN_VALUE;
		String nome = "";

		for(int i=0;i < dis.length;i++){
			int mal = dis[i].getProfessor().getMaldade();
			if(mal > maldade){
				maldade = dis[i].getProfessor().getMaldade();
				nome = dis[i].getProfessor().getNome();
			}
		}
		return nome;
	}

	// Aumenta 50% caso nota 0
	public static void maisMalvadoNotaZero(Disciplina dis[]){
		// instancia
		Professor prof = new Professor();

		for(int i = 0;i < dis.length;i++){
			for(int j=0;j < dis[i].getNotaVetor().length;j++){
				if(dis[i].getNota(j) == 0){
					int maldade50 = prof.aumentaMaldade50(dis[i].getProfessor().getMaldade());
					dis[i].getProfessor().setMaldade(maldade50);
				}
			}
		}
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Disciplina getDisciplinas(int indice) {
		return disciplinas[indice];
	}

	public Disciplina[] getDisciplinasVetor() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}

}
