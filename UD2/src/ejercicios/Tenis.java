package ejercicios;

import java.util.Scanner;

public class Tenis {

    public static void main(String[] args) {

        int puntosA = 0;
        int puntosB = 0;
        boolean ventajaA = false;
        boolean ventajaB = false;

        while(puntosA < 4 && puntosB < 4){
            System.out.printf("Juego : %d-%d%n", puntosNumero(puntosA), puntosNumero(puntosB));

            if (ventajaA) {
                System.out.println("A tiene la ventaja");
            } else if (ventajaB) {
                System.out.println("B tiene la ventaja");
            }

            char quien = quienAnota();

            if (quien == 'A') {
                // ¿deuce?
                if (puntosA == 3 && puntosB == 3) {
                    if (ventajaA) {
                        puntosA++;
                    } else {
                        if (ventajaB) {
                            ventajaB = false;
                        } else {
                            ventajaA = true;
                        }
                    }
                } else {
                    puntosA++;
                }
            } else {
                // ¿deuce?
                if (puntosA == 3 && puntosB == 3) {
                    if (ventajaB) {
                        puntosB++;
                    } else {
                        if (ventajaA) {
                            ventajaA = false;
                        } else {
                            ventajaB = true;
                        }
                    }
                } else {
                    puntosB++;
                }
            }
        } // fin while

        System.out.println(puntosA == 4 ? "Gana el juego A" : "Gana el juego B");


    }

    private static char quienAnota() {

        Scanner s = new Scanner(System.in);

        char c;
        do {
            System.out.print("Quien anota? A o B: ");
            c = s.next().charAt(0);
            c = Character.toUpperCase(c); // opcional: mayúsculas
        } while (c != 'A' && c != 'B');

        return c;
    }

private static int puntosNumero(int puntos){
        switch (puntos){
            case 0:
                return 0;
            case 1:
                return 15;
            case 2:
                return 30;
            case 3:
                return 40;
            default:
                return -1;
        }
    }

}
