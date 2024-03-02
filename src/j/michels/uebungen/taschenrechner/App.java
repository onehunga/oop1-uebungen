package j.michels.uebungen.taschenrechner;

import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("a: ");
            double a = Double.parseDouble(scanner.nextLine());

            System.out.print("b: ");
            double b = Double.parseDouble(scanner.nextLine());

            System.out.print("rechenart: ");
            char c = scanner.nextLine().charAt(0);

            for (Grundrechenart art : Grundrechenart.values()) {
                if(art.getOp() == c) {
                    System.out.printf("%g %c %g = %g\n", a, art.getOp(), b, art.calc(a, b));
                }
            }
        }
    }
}
