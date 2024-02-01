package ejercicios.figura;

public class TrianguloRectangulo extends Triangulo {
    public TrianguloRectangulo(String nombre, double base, double altura) {
        super(nombre, base, altura);
    }

    @Override
    public double getPerimetro() {
        double lado = Math.sqrt(
                getBase() * getBase() +
                getAltura() * getAltura()
        );

        return getBase() + getAltura() + lado;
    }
}
