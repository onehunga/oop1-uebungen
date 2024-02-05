package j.michels.uebungen.getraenke;

public class Getraenkeautomat {

    private double preis;
    private int menge;

    public Getraenkeautomat() {
        reset();
    }

    public void reset() {
        this.preis = 0;
        this.menge = 1;
    }

    public void setGetraenk(int g) {
        this.preis = switch (g) {
            case 1 -> 1.2; // wasser
            case 2 -> 1.8; // limo
            case 3 -> 1.5; // eistee
            default -> 0;
        };
    }

    public void setMenge(int m) {
        this.menge = m;
    }

    public double getPreis() {
        return this.preis * this.menge;
    }

}
