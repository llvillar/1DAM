package ejercicios.figura;

public abstract class ParalelogramoTodosLadosIguales extends Paralelogramo {
    private double lado;

    public ParalelogramoTodosLadosIguales(String nombre, double lado) {
        super(nombre, lado, lado);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
}
