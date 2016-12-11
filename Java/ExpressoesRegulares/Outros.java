import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Outros {

	public static void main(String[] args) {

		/* OUTROS */

		// Exibindo ocorrencias de uma frase
		String texto = "Tigres, tigres, tristes, TigrEs, tiGres";
		String regex = "(?i)tigres";
		Matcher verifica = Pattern.compile(regex).matcher(texto); // Não compila em tempo de execução(mais rápido que matches)
		int total = 0;
		while(verifica.find()) {
			total++;
			System.out.println(verifica.group());
		}
		System.out.println("Total: " + total);

		// SUBSTITUIÇÕES
		texto = texto.replaceAll(regex, "TIGRE!");
		System.out.println(texto);

		// Subistitui apenas o primeiro encontro
		texto = "O rato roel a ropa do rei de roma";
		texto = texto.replaceFirst("r[aeiou]", "##");
		System.out.println(texto);

		// VARIÁVEIS, reformulando endereço
		String url = "www.site.com.br/categoria-2010.html";
		regex 	   = "(www.site.com.br)/(\\w+)-(\\w{4}).html";
		// Novo padrão = http://www.site.com.br/2010/categoria.php
		System.out.println("Antes:  " + url);
		url = url.replaceAll(regex, "http://$1/$3/$2.php");
		System.out.println("Depois: " + url);

		// Acentuação
		System.out.println("Acentuação: " + "ABôáéíóúfeijãofrançeis".matches("[\\p{L}]+")); // \\p{L} = a-z A-z + acentuação
		
		// Separando coisas com regex
		String lixo = "segunda,terça,quarta";
		regex = ",";
		String[] semana = new String[3];
		semana = lixo.split(regex);
		for(String a : semana){
			System.out.println("Dia: " + a);
		}

	}

}
