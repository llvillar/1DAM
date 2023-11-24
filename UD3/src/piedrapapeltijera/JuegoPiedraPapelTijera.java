package piedrapapeltijera;

import java.util.Random;

public class JuegoPiedraPapelTijera {

    public static void main(String[] args) {

        Jugada[] todasJugadas = Jugada.values();

        Random r = new Random();

        Jugada j1 = Jugada.values()[r.nextInt(Jugada.values().length)];
        Jugada j2 = Jugada.values()[r.nextInt(Jugada.values().length)];

        Jugada j3 = todasJugadas[r.nextInt(todasJugadas.length)];
        Jugada j4 = todasJugadas[r.nextInt(todasJugadas.length)];


        System.out.println("Jugador 1: " + j1);
        System.out.println("Jugador 2: " + j2);

        if (j1.empataCon(j2)){
            System.out.println("Han empatado.");
        } else if (j1.ganaA(j2)) {
            System.out.println("Gana el jugador 1.");
        } else{
            System.out.println("Gana el jugador 2.");
        }


        System.out.println("Jugador 3: " + j3);
        System.out.println("Jugador 4: " + j4);

        if (j3.empataCon(j4)){
            System.out.println("Han empatado.");
        } else if (j3.ganaA(j4)) {
            System.out.println("Gana el jugador 3.");
        } else{
            System.out.println("Gana el jugador 4.");
        }

    }
}
