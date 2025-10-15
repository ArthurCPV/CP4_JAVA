package br.com.fiap.metodos;

import br.com.fiap.api.Pais;
import br.com.fiap.services.RestCountriesService;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class MetodoCountries {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    public static void escolherPais(Scanner scanner) throws IOException {
        // Cria instância do serviço
        RestCountriesService service = new RestCountriesService();

        // Pede o nome do país
        System.out.println("Digite o nome do país: ");
        String nome = scanner.nextLine();

        // Faz a busca
        Pais pais = service.getPais(nome);

        System.out.println(pais);
    }
}
