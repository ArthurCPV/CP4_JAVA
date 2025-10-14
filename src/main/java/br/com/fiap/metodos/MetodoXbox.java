package br.com.fiap.metodos;

import br.com.fiap.api.Xbox.XboxGames;
import br.com.fiap.services.XboxGamesService;

import javax.swing.*;
import java.io.IOException;

public class MetodoXbox {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    public static void escolherJogoXbox() throws IOException {

        XboxGamesService xboxGamesService = new XboxGamesService();

        String g = texto("Digite o Id do jogo (1–1150)");

        XboxGames objXboxGames = xboxGamesService.getGame(g);

        System.out.println(objXboxGames);
    }
}

