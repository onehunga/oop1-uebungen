package j.michels.uebungen;

import java.util.ArrayList;
import java.util.Scanner;

public class Paintball {
    private static String[] enemies = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
    private static String[] teammates = { "X", "Y", "Z" };
    private static int hp = 3;
    private static int points = 0;

    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<>();
        x.add("A");
        int s = x.size();
        for (int i = 0; i < s; i++) {
            x.remove(i);
        }
    }

    private static void spielzug() {

    }
}
