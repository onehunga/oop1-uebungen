package j.michels.uebungen.autohaus;

public class GebrauchtesAuto implements IAuto {

    private double verkaufspreis;
    private double einkaufspreis;
    private double kilometerstand;

    public GebrauchtesAuto(double verkaufspreis, double einkaufspreis, double kilometerstand) {
        this.verkaufspreis = verkaufspreis;
        this.einkaufspreis = einkaufspreis;
        this.kilometerstand = kilometerstand;
    }

    @Override
    public double getWert() {
        return (this.verkaufspreis - this.einkaufspreis) * this.kilometerstand;
    }
}
