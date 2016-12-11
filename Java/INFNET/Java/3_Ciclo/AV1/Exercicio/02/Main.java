package segundo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<Float> numeros = new ArrayList<Float>();

		// Coleta números
		int contador = 1;
		while(contador <= 3){ // Alterar valor para 10
			System.out.print(contador + ") Entre com o número de ponto flutuante: ");
			numeros.add(input.nextFloat());
			contador++;
		}
		input.close();

		// Ordena do menor para o maior (na mão)
		float menor = numeros.get(0);
		for(int i=0;i < numeros.size();i++){
			if(numeros.get(i) <= menor){
				menor = numeros.get(i);
				numeros.remove(i);
				numeros.add(0, menor);
			}
		}

		/* Utilizando collections para ordenar de menor para o maior: Collections.sort(numeros); */

		// Exibe
		System.out.println("\nDo menor para o maior: ");
		System.out.println(numeros);

		// Ordem inversa com collections
		Collections.reverse(numeros);

		// Exibe
		System.out.println("\nOrdem inversa: ");
		System.out.println(numeros);

	}

}
