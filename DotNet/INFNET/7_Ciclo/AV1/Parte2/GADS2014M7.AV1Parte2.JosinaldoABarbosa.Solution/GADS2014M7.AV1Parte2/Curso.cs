using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GADS2014M7.AV1Parte2
{
    class Curso
    {
        public string codigoCurso { get; set; }
        public string nomeCurso { get; set; }
        public StatusCode statusCurso { get; set; }

        public Curso(string codigoCurso, string nomeCurso, StatusCode statusCurso)
        {
            this.codigoCurso = codigoCurso;
            this.nomeCurso = nomeCurso;
            this.statusCurso = statusCurso;
        }

        public int getStatusCurso()
        {
            return (int) statusCurso;
        }

    }
}
