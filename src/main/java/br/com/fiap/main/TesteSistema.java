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

            System.out.println("*** Menu Princpal *** \n1 - API => Jogos de Playstation 4\n2 = API => Jogos de XBOX \n3 - API => Jogos de Nintendo Switch\n4 - API - Coloca tua api aqui arthur\n5 - Sair do sistema");
            System.out.print("Escolha: ");
            int escolhaMenuPrincipal = scanner.nextInt();

           switch (escolhaMenuPrincipal){
               case 1 : MetodoPlaystation.escolherJogoPlaystation();
               case 5 : saidaSistema = true;
           }

        }while (!saidaSistema);


        scanner.close();

    }
}
