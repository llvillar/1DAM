package ejercicios;

import java.util.Scanner;

public class ContandoNumeros {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        for (int i = 0; i < 10; i++) {

            int numero = s.nextInt();

            if (numero > 0){
                contadorPositivos++;
            } else if (numero < 0){
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        System.out.println(contadorPositivos + " números positivos");
        System.out.println(contadorCeros + " números ceros");
        System.out.println(contadorNegativos + " números negativos");

    }
}
