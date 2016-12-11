using System;
using System.Collections.Generic;
using System.Text;

namespace GADS2014M7.AV1Parte2
{
    class Aluno
    {

        public int matricula { get; set; }
        public string nome { get; set; }
        public string sobrenome { get; set; }
        public List<Curso> cursos;

        public Aluno(int matricula, string nome, string sobreNome)
        {
            this.matricula = matricula;
            this.nome = nome;
            this.sobrenome = sobreNome;
            cursos = new List<Curso>();
        }

        public void addCurso(Curso curso) {
            cursos.Add(curso);
        }

        public override string ToString()
        {
            string SEP = ":";

            StringBuilder sb = new StringBuilder();
            sb.Append(matricula);
            sb.Append(SEP);
            sb.Append(nome);
            sb.Append(SEP);
            sb.Append(sobrenome);
            sb.Append(SEP);
            
            foreach (Curso curso in cursos) {
                sb.Append(curso.codigoCurso);
                sb.Append(SEP);
                sb.Append(curso.nomeCurso);
                sb.Append(SEP);
                sb.Append(Convert.ToString(curso.getStatusCurso()));
            }

            return sb.ToString();
        }
        
    }
}
