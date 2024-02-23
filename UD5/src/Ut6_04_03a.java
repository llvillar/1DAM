import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ut6_04_03a {
    public static void main(String[] args) {
        Set<String> conjuntoCadena = new HashSet<>();
        conjuntoCadena.add("Uno");
        conjuntoCadena.add("Dos");
        conjuntoCadena.add("Tres");
        conjuntoCadena.add("Cuatro");
        System.out.println(conjuntoCadena);

        Set<String> conjuntoCadena2 = new TreeSet<>();
        conjuntoCadena2.add("Uno");
        conjuntoCadena2.add("Dos");
        conjuntoCadena2.add("Tres");
        conjuntoCadena2.add("Cuatro");
        System.out.println(conjuntoCadena2);

    }
}
