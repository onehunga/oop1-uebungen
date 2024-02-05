package j.michels.uebungen;

import java.util.Random;
import java.util.Scanner;

public class BombeEntschaerfen {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {
        Move bomb = bomb();
        int points = 0, tries = 3;
        while(tries > 0) {
            if(bomb == move()) {
                bomb = bomb();
                points++;
            }
            else {
                bomb = bomb();
                System.out.println("kaboom!");
                tries--;
            }
        }
        System.out.println("Du hast es geschaft " + points + " Bomben zu entschärfen!");
    }

    private static Move bomb() {
        return Move.values()[random.nextInt(3)];
    }

    private static Move move() {
        System.out.print("Wie lautet dein nächster zug? ");
        String input = scanner.nextLine();
        return switch (input.toLowerCase()) {
            case "1", "r", "rot", "red" -> Move.R;
            case "2", "g", "grün", "green" -> Move.G;
            case "3", "b", "blau", "blue" -> Move.B;
            default -> {
                System.out.printf("'%s' ist kein möglicher zug!\n", input);
                // niemals rekursiv schreiben
                yield move();
            }
        };
    }

    private enum Move {
        R,
        G,
        B,
    }

}
