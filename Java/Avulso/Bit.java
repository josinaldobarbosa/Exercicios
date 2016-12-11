public class Bit {

	public static void main(String[] args) {

		byte x = 10; // 1010 em binário
		byte y = 6;  // 0110 em binário

		System.out.println(x^y);
		// Verifica um por um, caso diferente recebe 1, igual recebe 0
		// Resultado é: 1100 em binário, que equivale a 12

	}

}
