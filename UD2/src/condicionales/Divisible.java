import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Divisible {

    public static void main(String[] args) {
        int n, d;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca dos enteros:");
        n = entrada.nextInt();
        d = entrada.nextInt();
        if (n%d == 0)
            System.out.println(n +" es divisible por "+d);
        else
            System.out.println(n +" no es divisible por "+d);


        System.out.println("Fin del programa");

    }
}