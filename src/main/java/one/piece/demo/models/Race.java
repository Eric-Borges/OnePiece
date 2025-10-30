package one.piece.demo.models;

public enum Race {
    HUMAN("Humano"),
    CYBORG("Ciborge"),
    MINK("Mink"),
    FAIRY("Anão"),
    FISH_MAN("Tritão");

    private String name;

    Race(String name) {
        this.name = name;
    }
}
