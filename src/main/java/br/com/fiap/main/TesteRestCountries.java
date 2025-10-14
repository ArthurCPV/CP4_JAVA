package br.com.fiap.main;

import br.com.fiap.api.Pais;
import br.com.fiap.services.RestCountriesService;

import javax.swing.*;
import java.io.IOException;

public class TesteRestCountries {

    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    public static void main(String[] args) throws IOException {
        // Cria instância do serviço
        RestCountriesService service = new RestCountriesService();

        // Pede o nome do país
        String nome = texto("Digite o nome do país: ");

        // Faz a busca
        Pais pais = service.getPais(nome);

        // Exibe o resultado simples
        if (pais != null) {
            System.out.println("Nome: " + pais.getNome());
            System.out.println("Capital: " + pais.getCapital());
            System.out.println("População: " + pais.getPopulacao());
            System.out.println("Região: " + pais.getRegiao());
            System.out.println("Idioma: " + pais.getIdioma());
            System.out.println("Moeda: " + pais.getMoeda());
            System.out.println("Bandeira: " + pais.getBandeira());
        } else {
            System.out.println("País não encontrado.");
        }
    }
}
