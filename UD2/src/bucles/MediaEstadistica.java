package bucles;

import java.util.Scanner;

public class MediaEstadistica {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int edad, mediaE = 0, sumaE = 0, countE = 0, countA = 0;
        float altura, mediaA = 0, sumaA = 0;

        int contador = 0;

        do {

            System.out.print("Introduce edad (-1 para terminar)>");
            edad = s.nextInt();

            if (edad != -1) {

                System.out.print("Introduce altura en cm>");
                altura = s.nextInt();

                contador++;
                sumaE += edad;
                sumaA += altura;

                if (edad >= 18) {
                    countE++;
                }
                if (altura > 175) {
                    countA++;
                }
            }
        } while (edad != -1);

        mediaE = sumaE / contador;
        mediaA = sumaA / contador;

        System.out.println("Media edad: " + mediaE);
        System.out.println("Media altura: " + mediaA);
        System.out.println("Mayores 18: " + countE);
        System.out.println("Mas de 175cm: " + countA);

        s.close();
    }
}
