import java.util.*;

public class Ut6_04_06 {
    public static void main(String[] args) {
        Map<String, String> numeros = new HashMap<>();

        numeros.put("uno", "one");
        numeros.put("dos", "two");
        numeros.put("tres", "tree");
        numeros.put("cuatro", "four");
        numeros.put("cinco", "five");
        numeros.put("seis", "six");
        numeros.put("siete", "seven");
        numeros.put("ocho", "eight");
        numeros.put("nueve", "nine");
        numeros.put("diez", "ten");

        String cadena;
        Scanner teclado = new Scanner(System.in);

        do {
            cadena = teclado.next().toLowerCase();
            if (cadena.equalsIgnoreCase("FIN")) {
                break;
            }
            System.out.println(
                numeros.getOrDefault(cadena, "???")
            );
        } while (true);
    }
}
