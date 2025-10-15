package br.com.fiap.services;

import br.com.fiap.api.NintendoSwitch.NintendoSwitchGames;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class NintendoSwitchGamesService {

    public NintendoSwitchGames getGame(String g) throws IOException {

        NintendoSwitchGames nintendoGames = null;
        //Request
        HttpGet request = new HttpGet("https://api.sampleapis.com/switch/games/" + g);
        //Client
        CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
        //Response
        CloseableHttpResponse response = httpClient.execute(request);
        //Entity
        HttpEntity entity = response.getEntity();

        if (entity != null) {

            String result = EntityUtils.toString(entity);

            Gson gson = new Gson();

            nintendoGames = gson.fromJson(result, NintendoSwitchGames.class);
        }

        return nintendoGames;
    }
}
