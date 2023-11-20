package bucles;

import java.util.Scanner;

public class Piramide{

    final static char BLANCO = ' ';
    final static char ASTERISCO = '*';

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int altura;
        do {
            System.out.print("Introduce la altura de la piramide:");
            altura = s.nextInt();

            if(altura != -1){

                piramide(altura);
                piramideInversa(altura);

            }

        }while(altura != -1);




    }

    private static void piramide(int altura) {

        for (int fila = 1; fila <= altura ; fila++) {

            for (int blancos = altura-fila; blancos >0 ; blancos--) {
                System.out.print(BLANCO);
            }
            for (int as = 1; as < 2*fila ; as++) {
                System.out.print(ASTERISCO);
            }
            System.out.println("");
        }
    }



    private static void piramideInversa(int altura) {

        for (int fila = 1, asteriscos = 2*altura-1; fila <=altura ; fila++, asteriscos -=2) {

            for (int blancos = 0; blancos < fila -1 ; blancos++) {
                System.out.print(BLANCO);
            }

            for (int as = asteriscos; as !=0 ; as--) {
                System.out.print(ASTERISCO);
            }

            System.out.println("");
        }
    }
}