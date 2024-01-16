package figuras;

import figuras.exceptions.LadoNoValidoException;

public class Cuadrado extends FiguraGeometrica{
    private double lado;

    public Cuadrado(String nombre, double lado) throws LadoNoValidoException{
        super(nombre);
        setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws LadoNoValidoException{
        if (lado < 0){
            throw new LadoNoValidoException("El lado del cuadrado no es válido");
        }
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
