
public class Main {

	public static void main(String[] args) {

		Lista lista1 = testaPrimeiro();
		lista1.exibeTrio();
		lista1.exibeSequencia();

		// Lista lista2 = testaSegundo();
		// lista2.exibeTrio();
		// lista2.exibeSequencia();

	}

	// Testa primeiro construtor
	public static Lista testaPrimeiro() {
		int numeros[] = new int[Lista.TOTAL_NUMEROS];

		for(int i=0;i < Lista.TOTAL_NUMEROS;i++) {
			numeros[i] = Lista.intRandom(Lista.MAX_RANDOM);
		}

		Lista lista = new Lista(numeros);

		return lista;
	}

	// Testa segundo construtor
	public static Lista testaSegundo() {
		Lista lista = new Lista();
		return lista;
	}

}
