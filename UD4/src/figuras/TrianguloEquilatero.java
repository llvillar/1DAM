package figuras;

public class TrianguloEquilatero extends FiguraGeometrica{
    private double lado;

    public TrianguloEquilatero(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (lado * ( (lado * Math.sqrt(3)) /2 )) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * lado;
    }
}
