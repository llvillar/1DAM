package figuras;

public class Punto {
    public double x;
    public double y;

    public void moverA(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
