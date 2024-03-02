package j.michels.uebungen.telefonnummern;

public class App {
    public static void main(String[] args) {
        Person a = new Person("Kevin", Nationalitaet.Deutschland, "1232456789");

        System.out.println(a.getTelefonNummer());
    }
}
