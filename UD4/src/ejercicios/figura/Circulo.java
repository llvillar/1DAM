package ejercicios.figura;

public class Circulo extends FiguraGeometrica {
    private final double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public void dibujar() {
        System.out.println("╭─╮");
        System.out.println("╰─╯");
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    final public String getTipoPrincipal() {
        return "Círculo";
    }

    @Override
    public String toString() {
        return super.toString() +
                " - Círculo de radio " + radio;
    }
}
