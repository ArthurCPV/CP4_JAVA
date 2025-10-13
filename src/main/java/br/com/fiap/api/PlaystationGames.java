package br.com.fiap.api;

import java.util.List;

public class PlaystationGames {

    private String id;
    private String name;
    private List<String> genre;
    private List<String> developers;
    private List<String> publishers;
    private List<String> releaseDates;

    public PlaystationGames() {
    }

    public PlaystationGames(String id, String name, List<String> genre, List<String> developers, List<String> publishers, List<String> releaseDates) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.developers = developers;
        this.publishers = publishers;
        this.releaseDates = releaseDates;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<String> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<String> developers) {
        this.developers = developers;
    }

    public List<String> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<String> publishers) {
        this.publishers = publishers;
    }

    public List<String> getReleaseDates() {
        return releaseDates;
    }

    public void setReleaseDates(List<String> releaseDates) {
        this.releaseDates = releaseDates;
    }

    @Override
    public String toString() {
        return "Detalhes do Jogo" +
                "\nNome do jogo: " + name +
                "\nGênero: " + genre +
                "\nTime de desevolvedores: " + developers +
                "\nEmpresa que publicou: " + publishers +
                "\nData de lançamento: " + releaseDates;
    }
}
