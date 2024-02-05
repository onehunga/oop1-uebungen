package j.michels.uebungen;

import java.util.Scanner;

public class Durchschnittsrechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;

        while (true) {
            System.out.print("gib eine weitere Zahl an oder setze mit q zurück: ");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                count = 0;
                sum = 0;
            }
            else {
                try {
                    sum += Double.parseDouble(input);
                    count++;
                    System.out.println("Der aktuelle mittelwert ist: " + (sum / count));
                } catch(NumberFormatException ex) {
                    System.out.println("Das war keine Zahl!");
                }
            }
        }
    }
}
