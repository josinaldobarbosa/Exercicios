package br.com.batalhanaval;

public class Campo {
	// Campo linhas x colunas
	private final int linhas  = 5;
	private final int colunas = 10;
	private String campo[][]  = new String[linhas][colunas];

	// Gera campo
	public static void geraCampo(Campo campo, String vazio){
		for(int i=0;i < campo.getCampo().length;i++){
			for(int j=0;j < campo.getCampo()[0].length;j++){
				// Todos recebem valor de vazio
				campo.setCampo(i, j, vazio);
			}
		}
	}

	// Exibe campo
	public static void exibeCampo(Campo campo){
		System.out.println("[--- Exibe o campo ---]");
		for(int i=0;i < campo.getCampo().length;i++){
			for(int j=0;j < campo.getCampo()[0].length;j++){
				System.out.print(campo.getCampo()[i][j]);
			}
			System.out.print("\n");
		}
	}

	// Preenche navio no campo
	private static void preecheNavioCampo(Campo campo, Navio navio, int linha, int coluna, boolean HorizontalTrue){
		if(HorizontalTrue == true){
			// Preenche na horizontal
			for(int c=0;c < navio.getTamanho();c++){
				campo.setCampo(linha, coluna, navio.getDesenho());
				System.out.println("Linha: " + linha + " | " + "Coluna: " + coluna); // Retirar teste
				coluna++;
			}
		}else{
			// Preenche na vertical
			for(int c=0;c < navio.getTamanho();c++){
				campo.setCampo(linha, coluna, navio.getDesenho());
				System.out.println("Linha: " + linha + " | " + "Coluna: " + coluna); // Retirar teste
				linha++;
			}
		}
	}

	// Valida tamanho maximo do número aleatório da linha/coluna
	private static int validaTamanhoRandom(int tamanhoDoNavio, int tamanhoLadoDoCampo){
		if(!(tamanhoDoNavio > 1)){
			return Utilidades.intRandom(tamanhoLadoDoCampo);
		}else if(tamanhoDoNavio == tamanhoLadoDoCampo){
			// Verifica se o tamanho do navio é do tamanho da linha(se sim, começa na primeira posição)
			return 0;
		}else{
			// Coluna recebe valor aleatório entre tamanho da linha - tamanho do navio
			return Utilidades.intRandom(tamanhoLadoDoCampo - tamanhoDoNavio);
		}
	}

	// Coloca navios no campo de batalha(aleatório)
	public static void naviosNoCampo(Campo campo, Navio[] navio, String vazio){
		System.out.println("Gerando campo..."); // Retirar teste
		// Percorre quantidade de navios
		for(int i=0;i < navio.length;i++){
			int tamanhoDoNavio		 = navio[i].getTamanho();
			int tamanhoLinhaDoCampo  = campo.getCampo().length;
			int tamanhoColunaDoCampo = campo.getCampo()[0].length;
			int linha, coluna;
			boolean resultado;

			// De qual modo(na horizontal ou vertical) ira existir o navio
			boolean modo = Utilidades.booleanRandom(); // true ou false
			if(modo == true){
				// Navio na horizontal
				System.out.println("Adicionando navio " + i + " na horizontal"); // Retirar teste
				// Verifica matriz do campo para ver se ja foi preenchido(repete até achar um lugar)
				do{
					// zera resultado
					resultado = false;
					// Linha, recebe valor aleatório de no max. tamanho da linha do campo
					linha = Utilidades.intRandom(tamanhoLinhaDoCampo);
					// Coluna
					coluna = validaTamanhoRandom(tamanhoDoNavio, tamanhoColunaDoCampo);
					// Percorre o campo na posição do navio, verificando se tem outro navio
					int verificaColuna = coluna;
					for(int c=0;c < tamanhoDoNavio;c++){
						if(campo.getCampo()[linha][verificaColuna].equals(vazio) == false){
							// Não é vazio
							resultado = true;
							System.out.println("Ops, "+ "Linha: "+ linha + " | " + "Coluna: " + c +", tentar dnv..."); // Retirar teste
							break;
						}
						verificaColuna++;
					}
				}while(resultado == true);

				// Preenche campo com o navio
				Campo.preecheNavioCampo(campo, navio[i], linha, coluna, true);

			}else{
				// Navio na vertical
				System.out.println("Adicionando navio " + i + " na vertical"); // Retirar teste
				// Verifica matriz do campo para ver se ja foi preenchido(repete até achar um lugar)
				do{
					// zera resultado
					resultado = false;
					// Coluna, recebe valor aleatório de no max. tamanho da linha do campo
					coluna = Utilidades.intRandom(tamanhoLinhaDoCampo);
					// Linha
					linha = validaTamanhoRandom(tamanhoDoNavio, tamanhoLinhaDoCampo);
					// Percorre o campo na posição do navio, verificando se tem outro navio
					int verificaLinha = linha;
					for(int c=0;c < tamanhoDoNavio;c++){
						if(campo.getCampo()[verificaLinha][coluna].equals(vazio) == false){
							// Não é vazio
							resultado = true;
							System.out.println("Ops, "+ "Linha: "+ linha + " | " + "Coluna: " + c +", tentar dnv..."); // Retirar teste
							break;
						}
						verificaLinha++;
					}
				}while(resultado == true);

				// Preenche campo com o navio
				Campo.preecheNavioCampo(campo, navio[i], linha, coluna, false);
			}
		}
	}

	public String[][] getCampo() {
		return campo;
	}

	public void setCampo(int linha, int coluna, String valor) {
		this.campo[linha][coluna] = valor;
	}


}
