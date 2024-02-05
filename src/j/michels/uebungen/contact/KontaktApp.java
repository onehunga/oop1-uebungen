package j.michels.uebungen.contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KontaktApp {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Contact> contacts = new ArrayList<>();
    private static boolean run = true;

    public static void main(String[] args) {
        help();
        while (run) {
            execute();
        }
    }

    private static void execute() {
        String command = scanner.nextLine();
        switch (command.toLowerCase()) {
            case "0", "a", "add", "hinzufügen", "hinzufuegen" -> add();
            case "1", "r", "remove", "e", "entfernen" -> remove();
            case "2", "l", "list" -> list();
            case "3", "q", "quit", "end", "exit", "beenden" -> quit();
            case "4", "h", "help", "hilfe" -> help();
            default -> {
                System.out.println("Das war kein valider Befehl!");
                System.out.println("Sieh dir die Befehle mit h an.");
            }
        }
        System.out.println("---------------------------------");
    }

    private static void add() {
        System.out.print("möchtest du einen Kontakt anlegen oder eine Nummer hinzufügen? ");
        switch (readInt()) {
            case 0 -> {
                System.out.print("Wie lautet der name? ");
                String name = scanner.nextLine();
                contacts.add(new Contact(name));
            }
            case 1 -> {
                System.out.print("Zu welchem Kontakt möchtest du eine Nummer hinzufügen?");
                String name = scanner.nextLine();
                System.out.print("Wie lautet die Nummer? ");
                String number = scanner.nextLine();
                for (Contact contact : contacts) {
                    if(contact.getName().equals(name)) {
                        contact.addPhoneNumber(number);
                        break;
                    }
                }
            }
            default -> System.out.println("Das ist kein valider Befehl!");
        }
    }

    private static void remove() {
        System.out.println("Möchtest du einen Kontakt löschen oder eine Telefonnummer? ");
        switch (readInt()) {
            case 0 -> {
                System.out.print("Wie lautet der Name? ");
                final String name = scanner.nextLine();
                contacts.remove(new Contact(name));
            }
            case 1 -> {
                System.out.print("Wie lautet der Name? ");
                final String name = scanner.nextLine();
                System.out.print("Welche nummer möchtest du löschen (index basiert) ");
                int idx = readInt();
                for (final Contact c : contacts) {
                    if(c.getName().equals(name)) {
                        c.getPhoneNumbers().remove(idx);
                        break;
                    }
                }
            }
            default -> System.out.println("Das war keine Valide option für das Löschen!");
        }
    }

    private static void list() {
        System.out.print("Möchtest du alle Kontakte anzeigen lassen oder die Nummern von einem? ");
        switch (readInt()) {
            case 0 -> {
                System.out.println("Kontakte");
                printTable(contacts);
            }
            case 1 -> {
                System.out.print("Wie lautet der name?");
                String name = scanner.nextLine();
                for (Contact contact : contacts) {
                    if(contact.getName().equals(name)) {
                        System.out.println("Alle Telefonnummern:");
                        printTable(contact.getPhoneNumbers());
                        break;
                    }
                }
            }
            default -> System.out.println("Das ist kein valider Befehl!");
        }
    }

    private static void quit() {
        run = false;
    }

    private static void help() {
        System.out.println("---------------------------------");
        System.out.println("0 -> Hinzufügen");
        System.out.println("\t0 -> Kontakt");
        System.out.println("\t1 -> Telefonnummer");
        System.out.println("1 -> Löschen");
        System.out.println("\t0 -> Kontakt");
        System.out.println("\t1 -> Telefonnummer");
        System.out.println("2 -> Auflisten");
        System.out.println("\t0 -> Kontakte");
        System.out.println("\t1 -> Telefonnummer");
        System.out.println("3 -> Beenden");
        System.out.println("4 -> Hilfemenü anzeigen");
        System.out.println("---------------------------------");
    }

    private static void printTable(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%04d\t%s\n", i, list.get(i).toString());
        }
    }

    private static int readInt() {
        while (true) {
            try {
                String msg = scanner.nextLine();
                return Integer.parseInt(msg);
            } catch (NumberFormatException nfe) {
                System.out.println("Das war keine Zahl, probiere es nochmal!");
            }
        }
    }
}
