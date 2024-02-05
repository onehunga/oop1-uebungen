package j.michels.uebungen.rechner;

import java.util.Scanner;

public class SimpleCalculator {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String INVALID_DOUBLE_INPUT = "Das war keine Zahl, bitte gib eine Zahl ein";

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.print("Möchtest du das Volumen für eine Pyramide oder einen Kegelstumpf berechnen? ");
            final String cmd = scanner.nextLine().toLowerCase();
            switch (cmd) {
                case "0", "p", "pyramid", "pyramide" -> calculatePyramid();
                case "1", "f", "k", "frustum", "kegelstumpf" -> calculateFrustum();
                case "2", "q", "quit", "exit", "b", "beenden" -> running = false;
                default -> {
                    System.out.println("\n'" + cmd + "' ist keine valide Eingabe!");
                    System.out.println("Die Möglichkeiten lauten wie folgt:");
                    System.out.println("0: Berechnung für die Pyramide");
                    System.out.println("1: Berechnung für den Kegelstumpf");
                    System.out.println("2: Die Anwendung beenden");
                }
            }
        }
    }

    private static void calculatePyramid() {
        final double h = readDouble("Wie hoch ist die Pyramide? ");
        final double a = readDouble("Welchse Seitenlänge hat die Pyramide? ");

        final Shape pyramid = new Pyramid(h, a);
        System.out.println("Das Volumen der Pyrammide beträgt: " + pyramid.volume() + " VE");
    }

    private static void calculateFrustum() {
        final double h = readDouble("Wie hoch ist der Kegelstumpf? ");
        final double r1 = readDouble("Welchen Radius hat das erste Ende? ");
        final double r2 = readDouble("Welchen Radius hat das zweite Ende? ");

        final Shape frustum = new Frustum(h, r1, r2);
        System.out.println("Das Volumen des Kegelstumpfs beträgt: " + frustum.volume() + " VE");
    }

    private static double readDouble(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch(NumberFormatException ex) {
                System.out.println(INVALID_DOUBLE_INPUT);
                System.err.println(ex.getMessage());
            }
        }
    }
}
