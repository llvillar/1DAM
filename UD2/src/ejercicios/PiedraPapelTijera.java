package ejercicios;

/*

Diseña un programa que elija entre "piedra", "papel" y "tijeras" al azar. Sin mostrarle la
elección, pide al usuario que seleccione una de las tres opciones (repetir hasta que lo
haga, X-Para finalizar el juego). Finalmente, indica qué ha elegido el ordenador y quién ha ganado la partida.
Recuerda que:
Piedra machaca las tijeras
Papel envuelve a la piedra
Tijeras corta al papel
 */

import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        char opcion;
        int elegidoJugador = 0;
        do{

            System.out.println("Elija una opcion:");
            System.out.println("A. Piedra");
            System.out.println("B. Papel");
            System.out.println("C. Tijera");
            System.out.println("------------------");
            System.out.println("X. Para terminar");

            opcion = s.next().charAt(0);

            switch (opcion){
                case 'A':
                case 'a':
                    elegidoJugador = 1;
                    break;
                case 'B':
                case 'b':
                    elegidoJugador = 2;

                    break;
                case 'C':
                case 'c':
                    elegidoJugador = 3;
                    break;
            }

            int elegidoOrdenador = (int) (Math.random() * 3 + 1);

            comprobarJuego(elegidoOrdenador, elegidoJugador);

        }while(opcion != 'X');
    }


    public static void comprobarJuego(int elegidoOrdenador, int elegidoJugador){

        boolean ganaOrdenador, ganaJugador;
        switch (elegidoOrdenador){
            case 1:
                System.out.println("El ordenador ha jugado piedra");
                ganaOrdenador = elegidoJugador == 3;
                ganaJugador = elegidoJugador == 2;
                break;
            case 2:
                System.out.println("El ordenador ha jugado papel");
                ganaOrdenador = elegidoJugador == 1;
                ganaJugador = elegidoJugador == 3;

                break;
            case 3:
                System.out.println("El ordenador ha jugado tijera");
                ganaOrdenador = elegidoJugador == 2;
                ganaJugador = elegidoJugador == 1;
                break;
            default:
                ganaOrdenador = false;
                ganaJugador = false;
        }

        if (ganaOrdenador) {
            System.out.println("Gana el ordenador");
        } else if (ganaJugador) {
            System.out.println("Gana el jugador");
        } else {
            System.out.println("Empate");
        }
    }
}
