import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ut6_01_03 {
    public static void main(String[] args) {
        String cadena;
        String cadenaLarga = "";
        Scanner teclado = new Scanner(System.in);

        do {
            cadena = teclado.nextLine();
            if (cadena.length() > cadenaLarga.length()) {
                cadenaLarga = cadena;
            }
        } while (!cadena.equalsIgnoreCase("FIN"));

        String[] palabras = cadenaLarga.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            if (i % 2 == 0) {
                palabras[i] = palabras[i].toUpperCase();
            } else {
                palabras[i] = palabras[i].toLowerCase();
            }
        }

        Arrays.sort(palabras);

        StringBuffer salida = new StringBuffer();
        for (String palabra : palabras) {
            salida.append(palabra);
            salida.append(' ');
        }
        System.out.println(salida);
    }
}
