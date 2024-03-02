package j.michels.uebungen.telefonnummern;

public class Person {
    private String name;
    private Nationalitaet nationalitaet;
    private String telefonNummer;

    public Person(String name, Nationalitaet nationalitaet, String telefonNummer) {
        this.name = name;
        this.nationalitaet = nationalitaet;
        this.telefonNummer = telefonNummer;
    }

    public String getTelefonNummer() {
        return this.nationalitaet.getVorwahl() + ' ' + this.telefonNummer;
    }
}
