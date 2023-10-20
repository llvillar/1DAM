package bucles;

import java.util.Scanner;

public class SumaNotasFor {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int suma = 0;

        for(int i = 1; i<=10; i++) {
            System.out.println("Introduce la nota " + i);
            int nota = s.nextInt();
            suma += nota;
        }

        System.out.println("La suma total es: " +  suma);

    }
}
