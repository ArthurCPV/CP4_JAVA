package br.com.fiap.api.Xbox;

import java.util.List;

public class XboxGames {

    private String id;
    private String name;
    private List<String> genre;
    private List<String> developers;
    private List<String> publishers;
    private XboxReleaseDate releaseDates;

    public XboxGames() {
    }

    public XboxGames(String id, String name, List<String> genre, List<String> developers, List<String> publishers) {
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

    public XboxReleaseDate getReleaseDates() {
        return releaseDates;
    }

    public void setReleaseDates(XboxReleaseDate releaseDates) {
        this.releaseDates = releaseDates;
    }

    @Override
    public String toString() {
        return "\n\nDetalhes do Jogo (Xbox)" +
                "\nNome do jogo: " + name +
                "\nGênero: " + genre +
                "\nDesenvolvedores: " + developers +
                "\nPublicadores: " + publishers +
                releaseDates;
    }
}

