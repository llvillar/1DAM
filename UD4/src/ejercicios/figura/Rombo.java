package ejercicios.figura;

public class Rombo extends ParalelogramoTodosLadosIguales {
    public Rombo(String nombre, double lado) {
        super(nombre, lado);
    }

    @Override
    public String toString() {
        return super.toString() + " - Rombo de lado " + getLado();
    }

    @Override
    public void dibujar() {
        System.out.println("  .");
        System.out.println(" / \\");
        System.out.println("/   \\");
        System.out.println("\\   /");
        System.out.println(" \\ /");
        System.out.println("  ·");
    }
}
