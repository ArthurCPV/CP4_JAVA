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
            System.out.println("Escolha: ");
            int escolhaMenuPrincipal = scanner.nextInt();

            if (escolhaMenuPrincipal == 1){
                MetodoPlaystation.escolherJogoPlaystation();
            } else if (escolhaMenuPrincipal == 2) {
                MetodoXbox.escolherJogoXbox();
            } else if (escolhaMenuPrincipal == 3) {

            }else if (escolhaMenuPrincipal == 4){

            } else if (escolhaMenuPrincipal == 5) {
                saidaSistema = true;
            }

        }while (!saidaSistema);


        scanner.close();

    }
}
