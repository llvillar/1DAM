package ejercicios;

import java.util.Scanner;

public class RellenandoPuntos {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print(">");
        String cadena = s.nextLine();

        System.out.print(">");
        int longitud = s.nextInt();

        System.out.print(">");
        char direccion = s.next().charAt(0);

        if (cadena.length() > longitud) {
            System.out.print("La cadena no cabe");
        } else{

            switch (direccion){
                case 'D':
                    completarDerecha(cadena, longitud);
                    break;
                case 'I':
                    completarIzquierda(cadena, longitud);
                    break;
                default:
                    System.out.print("La dirección debe ser I o D");
            }
        }
    }

    public static void completarDerecha(String cadena, int longitud) {

        while(cadena.length() < longitud){
            cadena = "." + cadena;
        }

        System.out.print(cadena);
    }

    public static void completarIzquierda(String cadena, int longitud) {

        while(cadena.length() < longitud){
            cadena = cadena + ".";
        }

        System.out.print(cadena);
    }
}
