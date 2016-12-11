package json3;

import java.io.IOException;

import net.sf.json.JSONObject;

public class MainEstacoesBikeRio {

	private static final String HTTPS = "http://dadosabertos.rio.rj.gov.br/apiTransporte/apresentacao/rest/index.cfm/estacoesBikeRio";

	public static void main(String[] args) throws IOException {
		//Retorno JSON
		JSONObject object = chamadaHttp();

		// Salvando dados...
		String nomeLinha = "DATA";
		int tamanhoLinha  = object.getJSONArray(nomeLinha).size(); // Linha ?(57)
		// int tamanhoColuna = object.getJSONArray("COLUMNS").size(); // Coluna 7

		Site dados[] = new Site[tamanhoLinha];
		for(int i=0;i < tamanhoLinha;i++) {
			dados[i] = new Site();
			dados[i].setBairro    ((String) object.getJSONArray(nomeLinha).getJSONArray(i).get(0));
			dados[i].setEstacao   ((String) object.getJSONArray(nomeLinha).getJSONArray(i).get(1));
			dados[i].setCodigo    ((double) object.getJSONArray(nomeLinha).getJSONArray(i).get(2));
			dados[i].setEndereco  ((String) object.getJSONArray(nomeLinha).getJSONArray(i).get(3));
			dados[i].setNumero    ("" + object.getJSONArray(nomeLinha).getJSONArray(i).get(4)); // Contem coisas em double outras em String
			dados[i].setLatitude  ("" + object.getJSONArray(nomeLinha).getJSONArray(i).get(5)); // Contem coisas em double outras em String
			dados[i].setLongitude ("" + object.getJSONArray(nomeLinha).getJSONArray(i).get(6)); // Contem coisas em double outras em String
		}
		
		// Exibe colunas
		System.out.println(object.get("COLUMNS"));

		// Exibindo...
		for(Site d : dados) {
			System.out.println(d);
		}

	}

	private static JSONObject chamadaHttp() throws IOException {
		Http http = new Http();
		String retornoJson = http.chamaUrl(HTTPS);
		JSONObject objetoJson = JSONObject.fromObject(retornoJson);
		return objetoJson;
	}
}
