import java.util.Scanner;

class Mayorde3 {
    public static void main(String[] a)
    {
        double x,y,z;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca primer número real");
        x = entrada.nextDouble();
        System.out.print("Introduzca segundo número real");
        y = entrada.nextDouble ();
        System.out.print("Introduzca el tercer número real");
        z = entrada.nextDouble();
        double mayor;
        if (x > y)
            if (x > z)
                mayor = x;
            else
                mayor = z;
        else
        if (y > z)
            mayor = y;
        else
            mayor = z;
        System.out.println("El mayor es "+mayor);
    }
}