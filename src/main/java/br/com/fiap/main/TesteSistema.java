package br.com.fiap.main;

import br.com.fiap.api.Playstation.PlaystationGames;
import br.com.fiap.services.PlaystatioGamesService;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class TesteSistema {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            boolean saidaSistema = false;
        do {

            System.out.println("*** Menu Princpal *** \n1 - API => Jogos de Playstation 4\n2 = API => Jogos de XBOX \n3 - API => Jogos de Nintendo Switch\n4 - API - Coloca tua api aqui arthur\n5 - Sair do sistema");
            System.out.println("");
            int escolhaMenuPrincipal = scanner.nextInt();

        }while (!saidaSistema);


        scanner.close();

    }
}
