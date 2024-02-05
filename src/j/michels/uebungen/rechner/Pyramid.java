package j.michels.uebungen.rechner;

public class Pyramid implements Shape {

    private double h;
    private double a;

    public Pyramid(double h, double a) {
        this.h = h;
        this.a = a;
    }

    @Override
    public double volume() {
        return (a*a*h) / 3;
    }
}
