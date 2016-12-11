public class Teste {

	public static void main(String[] args) {
		Caixa caixa[] = new Caixa[3];
		
		caixa[0] = new Caixa();
		caixa[1] = new Caixa(20, 30, 15, "Laranja");
		caixa[2] = new Caixa(30, 30, 30, "Cartolina");
		
		for(Caixa c : caixa) {
			System.out.println(c);
		}
		
	}

}
