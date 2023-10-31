package bucles;

import java.util.Scanner;

public class FactorialRecursivo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int numero;
        do {

            System.out.print("Ingresa un número para calcular su factorial: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("El factorial no está definido para números negativos.");
            } else {
                long factorial = calcularFactorial(numero);
                System.out.println("El factorial de " + numero + " es " + factorial);
            }

        } while (numero != -1);

        scanner.close();
    }

    public static long calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}
