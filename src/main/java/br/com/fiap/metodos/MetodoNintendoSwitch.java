package br.com.fiap.metodos;

import br.com.fiap.api.NintendoSwitch.NintendoSwitchGames;
import br.com.fiap.services.NintendoSwitchGamesService;

import java.io.IOException;
import java.util.Scanner;

public class MetodoNintendoSwitch {

    public static void escolherJogoNintendo(Scanner scanner) throws IOException {
        NintendoSwitchGamesService nintendoGamesService = new NintendoSwitchGamesService();

        System.out.print("\nDigite o ID do jogo (20–1042)");
        System.out.print("\nEscolha: ");
        String g = scanner.nextLine();

        NintendoSwitchGames objNintendoSwitchGames = nintendoGamesService.getGame(g);


        System.out.println(objNintendoSwitchGames);

    }
}
