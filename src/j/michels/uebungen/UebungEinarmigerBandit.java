package j.michels.uebungen;

import java.util.Random;

public class UebungEinarmigerBandit {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(7);
        int b = random.nextInt(7);
        int c = random.nextInt(7);

        System.out.printf("a: %d b: %d c: %d\n", a, b, c);

        if(a == b && a == c) {
            System.out.println("Super, Sie haben gewonnen!");
        }
        else if (a == b || b == c || a == c) {
            System.out.println("Fast geschafft!");
        }
        else {
            System.out.println("Mehr Glück beim nächsten Mal!");
        }
    }
}
