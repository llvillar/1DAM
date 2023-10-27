package bucles;

import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Por favor, ingrese un número (-1 para salir): ");
            numero = scanner.nextInt();

            if (numero != -1) {
                System.out.println("Tabla de multiplicar del " + numero + ":");
                for (int i = 1; i <= 10; i++) {
                    int resultado = numero * i;
                    System.out.println(numero + " x " + i + " = " + resultado);
                }
            }
        } while (numero != -1);

        scanner.close();
    }
}
