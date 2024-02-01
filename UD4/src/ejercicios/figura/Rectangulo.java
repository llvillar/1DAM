package ejercicios.figura;

public class Rectangulo extends ParalelogramoDosLadosIguales {
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre, base, altura);
    }

    @Override
    public String toString() {
        return super.toString() + " - Rectángulo de " +
                getBase() + " x " + getAltura();
    }

    @Override
    public void dibujar() {
        System.out.println("+-----------+");
        System.out.println("|           |");
        System.out.println("|           |");
        System.out.println("+-----------+");
    }
}
