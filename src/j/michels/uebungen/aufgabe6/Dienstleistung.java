package j.michels.uebungen.aufgabe6;

public class Dienstleistung extends Artikel {

    private double stundensatz;
    private double geplanterStundenAufwand;

    public Dienstleistung(String name, double stundensatz, double geplanterStundenAufwand) {
        super(name);
        this.stundensatz = stundensatz;
        this.geplanterStundenAufwand = geplanterStundenAufwand;
    }

    @Override
    public double getPreis() {
        return this.stundensatz * this.geplanterStundenAufwand;
    }
}
