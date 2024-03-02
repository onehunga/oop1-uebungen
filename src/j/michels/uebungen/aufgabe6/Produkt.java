package j.michels.uebungen.aufgabe6;

public class Produkt extends Artikel {

    private double einstandsPreis;

    public Produkt(String name, double einstandsPreis) {
        super(name);
        this.einstandsPreis = einstandsPreis;
    }

    @Override
    public double getPreis() {
        return this.einstandsPreis;
    }
}
