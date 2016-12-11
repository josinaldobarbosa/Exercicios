import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		int x;

		// Arredonda um ponto flutuante
		x = Math.round(37.5f); // <= .4 fica 37, >= .5 fica 38
		System.out.println(x);

		// Retorna o menor número(Math.min)/maior(Math.max), tipos primitivos sobrecarregados
		int n1 = 7, n2 = 5;
		x = Math.min(n1, n2);
		System.out.println(x);

		// Valor absoluto
		x = -100;
		x = Math.abs(x);
		System.out.println(x);

		// Variável final não pode ser modificada
		final float pi = (float) 3.14159265359;
		System.out.println(pi);

		/* Formatando String */
		String y = String.format("%,d", 1000000000);
		System.out.println(y);
		
		// Separando uma string com um delimitador
		String formulario = "Quanto é 10 + 10?/20";
		String[] result = formulario.split("/");
		System.out.println("Pergunta: " + result[0]);
		System.out.println("Resposta: " + result[1]);

		// Hora, minuto, segundos
		System.out.println(String.format("%tr", new Date()));
		
	}

}
