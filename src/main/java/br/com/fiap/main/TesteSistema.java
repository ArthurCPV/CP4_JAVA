package br.com.fiap.main;

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

            System.out.println("\n\n*** Menu Princpal *** \n1 - API => Jogos de Playstation 4\n2 = API => Jogos de XBOX \n3 - API => Jogos de Nintendo Switch\n4 - API - Coloca tua api aqui arthur\n5 - Integrantes\n6 - Sair do Sistema");
            System.out.print("Escolha: ");
            int escolhaMenuPrincipal = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaMenuPrincipal) {
                case 1 -> MetodoPlaystation.escolherJogoPlaystation(scanner);
                case 2 -> MetodoXbox.escolherJogoXbox(scanner);
                case 3 -> System.out.println("Nintendo ainda não implementado.");
                case 4 -> System.out.println("Em desenvolvimento...");
                case 5 -> System.out.println("\nArthur dos Santos Cabral | RM:566515\nVitor Fria Dalmagro | RM:566052");
                case 6 -> saidaSistema = true;
                default -> System.out.println("Opção inválida!");
            }


        }while (!saidaSistema);

        scanner.close();

    }
}
