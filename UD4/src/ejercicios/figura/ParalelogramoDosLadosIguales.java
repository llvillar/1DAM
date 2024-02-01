package ejercicios.figura;

public abstract class ParalelogramoDosLadosIguales extends Paralelogramo {
    private double base;
    private double altura;

    public ParalelogramoDosLadosIguales(String nombre, double base, double altura) {
        super(nombre, base, altura);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
