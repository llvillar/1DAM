import java.util.*;

public class Ut6_04_04 {
    public static void main(String[] args) {
        Set<String> hashSetCadenas = new TreeSet<>();
        String cadena;
        Scanner teclado = new Scanner(System.in);

        do {
            cadena = teclado.next();
            if (cadena.equalsIgnoreCase("FIN")) {
                break;
            }
            hashSetCadenas.add(cadena);
        } while (true);

        System.out.println(hashSetCadenas);
    }
}
