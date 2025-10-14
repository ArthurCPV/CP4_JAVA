package br.com.fiap.metodos;

import br.com.fiap.api.Playstation.PlaystationGames;
import br.com.fiap.services.PlaystatioGamesService;

import javax.swing.*;
import java.io.IOException;

public class MetodoPlaystation {

    static String texto (String j) {
        return JOptionPane.showInputDialog(j);
    }

    public static void escolherJogoPlaystation() throws IOException {

        PlaystatioGamesService playstatioGamesService = new PlaystatioGamesService();

        String g = texto("Digite o Id do jogo(1-1150)");

        PlaystationGames objPlaystationGames = playstatioGamesService.getGame(g);

        System.out.println(objPlaystationGames);
    }
}
