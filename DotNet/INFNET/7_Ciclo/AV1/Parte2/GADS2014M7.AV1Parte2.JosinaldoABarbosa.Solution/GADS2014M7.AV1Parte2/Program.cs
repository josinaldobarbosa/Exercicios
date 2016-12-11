using System;
using System.Collections.Generic;
using System.IO;
using System.Text;

namespace GADS2014M7.AV1Parte2
{
    class Program
    {

        private static string PATH_APP = Path.GetDirectoryName(Path.GetDirectoryName(Directory.GetCurrentDirectory()));
        private static string NOME_PASTA = "DADOS";
        private static string ARQUIVO_XML = "ExportaAlunos-JosinaldoABarbosa.xml";
        private static string SAVE_NAME = "ExportaAlunos-JosinaldoABarbosa";

        static void Main(string[] args)
        {
            ParseXmlAluno parseXmlAluno = new ParseXmlAluno(getCaminhoArquivo(ARQUIVO_XML));

            List<Aluno> alunos = parseXmlAluno.getAlunos();

            Program.showAlunos(alunos);
            Program.saveXML(getCaminhoArquivo(ARQUIVO_XML));
            Program.saveLog(alunos);
            
            Console.ReadKey();
        }

        private static String getCaminhoArquivo(string nomeArquivo)
        {
            StringBuilder caminhoArquivo = new StringBuilder();
            caminhoArquivo.Append(PATH_APP);
            caminhoArquivo.Append("/");
            caminhoArquivo.Append(NOME_PASTA);
            caminhoArquivo.Append("/");
            caminhoArquivo.Append(nomeArquivo);
            return caminhoArquivo.ToString();
        }

        private static void showAlunos(List<Aluno> alunos)
        {
            foreach (Aluno aluno in alunos)
            {
                Console.WriteLine("-----------------------------------");
                Console.WriteLine("Matricula: " + aluno.matricula);
                Console.WriteLine("Nome: " + aluno.nome);
                Console.WriteLine("Sobrenome: " + aluno.sobrenome);

                foreach (Curso curso in aluno.cursos)
                {
                    Console.WriteLine("Codigo do curso: " + curso.codigoCurso);
                    Console.WriteLine("Nome do curso: " + curso.nomeCurso);
                    Console.WriteLine("Status do curso: " + curso.statusCurso);
                }
            }

            Console.WriteLine("-----------------------------------");
        }

        private static void saveXML(String caminhoArquivo)
        {
            string nomeSaveXml = getSaveName(".xml");
            File.Copy(caminhoArquivo, getCaminhoArquivo("") + nomeSaveXml);
        }

        private static void saveLog(List<Aluno> alunos)
        {
            string nomeSaveLog = getSaveName("-Log.txt");
    
            StreamWriter file = new StreamWriter(getCaminhoArquivo(nomeSaveLog));
            
            foreach (Aluno aluno in alunos)
            {
                file.WriteLine(aluno.ToString());
            }

            file.Close();
        }

        private static string getSaveName(string formato)
        {
            return SAVE_NAME + "-" + DateTime.Now.ToString("yyyyMMdd-HHmmsstt") + formato;
        }
        
    }

}
