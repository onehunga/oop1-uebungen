package j.michels.uebungen.autohaus;

public class NeuesAuto implements IAuto {

    private double listenpreis;
    private double rabatt;

    public NeuesAuto(double listenpreis, double rabatt) {
        this.listenpreis = listenpreis;
        this.rabatt = rabatt;
    }

    @Override
    public double getWert() {
        return (listenpreis - rabatt) * 10;
    }
}
