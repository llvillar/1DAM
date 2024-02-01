package ejercicios.figura;

public class Romboide extends ParalelogramoDosLadosIguales {
    public Romboide(String nombre, double base, double altura) {
        super(nombre, base, altura);
    }

    @Override
    public String toString() {
        return super.toString() + " - Romboide de " +
                getBase() + " y " + getAltura();
    }

    @Override
    public void dibujar() {
        System.out.println("   +-----------+");
        System.out.println("  /           /");
        System.out.println(" /           /");
        System.out.println("+-----------+");
    }
}
