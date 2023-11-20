import figuras.Elipse;

import java.util.Scanner;

public class PrincipalElipse {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        System.out.println("Semieje mayor: ");
        double semiejeMayor = s.nextDouble();
        System.out.println("Semieje menor: ");
        double semiejeMenor = s.nextDouble();


        Elipse a = new Elipse();

        a.semiejeMayor = semiejeMayor;
        a.semiejeMenor = semiejeMenor;

        double area = a.calcularArea();
        double perimetro = a.calcularPerimetro();

        System.out.println("area: " + area);
        System.out.println("perimetro: " + perimetro);

        Elipse b = new Elipse();

        b.semiejeMayor = 3;
        b.semiejeMenor = 4;

        System.out.println("area: " + b.calcularArea());
        System.out.println("perimetro: " + b.calcularPerimetro());


        Elipse c = new Elipse(-3);

        System.out.println("area: " + c.calcularArea());
        System.out.println("perimetro: " + c.calcularPerimetro());

        Elipse d = new Elipse();

    }
}
