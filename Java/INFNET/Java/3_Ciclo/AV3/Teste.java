public class Teste {

	public static void main(String[] args) {

		PalavraAleatoria palavra = new PalavraAleatoria();
		
		System.out.println("Palavra aleatória: " + palavra.getPalavra() + "\n");
		
		BiscoitoDaSorte biscoito = new BiscoitoDaSorte(palavra.listaPalavras(10), "Moranga", TipoBiscoito.DOCE, FormaDoBiscoito.A);
		
		System.out.println(biscoito);
		
		System.out.println("\n----- Palavras aleatórias do biscoito -----");
		biscoito.exibePalavras();

	}

}
