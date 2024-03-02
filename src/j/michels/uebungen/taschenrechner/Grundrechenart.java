package j.michels.uebungen.taschenrechner;

public enum Grundrechenart {
    ADD('+', (a, b) -> a + b),
    SUB('-', (a, b) -> a - b),
    MUL('*', (a, b) -> a * b),
    DIV('/', (a, b) -> a / b),
    POW('^', Math::pow),
    SQRT('r', (a, b) -> Math.sqrt(a) / Math.sqrt(b));

    private char op;
    private ICalc calc;

    private Grundrechenart(char op, ICalc calc) {
        this.op = op;
        this.calc = calc;
    }

    public char getOp() {
        return this.op;
    }

    public double calc(double a, double b) {
        return this.calc.calc(a, b);
    }
}
