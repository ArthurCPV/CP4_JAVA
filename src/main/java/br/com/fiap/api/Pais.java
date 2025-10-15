package br.com.fiap.api;

import java.util.List;
import java.util.Map;

public class Pais {
    private String nome;
    private String capital;
    private long populacao;
    private String regiao;
    private String bandeira;
    private String idioma;
    private String moeda;

    public Pais() {}

    public Pais(String nome, String capital, long populacao, String regiao, String bandeira, String idioma, String moeda) {
        this.nome = nome;
        this.capital = capital;
        this.populacao = populacao;
        this.regiao = regiao;
        this.bandeira = bandeira;
        this.idioma = idioma;
        this.moeda = moeda;
    }

    public String getNome() { return nome; }
    public String getCapital() { return capital; }
    public long getPopulacao() { return populacao; }
    public String getRegiao() { return regiao; }
    public String getBandeira() { return bandeira; }
    public String getIdioma() { return idioma; }
    public String getMoeda() { return moeda; }

    @Override
    public String toString() {
        return "\n\n----- País -----" +
                "\nNome: " + nome +
                "\nCapital: " + capital +
                "\nPopulação: " + populacao +
                "\nRegião: " + regiao +
                "\nIdioma: " + idioma +
                "\nMoeda: " + moeda +
                "\nBandeira: " + bandeira;
    }
}
