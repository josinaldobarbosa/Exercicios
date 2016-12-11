package br.com.infnet.programa;

import br.com.infnet.aluno.Aluno;
import br.com.infnet.institucional.Disciplina;
import br.com.infnet.institucional.Professor;

public class Main {

	/**
	 * @author Josinaldo de Albuquerque Barbosa
	 */

	public static void main(String[] args) {
		// Cria professor
		Professor prof[] = new Professor[5];
		prof[0] = Professor.criaProfessor("Rafael"	, "Java"	 , 20);
		prof[1] = Professor.criaProfessor("Renata"	, "Web designer" , 30);
		prof[2] = Professor.criaProfessor("Gustavo"	, "XML"		 , 60);
		prof[3] = Professor.criaProfessor("Rafaela"	, ".NET"	 , 56);
		prof[4] = Professor.criaProfessor("Yasmim"	, "PHYTON"	 , 10);

		// Notas
		int notas1[] = new int[3];
		notas1[0] = 0;
		notas1[1] = 10;
		notas1[2] = 10;

		int notas2[] = new int[3];
		notas2[0] = 10;
		notas2[1] = 10;
		notas2[2] = 10;

		int notas3[] = new int[3];
		notas3[0] = 10;
		notas3[1] = 10;
		notas3[2] = 10;

		int notas4[] = new int[3];
		notas4[0] = 10;
		notas4[1] = 10;
		notas4[2] = 10;

		int notas5[] = new int[3];
		notas5[0] = 10;
		notas5[1] = 10;
		notas5[2] = 10;

		// Cria disciplina
		Disciplina dis[] = new Disciplina[5];
		dis[0] = Disciplina.criaDisciplina("Fundamentos de POG"	, "10:00", prof[0], notas1);
		dis[1] = Disciplina.criaDisciplina("Designer" 		, "12:00", prof[1], notas2);
		dis[2] = Disciplina.criaDisciplina("Código"		, "14:00", prof[2], notas3);
		dis[3] = Disciplina.criaDisciplina("Azure"		, "18:00", prof[3], notas4);
		dis[4] = Disciplina.criaDisciplina("Algoritmo"		, "22:00", prof[4], notas5);

		// Cria aluno
		Aluno ze = Aluno.criaAluno(565878, "Zé gotinha", 30, "Gestão de projetos", dis);

		// Verifica nota, caso nota 0, aumenta 50% maldade do professor
		Aluno.maisMalvadoNotaZero(ze.getDisciplinasVetor());

		// Exibe
		System.out.printf("Nome: "	      + ze.getNome());
		System.out.printf("\nMatricula: "     + ze.getMatricula());
		System.out.printf("\nNome do curso: " + ze.getCurso());
		System.out.printf("\nIdade: "	      + ze.getIdade());

		for(int i = 0;i < dis.length;i++){
			int n = i+1;
			System.out.printf("\n----------------- Disciplina " + n + " -----------------");
			System.out.printf("\nNome: " 		+ ze.getDisciplinas(i).getNome());
			System.out.printf("\nHorario: "		+ ze.getDisciplinas(i).getHorario());
			System.out.printf("\nNome professor: "	+ ze.getDisciplinas(i).getProfessor().getNome());
			System.out.printf("\nEspecialidade: "	+ ze.getDisciplinas(i).getProfessor().getEspecialidade());
			System.out.printf("\nMaldade: "		+ ze.getDisciplinas(i).getProfessor().getMaldade());
			System.out.printf("\nNota 1: "		+ ze.getDisciplinas(i).getNota(0));
			System.out.printf("\nNota 2: "		+ ze.getDisciplinas(i).getNota(1));
			System.out.printf("\nNota 3: "		+ ze.getDisciplinas(i).getNota(2));
		}
		System.out.printf("\n-------------------------------------------------");
		System.out.printf("\nProfessor mais malvado: " + Aluno.maisMalvado(ze.getDisciplinasVetor()));
		System.out.printf("\nCR: " + Aluno.calculaCR(ze.getDisciplinasVetor()));

	}

}
