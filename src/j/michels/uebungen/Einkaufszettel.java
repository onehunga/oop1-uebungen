package j.michels.uebungen;

import java.util.Scanner;

public class Einkaufszettel {
    private final static Scanner scanner = new Scanner(System.in);
    private final static String[] liste = new String[15];
    private static int elem = 0;

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("mit h kannst du dir das Menü anzeigen lassen.");
        while (true) {
            System.out.print("was möchtest du machen? ");
            var line = scanner.nextLine();
            switch (line.toLowerCase()) {
                case "0", "a", "add", "hinzufügen" -> add();
                case "1", "r", "remove", "löschen" -> remove();
                case "2", "l", "list", "anzeigen" -> list();
                case "3", "h", "help", "hilfe" -> help();
                case "4", "q", "quit" -> {
                    return;
                }
                default -> System.out.println("Das war keine valide eingabe");
            }
            System.out.println("\n--------------------------------------\n");
        }
    }

    private static void add() {
        if(elem >= 15) {
            System.out.print("Du hast leider kein Platz mehr in deiner Liste.");
            return;
        }

        System.out.print("Was möchtest du hinzufügen? ");
        var product = scanner.nextLine();
        for (int i = 0; i < liste.length; i++) {
            if(liste[i] == null) {
                liste[i] = product;
                elem++;
                return;
            }
        }
    }

    private static void remove() {
        if(elem == 0) {
            System.out.println("Deine Liste ist leer, es gibt nichts zu löschen!");
            return;
        }

        int idx = readNumber();
        while (idx < 0 || idx > liste.length) {
            System.out.println("Die Zahl muss zwischen 0 und 14 liegen");
            idx = readNumber();
        }

        var e = liste[idx];
        if(e == null) {
            System.out.println("An Position " + idx + " war kein Eintrag vorhanden!");
            return;
        }
        liste[idx] = null;
        System.out.print(e + " wurde erfolgreich von der Liste entfernt!");
    }

    private static void list() {
        for (int i = 0; i < liste.length; i++) {
            if(liste[i] == null) {
                continue;
            }
            System.out.printf("%02d = %s\n", i, liste[i]);
        }
    }

    private static void help() {
        System.out.println("0: Eintrag hinzufügen.");
        System.out.println("1: Eintrag löschen.");
        System.out.println("2: Einträge anzeigen.");
        System.out.println("3: Dieses Hilfsmenü Anzeigen.");
        System.out.println("4: Program beenden.");
    }

    private static int readNumber() {
        while (true) {
            System.out.print("Welches element möchtest du löschen? ");
            var input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Das war leider keine Valide zahl:");
            }
        }
    }
}
