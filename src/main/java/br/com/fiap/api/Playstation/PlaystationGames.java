package br.com.fiap.api.Playstation;

import java.util.List;

public class PlaystationGames {

    private String id;
    private String name;
    private List<String> genre;
    private List<String> developers;
    private List<String> publishers;
    private  PlaystationReleaseDate releaseDates;

    public PlaystationGames() {
    }

    public PlaystationGames(String id, String name, List<String> genre, List<String> developers, List<String> publishers) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.developers = developers;
        this.publishers = publishers;
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

    public PlaystationReleaseDate getReleaseDate() {
        return releaseDates;
    }

    public void setReleaseDate(PlaystationReleaseDate releaseDate) {
        this.releaseDates = releaseDate;
    }

    @Override
    public String toString() {
        return "\n\nDetalhes do Jogo (Playstation)" +
                "\nNome do jogo: " + name +
                "\nGênero: " + genre +
                "\nTime de desevolvedores: " + developers +
                "\nEmpresa que publicou: " + publishers +
                releaseDates;
    }
}
