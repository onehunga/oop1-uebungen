package j.michels.uebungen.aufgabe6;

public abstract class Artikel {
    private String name;

    public Artikel(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract double getPreis();
}
