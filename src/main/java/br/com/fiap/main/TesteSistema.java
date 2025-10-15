package br.com.fiap.main;

import br.com.fiap.metodos.MetodoCountries;
import br.com.fiap.metodos.MetodoNintendoSwitch;
import br.com.fiap.metodos.MetodoPlaystation;
import br.com.fiap.metodos.MetodoXbox;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class TesteSistema {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

            boolean saidaSistema = false;
        do {

            System.out.println("\n\n*** Menu Princpal *** \n1 - API => Jogos de Playstation 4\n2 - API => Jogos de XBOX \n3 - API => Jogos de Nintendo Switch\n4 - API => RestCountries\n5 - Integrantes\n6 - Sobre o Projeto\n7 - Sair do Sistema");
            System.out.print("Escolha: ");
            int escolhaMenuPrincipal = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaMenuPrincipal) {
                case 1 -> MetodoPlaystation.escolherJogoPlaystation(scanner);
                case 2 -> MetodoXbox.escolherJogoXbox(scanner);
                case 3 -> MetodoNintendoSwitch.escolherJogoNintendo(scanner);
                case 4 -> MetodoCountries.escolherPais(scanner);
                case 5 -> System.out.println("\nArthur dos Santos Cabral | RM:566515\nVitor Fria Dalmagro | RM:566052");
                case 6 -> System.out.println("\nhttps://youtu.be/jPkzK6I9E_Q");
                case 7 -> saidaSistema = true;
                default -> System.out.println("Opção inválida!");
            }


        }while (!saidaSistema);


        scanner.close();

    }
}
