package br.com.fiap.services;

import br.com.fiap.api.Pais;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class RestCountriesService {

    public Pais getPais(String nomePais) throws IOException {
        Pais pais = null;

        // Cria a requisição HTTP
        HttpGet request = new HttpGet("https://restcountries.com/v3.1/name/" + nomePais);

        // Cria o cliente e executa a requisição
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        CloseableHttpResponse response = httpClient.execute(request);

        // Obtém a resposta
        HttpEntity entity = response.getEntity();

        if (entity != null) {
            String result = EntityUtils.toString(entity);

            // Converte o JSON retornado para um array
            JsonArray jsonArray = JsonParser.parseString(result).getAsJsonArray();

            // Pega o primeiro país encontrado
            JsonObject json = jsonArray.get(0).getAsJsonObject();

            // Extrai os dados principais com verificações básicas
            String nome = json.getAsJsonObject("name").get("common").getAsString();
            String capital = json.has("capital") ? json.getAsJsonArray("capital").get(0).getAsString() : "N/A";
            long populacao = json.has("population") ? json.get("population").getAsLong() : 0L;
            String regiao = json.has("region") ? json.get("region").getAsString() : "N/A";
            String bandeira = json.has("flags") ? json.getAsJsonObject("flags").get("png").getAsString() : "N/A";

            String idioma = "N/A";
            if (json.has("languages")) {
                JsonObject langs = json.getAsJsonObject("languages");
                idioma = langs.entrySet().iterator().next().getValue().getAsString();
            }

            String moeda = "N/A";
            if (json.has("currencies")) {
                JsonObject moedas = json.getAsJsonObject("currencies");
                var entry = moedas.entrySet().iterator().next();
                moeda = entry.getKey() + " (" + entry.getValue().getAsJsonObject().get("name").getAsString() + ")";
            }

            // Cria o objeto País
            pais = new Pais(nome, capital, populacao, regiao, bandeira, idioma, moeda);
        }

        // Fecha conexões
        response.close();
        httpClient.close();

        return pais;
    }
}
