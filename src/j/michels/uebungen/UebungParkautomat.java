package j.michels.uebungen;

import java.util.Scanner;

public class UebungParkautomat {

    private static final String WRONG_COIN = "Das ist keine akzeptierte Münze!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float p = price(Float.parseFloat(args[0]));
        float paid = 0;

        while (true) {
            System.out.println("Es wurde bereits: " + paid + "€ gezahlt.");
            System.out.println("Der Restbetrag ist: " + p + "€.");
            System.out.print("Werfen sie eine Münze ein: ");
            if(!scanner.hasNextFloat()) {
                System.out.println(WRONG_COIN);
                continue;
            }
            float c = scanner.nextFloat();
            switch ((int)(c * 100)) {
                case 5, 10, 20, 50, 100, 200 -> {
                    p -= c;
                    paid += c;
                }
                default -> System.out.println(WRONG_COIN);
            }

            if(p <= 0) {
                if(p < 0) {
                    System.out.println("Das Wechselgeld beträgt: " + (p * -1) + '€');
                }
                break;
            }
        }
    }

    private static float price(float time) {
        float p = 1.25f;
        int halfs = (int) (Math.floor(time / 30) + 1);
        p += 1.5f * halfs;
        return p;
    }
}
