import java.util.ArrayList;
import java.util.Collections;

public class Teste {

	public static void main(String[] args) {

		// Lista de contatos
		ArrayList<Contato> listaDeContatos = new ArrayList<>();

		// Adiciona contatos a lista
		listaDeContatos.add(new Contato("Josinaldo", 21, 981173880, TipoTelefone.CELULAR));
		listaDeContatos.add(new Contato("Josinaldo", 22, 981173881, TipoTelefone.CELULAR));
		listaDeContatos.add(new Contato("Josinaldo", 23, 981173882, TipoTelefone.CELULAR));
		listaDeContatos.add(new Contato("Josinaldo", 24, 981173883, TipoTelefone.CELULAR));
		listaDeContatos.add(new Contato("Guilherme", 25, 981173884, TipoTelefone.CELULAR));
		listaDeContatos.add(new Contato("Josinaldo", 26, 981173885, TipoTelefone.CELULAR));
		listaDeContatos.add(new Contato("Josinaldo", 27, 981173886, TipoTelefone.CELULAR));
		listaDeContatos.add(new Contato("Ronaldo"  , 28, 981173887, TipoTelefone.CELULAR));
		listaDeContatos.add(new Contato("Josinaldo", 29, 981173888, TipoTelefone.CELULAR));
		listaDeContatos.add(new Contato("Ronaldo"  , 30, 981173889, TipoTelefone.CELULAR));

		// Cadastra contatos na agenda
		Agenda agenda = new Agenda("Minha agenda", listaDeContatos);

		/*/ Exibe todos os contatos
		System.out.println("Nome da agenda: " + agenda.getNome());
		for (Contato contatos : agenda.getContato()) {
			System.out.println(contatos);
		}*/
		
		// Verifica e exibe contatos repetidos
		ArrayList<Contato> repetidos = new ArrayList<Contato>();
		for(Contato contato : agenda.getContato()) {
			int verifica = Collections.frequency(agenda.getContato(), contato);
			if((verifica > 1) && !(repetidos.contains(contato))) {
				repetidos.add(contato);
				System.out.println(contato.getNome() + ", repete-se: " + verifica + " vezes");
			}
		}
		
	}
	
}
