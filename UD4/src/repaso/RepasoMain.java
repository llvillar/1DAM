package repaso;

import java.util.Scanner;

public class RepasoMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor de a:");
        int a;

        a = scanner.nextInt();
        System.out.println("Valor de b:");
        int b;
        b = scanner.nextInt();

        int suma = a + b;
        int resta = a - b;
        int producto = a * b;
        int division = a / b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("Division: " + division);

        String salida1 = "Fin de la ejecucion";
        String salida2 = new String("********");

        System.out.println(salida1);
        System.out.println(salida2);

        Suma s = new Suma(a, b);
        System.out.println(s.operacion());

        Resta r = new Resta();
        System.out.println(r.operacion(a, b));

        Producto p = new Producto();
        System.out.println(p.operacion(a, b));

        Division d = new Division();
        System.out.println(d.operacion(a, b));

    }
}
