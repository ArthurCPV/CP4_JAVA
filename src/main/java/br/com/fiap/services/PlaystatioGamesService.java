package br.com.fiap.services;

import br.com.fiap.api.PlaystationGames;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class PlaystatioGamesService {

    public PlaystationGames getGame(String g) throws IOException {

        PlaystationGames playstationGames = null;

        //Request
        HttpGet request = new HttpGet("https://api.sampleapis.com/playstation/games/" + g);
        //Client
        CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
        //Response
        CloseableHttpResponse response = httpClient.execute(request);
        //Entity
        HttpEntity entity = response.getEntity();

        if (entity != null){

            String result = EntityUtils.toString(entity);

            Gson gson = new Gson();

            playstationGames = gson.fromJson(result,PlaystationGames.class);
        }
        return playstationGames;
    }
}
