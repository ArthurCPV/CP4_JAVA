package br.com.fiap.metodos;

import br.com.fiap.api.Xbox.XboxGames;
import br.com.fiap.services.XboxGamesService;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class MetodoXbox {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    public static void escolherJogoXbox(Scanner scanner) throws IOException {

        XboxGamesService xboxGamesService = new XboxGamesService();

        System.out.println("\nDigite o Id do jogo (1–2279)");
        System.out.print("\nEscolha: ");
        String g = scanner.nextLine();

        XboxGames objXboxGames = xboxGamesService.getGame(g);

        System.out.println(objXboxGames);
    }
}

