
public class Fibonacci {

	public static void main(String[] args) {

		/* Desafio: Fibonacci com duas variáveis */

		// Ex.: 0 1 1 2 3 5 8 13...

		int primeiro = 0;
		int segundo  = 1;

		while(segundo <= 13){
			System.out.println(primeiro + " - " + segundo);
			primeiro += segundo;
			segundo  += primeiro;
		}

	}

}
