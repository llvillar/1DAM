package ejercicios.figura;

public abstract class Paralelogramo extends Cuadrilatero {
    private double lado1;
    private double lado2;

    public Paralelogramo(String nombre, double l1, double l2) {
        super(nombre, l1, l2, l1, l2);
        lado1 = l1;
        lado2 = l2;
    }

    @Override
    public double getArea() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return super.toString() + " - Paralelogramo";
    }
}
