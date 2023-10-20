package ejercicios;

import java.util.Scanner;

public class ContandoNumerosMetodos {
    static int contadorPositivos = 0;
    static int contadorNegativos = 0;
    static int contadorCeros = 0;

    /**
     * Metodo main
     * @param args
     */
    public static void main(String[] args) {

        cuentaNumeros();
        muestraResultado();
    }

    /**
     * Método que cuenta nº positivos, negativos y ceros
     */
    private static void cuentaNumeros() {

        Scanner s = new Scanner(System.in);

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
    }

    /**
     * Método que muestra los resultados por pantalla
     */
    private static void muestraResultado() {
        System.out.println(contadorPositivos + " números positivos");
        System.out.println(contadorCeros + " números ceros");
        System.out.println(contadorNegativos + " números negativos");
    }
}
