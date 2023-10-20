package bucles;

import java.util.Scanner;

public class Bucle2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce una nota:");
        int nota = s.nextInt();

        double suma = 0;

        while (nota != -1){
            suma += nota; // suma = suma + nota;
            System.out.println("Introduce siguiente nota:");
            nota = s.nextInt();
        }
        System.out.println("Final suma de notas: " + suma);


    }
}
