package ejercicios.figura;

public class Cuadrado extends ParalelogramoTodosLadosIguales {
    public Cuadrado(String nombre, double lado) {
        super(nombre, lado);
    }

    @Override
    public String toString() {
        return super.toString() + " - Cuadrado de lado " + getLado();
    }

    @Override
    public void dibujar() {
        System.out.println("+----+");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println("+----+");
    }
}
