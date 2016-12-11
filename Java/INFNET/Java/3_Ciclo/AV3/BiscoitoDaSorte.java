import java.util.ArrayList;
import java.util.Collections;

public class BiscoitoDaSorte {

	private ArrayList<String> palavras;
	private String nome;
	private TipoBiscoito tipo;
	private FormaDoBiscoito forma;

	private final int MIN_PALAVRAS = 4;
	private final int MAX_PALAVRAS = 10;

	// Construtor
	public BiscoitoDaSorte(ArrayList<String> palavras, String nome,
			TipoBiscoito tipo, FormaDoBiscoito forma) {

		this.palavras = verificaPalavras(palavras);
		this.nome = nome;
		this.tipo = tipo;
		this.forma = forma;

	}

	// Verifica coleção de palavras
	private ArrayList<String> verificaPalavras(ArrayList<String> palavras) {

		if ((palavras.size() >= MIN_PALAVRAS)
				&& (palavras.size() <= MAX_PALAVRAS)) {
			// Verifica repetições e trata
			ArrayList<String> retorno = new ArrayList<>();
			for (String palavra : palavras) {
				int frequencia = Collections.frequency(retorno, palavra);
				if (frequencia == 0) {
					retorno.add(palavra);
				}
			}
			return retorno;
		}

		return null;
	}

	// Exibe palavras
	public void exibePalavras() {
		for (String palavra : this.palavras) {
			System.out.print(palavra + " - ");
			// Exibe com *
			System.out.println(palavra.replaceAll(".", "*"));
		}
	}

	public String getTipoBiscoito() {
		return this.tipo.getSabor();
	}

	public String getForma() {
		return forma.getFormato();
	}

	@Override
	public String toString() {
		return "BiscoitoDaSorte [palavras=" + palavras + ", nome=" + nome
				+ ", tipo=" + tipo.getSabor() + ", forma=" + forma.getFormato()
				+ "]";
	}

}
