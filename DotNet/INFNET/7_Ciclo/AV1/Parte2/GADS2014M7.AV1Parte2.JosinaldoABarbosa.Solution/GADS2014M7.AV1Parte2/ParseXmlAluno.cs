using System.Collections.Generic;
using System.Xml;

namespace GADS2014M7.AV1Parte2
{
    class ParseXmlAluno
    {
        
        private XmlDocument xmlRaw;

        private string tagAluno = "Aluno";
        private string nodeMatricula = "Matricula";
        private string nodeNome = "Nome";
        private string nodeSobreNome = "Sobrenome";
        private string nodeCodigoCurso = "CodigoCurso";
        private string nodeNomeCurso = "NomeCurso";
        private string nodeStatusCurso = "StatusCurso";

        public ParseXmlAluno(string caminhoArquivo)
        {
            xmlRaw = new XmlDocument();
            xmlRaw.Load(caminhoArquivo);
        }

        public List<Aluno> getAlunos()
        {

            List<Aluno> alunosList = new List<Aluno>();

            XmlNodeList nodeAlunos = xmlRaw.GetElementsByTagName(tagAluno);

            foreach (XmlNode nodeAluno in nodeAlunos)
            {
                int matricula = int.Parse(nodeAluno[nodeMatricula].InnerText);
                string nome = nodeAluno[nodeNome].InnerText;
                string sobreNome = nodeAluno[nodeSobreNome].InnerText;
                string codigoCurso = nodeAluno[nodeCodigoCurso].InnerText;
                string nomeCurso = nodeAluno[nodeNomeCurso].InnerText;
                int statusCurso = int.Parse(nodeAluno[nodeStatusCurso].InnerText);
                StatusCode statusCode = this.getStatusCode(statusCurso);

                Aluno aluno = new Aluno(matricula, nome, sobreNome);
                Curso curso = new Curso(codigoCurso, nomeCurso, statusCode);
                aluno.addCurso(curso);

                alunosList.Add(aluno);
            }

            return alunosList;
        }

        private StatusCode getStatusCode(int code)
        {
            switch (code)
            {
                case (int)StatusCode.ATIVO:
                    return StatusCode.ATIVO;
                    break;
                case (int)StatusCode.INATIVO:
                    return StatusCode.INATIVO;
                    break;
                default:
                    return StatusCode.INATIVO;
            }
        }

    }
}
