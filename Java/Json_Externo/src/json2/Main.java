package json2;

import java.io.IOException;
import java.util.Map;

import net.sf.json.JSONObject;

public class Main {

	private static final String HTTPS_GRAPH_FACEBOOK = "http://graph.facebook.com/EvaAndressaOficial";

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IOException {
		//Retorno JSON
		JSONObject object = chamadaHttp();
		System.out.println(object); // Exibe tudo do object

		//Retorno dos dados que precisamos
		String id = (String) object.get("id");
		Map map   = (Map) object.get("cover"); // Que interessante! Um cast para um Map! (map utilizando quando for um 'vetor/subcategoria')
		String capa = (String) map.get("source");
		String link = (String) object.get("link");
		String nome = (String) object.get("name");

		//Populando o objeto facebook para persistencia
		Site site = new Site();
		site.setId(id);
		site.setNome(nome);
		site.setLink(link);
		site.setCapa(capa);

		//Impressão do objeto
		System.out.println(site);
	}

	private static JSONObject chamadaHttp() throws IOException {
		Http http = new Http();
		String retornoJson = http.chamaUrl(HTTPS_GRAPH_FACEBOOK);
		JSONObject objetoJson = JSONObject.fromObject(retornoJson);

		return objetoJson;
	}
}
