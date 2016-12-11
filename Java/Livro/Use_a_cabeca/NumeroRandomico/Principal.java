import java.util.Random;


public class NumeroRandomico {

	// Valor aleatório(entre 1 e 10)
	private static int geraValor(){
		Random valor = new Random();
		return valor.nextInt(10);
	}

	private static void verificaResultado(Jogador player[], int resultado){
		// Verifica se alguem acertou!
		for(Jogador l : player){
			if(l.getValor() == resultado){
				System.out.println(l.getNome() + " | Acertou: " + l.getValor());
			}else{
				System.out.println(l.getNome() + " | Errou: " + l.getValor());
			}
		}
	}

	public static void main(String[] args) {

		// Cria jogadores
		Jogador player[] = new Jogador[3];
		player[0] = Jogador.criaJogador("Fernando", geraValor());
		player[1] = Jogador.criaJogador("Luiz"	  , geraValor());
		player[2] = Jogador.criaJogador("Gabriela", geraValor());

		// Valor sorteado
		int resultado = geraValor();

		// Exibe valor sorteado
		System.out.println("Valor sorteado foi: " + resultado);
		
		// Verifica resultado
		verificaResultado(player, resultado);

	}

}
