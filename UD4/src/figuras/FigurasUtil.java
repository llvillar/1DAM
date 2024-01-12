package figuras;

import java.util.List;
import java.util.Scanner;

public class FigurasUtil {

    public static Circulo crearCirculo(Scanner sn) {

        System.out.println("Introduce nombre de la figura:");
        String nombre = sn.next();

        System.out.println("Introduce en radio:");
        double radio = sn.nextDouble();

        Circulo c = new Circulo(nombre, radio);

        return c;
    }

    public static Cuadrado crearCuadrado(Scanner sn) {

        System.out.println("Introduce nombre de la figura:");
        String nombre = sn.next();

        System.out.println("Introduce el lado:");
        double radio = sn.nextDouble();

        Cuadrado c = new Cuadrado(nombre, radio);

        return c;
    }

    public static TrianguloEquilatero crearTriangulo(Scanner sn) {

        System.out.println("Introduce nombre de la figura:");
        String nombre = sn.next();

        System.out.println("Introduce el lado:");
        double radio = sn.nextDouble();

        TrianguloEquilatero t = new TrianguloEquilatero(nombre, radio);

        return t;
    }

    public static void calcularAreas(List<FiguraGeometrica> figuras, Scanner sn) {

//        for (FiguraGeometrica f: figuras) {

        for (int i = 0; i < figuras.size(); i++) {

            FiguraGeometrica f = figuras.get(i);

            System.out.println("Area de " + f.getNombre() + ": " + f.calcularArea());
        }
        System.out.println("Pulse cualquier tecla para continuar");
        sn.next();

    }

    public static void calcularPerimetro(List<FiguraGeometrica> figuras, Scanner sn) {
        for (FiguraGeometrica f: figuras) {
            System.out.println("Perimetro de " + f.getNombre() + ": " + f.calcularPerimetro());
        }
        System.out.println("Pulse cualquier tecla para continuar");
        sn.next();
    }
}
