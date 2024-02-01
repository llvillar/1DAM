package ejercicios.figura;

public class PrincipalFigura {
    public static void main(String[] args) {
        FiguraGeometrica f1 = new TrianguloRectangulo("Casilla", 3, 4);
        FiguraGeometrica f2 = new Trapecio("Trap", 10, 5, 2);
        FiguraGeometrica f3 = new Rectangulo("Celda", 10, 5);
        FiguraGeometrica f4 = new Rombo("Casilla", 10);

        // f1
        System.out.println(f1);
        f1.dibujar();

        System.out.println("Perímetro: " + f1.getPerimetro());
        System.out.println("Área: " + f1.getArea());
        System.out.println();

        // f2
        System.out.println(f2);
        f2.dibujar();

        System.out.println("Perímetro: " + f2.getPerimetro());
        System.out.println("Área: " + f2.getArea());
        System.out.println();
    }
}
