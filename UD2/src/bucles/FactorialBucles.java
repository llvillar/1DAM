package bucles;

import java.util.Scanner;

public class FactorialBucles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {

            System.out.print("Ingresa un número para calcular su factorial: ");
            numero = scanner.nextInt();

            long factorial = 1; // Usamos 'long' para manejar factoriales grandes.

            if (numero < 0) {
                System.out.println("El factorial no está definido para números negativos.");
            } else {
                for (int i = 1; i <= numero; i++) {
                    factorial = factorial * i;
                }
                System.out.println("El factorial de " + numero + " es " + factorial);
            }

        } while (numero != -1);

        scanner.close();
    }
}
