package br.com.batalhanaval;

public class Principal {

	/**
	 * @author Josinaldo A.Barbosa
	 */

	public static void main(String[] args) {
		/* Batalha naval! */

		/* Navios */

		String desenhoNavio = "=";
		Navio[] navio = new Navio[3];
		// Cria navios
		navio[0] = Navio.criaNavio(desenhoNavio, 3);
		navio[1] = Navio.criaNavio(desenhoNavio, 2);
		navio[2] = Navio.criaNavio(desenhoNavio, 1);

		/* Campo de batalha */
		Campo campo = new Campo();	   // Cria campo
		String vazio = "0";		   	   // Valor do campo vazio
		Campo.geraCampo(campo, vazio); // Zera campo

		// Preenche campo com os navios
		Campo.naviosNoCampo(campo, navio, vazio);

		Campo.exibeCampo(campo);

	}

}
