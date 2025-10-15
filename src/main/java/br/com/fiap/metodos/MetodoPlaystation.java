package br.com.fiap.metodos;

import br.com.fiap.api.Playstation.PlaystationGames;
import br.com.fiap.services.PlaystatioGamesService;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class MetodoPlaystation {


    public static void escolherJogoPlaystation(Scanner scanner) throws IOException {

        PlaystatioGamesService playstatioGamesService = new PlaystatioGamesService();

        System.out.println("\nDigite o Id do jogo(1-1150)");
        System.out.print("\nEscolha: ");
        String g = scanner.nextLine();

        PlaystationGames objPlaystationGames = playstatioGamesService.getGame(g);

        System.out.println(objPlaystationGames);


    }
}
