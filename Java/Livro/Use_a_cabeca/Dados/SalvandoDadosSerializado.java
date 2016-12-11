package dados;

import java.io.*;
import java.util.Scanner;

public class SalvandoDadosSerializado implements Serializable {
	private static final long serialVersionUID = 1L;

	// Variáveis que serão salvas
	private String nome;
	private double saldo;
	private static final transient String nomeArquivo = "nome.ser"; //  <- "transient" ignora para não salvar está variável!

	public static void main(String[] args){
		// Objeto da classe
		SalvandoDadosSerializado pessoa = new SalvandoDadosSerializado();

		// Menu
		System.out.print("O que deseja fazer? [1] Salva, [2] Restaura: ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int res = in.nextInt();
		if(res == 1){
			// Altera dados
			System.out.print("Insira um nome: ");
			pessoa.nome = in.next();
			System.out.print("Insira o saldo: ");
			pessoa.saldo = in.nextDouble();

			salvaObjeto(pessoa);
			exibeDados(pessoa);
		}else{
			restauraObjeto(pessoa);
			exibeDados(pessoa);
		}

	}

	public static void exibeDados(SalvandoDadosSerializado ob){
		// Exibe
		System.out.println("Seu nome é: "  + ob.nome);
		System.out.println("Seu saldo é: " + ob.saldo);
	}

	// Operação para salvar o objeto
	private static void salvaObjeto(SalvandoDadosSerializado objeto){
		try { 
			FileOutputStream fs = new FileOutputStream(nomeArquivo); // Salva no arquivo "nomeArquivo" se existir, se não criará um arquivo com esse nome
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(objeto);
			os.close();
			System.out.println("Dados salvos!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao salvar!");
		}
	}

	// Operação para restaurar o objeto salvo
	private static void restauraObjeto(SalvandoDadosSerializado objeto){
		// Restaura dados salvos(valor inicial declarado)
		try {
			FileInputStream fileStream = new FileInputStream(nomeArquivo); // Se o arquivo "nomeArquivo" não existir captura exceção.
			ObjectInputStream os = new ObjectInputStream(fileStream);
			Object objetoSalvo = os.readObject(); // Le o objeto salvo
			SalvandoDadosSerializado s = (SalvandoDadosSerializado) objetoSalvo; // Converte pra formato 'original'
			// Sobrescreve as variáveis
			objeto.nome = s.nome;
			objeto.saldo = s.saldo;
			// Fecha
			os.close();
			System.out.println("Dados restaurados!");
		} catch (IOException | ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Erro: arquivo não foi encontrado.");
		}
	}

}
