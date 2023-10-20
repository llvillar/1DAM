package bucles;

import java.util.Scanner;

public class Bucle4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce una nota:");
        int nota = s.nextInt();

        double suma = 0;

        do {
            suma += nota; // suma = suma + nota;
            System.out.println("Introduce siguiente nota:");
            nota = s.nextInt();
        } while (nota != -1);


        System.out.println("Final suma de notas: " + suma);


    }
}
