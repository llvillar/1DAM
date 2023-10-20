package ejercicios;

import java.util.Scanner;

/**
 *
 */
public class ContandoAutobusesMetodos {
    static final int personasPorAutobus = 55;
    static int total = 0;
    static int personas = 0;

    /**
     * Método main
     * @param args
     */
    public static void main(String[] args) {

        getPersonasViaje();

        mostrarResultado();

    }

    /**
     *
     */
    private static void mostrarResultado() {
        int numeroAutobuses = total / personasPorAutobus;

        if(numeroAutobuses * personasPorAutobus < total) numeroAutobuses++;

        System.out.printf("Son necesarios %d autobuses", numeroAutobuses);
    }

    /**
     *
     */
    private static void getPersonasViaje() {
        Scanner s = new Scanner(System.in);


        do {

            System.out.print("Personas del grupo (0=FIN): > ");
            personas = s.nextInt();

            if (personas < 0){
                System.out.println("No puede ser negativo.");
            } else if (personas != 0){
                total += personas;
                System.out.printf("Apuntados. Van %d%n", total);

            }

        } while(personas != 0);
    }
}
