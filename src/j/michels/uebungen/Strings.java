package j.michels.uebungen;

public class Strings {
    public static void main(String[] args) {
        String a = "Max";
        String b = "M";
        b += "a";
        b += "x";
        b = b.intern();

        System.out.println(a == b);
    }
}
