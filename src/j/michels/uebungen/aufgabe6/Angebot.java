package j.michels.uebungen.aufgabe6;


import java.util.ArrayList;
import java.util.List;

public class Angebot {
    private static final double ZUSCHLAG = 1.2; // 20%

    private List<Artikel> artikelList = new ArrayList<>();

    public void addArtikel(Artikel artikel) {
        this.artikelList.add(artikel);
    }

    public Iterable<Artikel> getArtikel() {
        return this.artikelList;
    }

    public double getPreis() {
        final double val = this.artikelList.stream().mapToDouble(Artikel::getPreis).sum();
        return val * ZUSCHLAG;
    }
}
