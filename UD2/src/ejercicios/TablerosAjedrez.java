package ejercicios;

import java.util.Scanner;

public class TablerosAjedrez {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char c = s.next().charAt(0);

        pintarborde(n);
        System.out.print("\n");

        //Resto del tablero
        for (int fila = 0; fila < 8; fila++) {

            for (int i = 0; i < n - 2 ; i++) {
                System.out.print("|");
                for (int columna = 0; columna < 8; columna++) {
                    if((fila + columna) %2 != 0){
                        repetir(c, n - 2);
                    }else{
                        repetir(' ' , n - 2);
                    }
                    System.out.print("|");
                }
                System.out.print("\n");
            }
            pintarborde(n);
            System.out.print("\n");
        }
    }

    private static void pintarborde(int n) {
        System.out.print("+");
        for (int columna = 0; columna < 8; columna++) {
            repetir('-', n - 2 );
            System.out.print("+");
        }
    }

    private static void repetir(char c, int veces){
        while (veces-- > 0){
            System.out.print(c);
        }
    }
}
