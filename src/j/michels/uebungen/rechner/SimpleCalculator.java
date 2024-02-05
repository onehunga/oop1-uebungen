package j.michels.uebungen.rechner;

import java.util.Scanner;

public class SimpleCalculator {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String INVALID_DOUBLE_INPUT = "Das war keine Zahl, bitte gib eine Zahl ein";

    public static void main(String[] args) {
        calculatePyramid();
    }

    private static void calculatePyramid() {
        final double h = readDouble("Wie hoch ist die Pyramide? ");
        final double a = readDouble("Welchse Seitenlänge hat die Pyramide? ");

        final Shape pyramid = new Pyramid(h, a);
        System.out.println("Das Volumen der Pyrammide beträgt: " + pyramid.volume() + " VE");
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
