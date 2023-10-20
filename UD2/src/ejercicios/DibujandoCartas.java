package ejercicios;

import java.util.Scanner;

public class DibujandoCartas {
    public static void main(String[] args) {

        String numeroCarta = obtenerNumeroCarta();
        String paloCarta = obtenerPaloCarta();
        dibujarCarta(numeroCarta, paloCarta);
    }

    private static String obtenerPaloCarta() {

        Scanner s = new Scanner(System.in);

        System.out.print(">");
        char palo = s.next().charAt(0);

        String paloCarta;
        switch (palo) {
            case 'C':
                paloCarta = "COPAS";
                break;
            case 'E':
                paloCarta = "ESPADAS";
                break;
            case 'O':
                paloCarta = "OROS";
                break;
            case 'B':
                paloCarta = "BASTOS";
                break;
            default:
                paloCarta = "XXX";
        }

        return paloCarta;
    }

    private static String obtenerNumeroCarta() {
        Scanner s = new Scanner(System.in);

        System.out.print(">");
        int numero = s.nextInt();

        String numeroCarta;
        switch (numero) {
            case 1:
                numeroCarta = "AS";
                break;
            case 10:
                numeroCarta = "SOTA";
                break;
            case 11:
                numeroCarta = "CABALLO";
                break;
            case 12:
                numeroCarta = "REY";
                break;
            default:
                numeroCarta = String.valueOf(numero);
        }

        return numeroCarta;

    }

    public static void dibujarCarta(String numero, String palo){

        for (int i = 0; i < 2; i++) {
            pintarFila('+','-',"",14, 'D');

            if(i == 0){
                pintarFila('|',' ',numero,14, 'D');
                pintarFila('|',' ',palo,14, 'D');

                for (int j = 0; j < 4; j++){
                    pintarFila('|',' ',"",14, 'D');
                }

                pintarFila('|', ' ', palo, 14, 'I');
            }
        }



       // pintarFila('+','-',"",14, 'D');

        /*
        System.out.println();

        System.out.println("+------------+");
        System.out.println("| 5          |");
        System.out.println("| COPAS      |");
        System.out.println("|            |");
        System.out.println("|            |");
        System.out.println("|            |");
        System.out.println("|            |");
        System.out.println("|          5 |");
        System.out.println("+------------+");
        */


    }

    public static void pintarFila(char delimitador, char relleno, String contenido, int tamano, char direccion){

        while (contenido.length() < (tamano-4)){
            if(direccion == 'D')
                contenido = contenido + String.valueOf(relleno);
            else
                contenido = String.valueOf(relleno) + contenido;
        }
        contenido = String.valueOf(delimitador) + String.valueOf(relleno) + contenido + String.valueOf(relleno) + String.valueOf(delimitador);

        System.out.println(contenido);

    }
}
