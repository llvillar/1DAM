import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ut6_01_01c_buffered_reader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int contador = 1;
        String cadena;

        System.out.println("Ingrese la cadena a evaluar: ");
        cadena = br.readLine();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador++;
            }
        }
        System.out.println("La cadena contiene " + contador + " palabras");
    }
}


