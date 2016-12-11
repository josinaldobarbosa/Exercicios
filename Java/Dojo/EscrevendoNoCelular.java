import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Escrevendo no Celular
 * 
 * Um dos serviços mais utilizados pelos usuários de aparelhos celulares são os SMS (Short Message Service), que permite
 * o envio de mensagens curtas (até 255 caracteres em redes GSM e 160 caracteres em redes CDMA).
 * 
 * Para digitar uma mensagem em um aparelho que não possui um teclado QWERTY embutido é necessário fazer algumas
 * combinações das 10 teclas numéricas do aparelho para conseguir digitar.
 * Cada número é associado a um conjunto de letras como a seguir:
 * 
 * Letras ->  Número 
 * ABC    ->  2 
 * DEF    ->  3 
 * GHI    ->  4 
 * JKL    ->  5 
 * MNO    ->  6 
 * PQRS   ->  7 
 * TUV    ->  8 
 * WXYZ   ->  9 
 * Espaço ->  0 
 * 
 * Desenvolva um programa que, dada uma mensagem de texto limitada a 255 caracteres, retorne a seqüência de números que
 * precisa ser digitada. Uma pausa, para ser possível obter duas letras referenciadas pelo mesmo número, deve ser indicada como _.
 * 
 * Por exemplo, para digitar "SEMPRE ACESSO O DOJOPUZZLES", você precisa digitar:
 * 77773367_7773302_222337777_777766606660366656667889999_9999555337777
 * 
 * Este problema foi baseado em uma sugestão de Denis Costa
 * 
 * http://dojopuzzles.com/problemas/exibe/escrevendo-no-celular/
 */

public class EscrevendoNoCelular {
	
	private static final String SMS = "SEMPRE ACESSO O DOJOPUZZLES";
	private static final int SMS_SIZE_LIMIT = 255;
	private static final char SMS_TECLA_PAUSA = '_';
	private static List<Tecla> teclas = new ArrayList<>();

	public static void main(String[] args) {
		
		// Cadastra as teclas
		teclas.add(new Tecla(2, 'A', 'B', 'C'));
		teclas.add(new Tecla(3, 'D', 'E', 'F'));
		teclas.add(new Tecla(4, 'G', 'H', 'I'));
		teclas.add(new Tecla(5, 'J', 'K', 'L'));
		teclas.add(new Tecla(6, 'M', 'N', 'O'));
		teclas.add(new Tecla(7, 'P', 'Q', 'R', 'S'));
		teclas.add(new Tecla(8, 'T', 'U', 'V'));
		teclas.add(new Tecla(9, 'W', 'X', 'Y', 'Z'));
		teclas.add(new Tecla(0, ' '));
		
		// Valido tamanho do SMS
		if (smsSizeIsValid()) {
			start();
		} else {
			System.err.println("Erro: sms ultrapassou o limite de " + SMS_SIZE_LIMIT + " caracteres.");
		}
		
	}
	
	private static boolean smsSizeIsValid() {
		if (SMS.length() > SMS_SIZE_LIMIT) {
			return false;
		}
		return true;
	}
	
	private static void start() {
		StringBuffer numerosDigitados = new StringBuffer();
		
		Tecla ultimoGrupoVerificado = new Tecla();
		
		// Pego letra por letra do SMS
		for (char letra : SMS.toCharArray()) {
			letra = Character.toUpperCase(letra);
			
			boolean acheiALetra = false;
			
			// Verifico em qual grupo a letra esta
			for (Tecla grupo : teclas) {
				ArrayList<Character> teclasGrupo = grupo.getLetras();
				
				if (teclasGrupo.contains(letra)) {
					
					// Pego a posicao que a letra esta
					int position = (teclasGrupo.indexOf(letra) + 1);
					
					// Verifico se essa letra esteve no grupo anterior
					if (grupo == ultimoGrupoVerificado) {
						numerosDigitados.append(SMS_TECLA_PAUSA);
					}
					
					ultimoGrupoVerificado = grupo;
					
					// Escrevo o valor repetindo-o pela posicao
					for (int i = 0; i < position; i++) {
						numerosDigitados.append(grupo.getValor());
					}
					
					acheiALetra = true;
					break;
				}
			}
			
			if (!acheiALetra) {
				System.err.println("Erro: caracter não cadastrado > \"" + letra + "\"\n");
			}
		}
		
		System.out.println("Para digitar \"" + SMS + "\"" + ", você precisa digitar: \n" + numerosDigitados.toString());
	}
	
	/* Representa cada tecla */
	static class Tecla {
		private ArrayList<Character> letras;
		private int valor;
		
		public Tecla() {}
		
 		public Tecla(int valor, Character... letras) {
			this.letras = new ArrayList<>();
			this.letras.addAll(Arrays.asList(letras));
			this.valor = valor;
		}
		
		public ArrayList<Character> getLetras() {
			return this.letras;
		}
		
		public int getValor() {
			return valor;
		}
	}

}
