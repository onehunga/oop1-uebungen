package j.michels.uebungen.autohaus;

public class Abschluss {
    private final String vertriebler;
    private String kfzKennzeichen;
    private final IAuto auto;

    public Abschluss(String vertriebler, String kfzKennzeichen, IAuto auto) {
        this.vertriebler = vertriebler;
        this.kfzKennzeichen = kfzKennzeichen;
        this.auto = auto;
    }

    public String getVertriebler() {
        return this.vertriebler;
    }

    public double getWert() {
        return this.auto.getWert();
    }
}
