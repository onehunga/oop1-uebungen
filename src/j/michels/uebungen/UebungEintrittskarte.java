package j.michels.uebungen;

import java.util.Calendar;
import java.util.Scanner;

public class UebungEintrittskarte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK) - 1;
        day = day == 0 ? 7 : day;

        System.out.println("Wie alt bist du?");
        int age = scanner.nextInt();

        System.out.println("Bist du ein Student?");
        boolean isStudent = false;

        String a = scanner.next();
        switch (a) {
            case "ja", "yes", "true" -> isStudent = true;
        }

        System.out.println("Der Eintrittspreis beträgt " + price(day, age, isStudent) + '€');
    }

    static int price(int tag, int age, boolean isStudent) {
        int p = 10;
        if(tag == 1 || tag == 2) {
            p  -= 2;
        }
        else if(tag == 6 || tag == 7) {
            p  += 1;
        }
        if(age <= 14) {
            p  -= 3;
        }
        if(isStudent) {
            p  -= 2;
        }
        return p ;
    }
}
