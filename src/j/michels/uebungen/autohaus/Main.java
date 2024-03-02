package j.michels.uebungen.autohaus;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Autohaus autohaus = new Autohaus();
    private static boolean shouldRun = true;

    public static void main(String[] args) {
        while (shouldRun) {
            cmd();
        }
    }

    public static void cmd() {
        switch (scanner.nextLine()) {
            case "1" -> neuwagenVerkauf();
            case "2" -> gebrauchtwagenVerkauf();
            case "3" -> wertvollstesGeschäft();
            case "4" -> shouldRun = false;
        }
    }

    public static void neuwagenVerkauf() {
        String[] d = data();

        System.out.print("preis: ");
        double preis = readDouble();
        System.out.print("rabatt: ");
        double rabatt = readDouble();

        autohaus.abschlussHinzufuegen(new Abschluss(d[0], d[1], new NeuesAuto(preis, rabatt)));
    }

    public static void gebrauchtwagenVerkauf() {
        String[] d = data();

        System.out.print("einkaufspreis: ");
        double preis = readDouble();
        System.out.print("verkaufspreis: ");
        double verkaufspreis = readDouble();

        System.out.print("kilometerstand: ");
        double kilometerstand = readDouble();

        autohaus.abschlussHinzufuegen(new Abschluss(d[0], d[1], new GebrauchtesAuto(preis, verkaufspreis, kilometerstand)));
    }

    private static String[] data() {
        System.out.print("Wie Lautet der name des Verkäufers? ");
        String vertriebler = scanner.nextLine();
        System.out.print("Wie lautet das Kennzeichen? ");
        String kfzKennzeichen = scanner.nextLine();

        return new String[]{vertriebler, kfzKennzeichen};
    }

    public static void wertvollstesGeschäft() {
        Abschluss abschluss = autohaus.wetvollsterAbschluss();

        System.out.printf("Das wertvollste geschäft ist: %g von %s\n", abschluss.getWert(), abschluss.getVertriebler());
    }

    private static double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Das war leider keine zahl");
            }
        }
    }
}
