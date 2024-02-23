import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ut6_04_05b_hash {
    public static void main(String[] args) {
        Map<Integer, String> diccionarioCadena = new HashMap<>();
        diccionarioCadena.put(11, "Hola");
        diccionarioCadena.put(7, "Prueba");
        diccionarioCadena.put(3, "Mundo");
        diccionarioCadena.put(8, "Saludo");
        diccionarioCadena.put(3, "Adiós");
        diccionarioCadena.remove(2);
        System.out.println(diccionarioCadena);
        System.out.println(diccionarioCadena.get(3));
    }
}
