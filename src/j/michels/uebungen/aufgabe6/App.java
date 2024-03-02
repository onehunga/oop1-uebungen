package j.michels.uebungen.aufgabe6;

import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner(System.in);
    private static Angebot angebot = new Angebot();

    private static boolean run = true;

    public static void main(String[] args) {
        while (run) {
            switch(scanner.nextLine()) {
                case "0" -> positionHinzufuegen();
                case "1" -> gesamtAngebotspreis();
                case "2" -> allePositionen();
                case "3" -> run = false;
                default  -> System.out.println("Das ist leider keine Option!!!");
            }

            System.out.println("\n--------------------------\n");
        }
    }

    private static void positionHinzufuegen() {
        System.out.print("Wie lautet der name? ");
        String name = scanner.nextLine();

        System.out.println("Handelt es sich um ein Produkt oder eine Dienstleistung");
        switch (scanner.nextLine()) {
            case "0" -> produktHinzufuegen(name);
            case "1" -> dienstleistungHinzufuegen(name);
        }
    }

    private static void produktHinzufuegen(String name) {
        System.out.print("wie viel kostet " + name + "? ");
        double preis = readDouble();

        angebot.addArtikel(new Produkt(name, preis));
    }

    private static void dienstleistungHinzufuegen(String name) {
        System.out.print("wie viel kostet " + name + " die Stunde? ");
        double preis = readDouble();

        System.out.print("wie viele stunden werden benötigt? ");
        double stunden = readDouble();

        angebot.addArtikel(new Dienstleistung(name, preis, stunden));
    }

    private static void gesamtAngebotspreis() {
        System.out.printf("Der gesamtpreis beträgt %.2f\n", angebot.getPreis());
    }

    private static void allePositionen() {
        angebot.getArtikel().forEach(artikel -> {
            System.out.printf("%20s = %.2f\n", artikel.getName(), artikel.getPreis());
        });
    }

    private static double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch(NumberFormatException ex) {
                System.out.println("Das war leider keine Zahl!");
            }
        }
    }
}
