package j.michels.uebungen.telefonnummern;

public enum Nationalitaet {
    Belgien("BE", "Belgien", "+32"),
    Spanien("E", "Spanien", "+34"),
    Deutschland("D", "Deutschland", "+49"),
    Peru("PE", "Peru", "+51"),
    Israel("IL", "Israel", "+972");

    private final String laenderKuerzel;
    private final String land;
    private final String vorwahl;

    Nationalitaet(String laenderKuerzel, String land, String vorwahl) {
        this.laenderKuerzel = laenderKuerzel;
        this.land = land;
        this.vorwahl = vorwahl;
    }

    public String getVorwahl() {
        return this.vorwahl;
    }
}
