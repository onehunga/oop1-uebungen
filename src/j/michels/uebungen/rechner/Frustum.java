package j.michels.uebungen.rechner;

public class Frustum implements Shape {

    private static final double pi3 = Math.PI / 3;
    private final double h;
    private final double r1, r2;

    public Frustum(double h, double r1, double r2) {
        this.h = h;
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public double volume() {
        double r = (r1*r1 + r1*r2 + r2*r2);
        return pi3 * h * r;
    }
}
