import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ut6_04_03b {
    public static void main(String[] args) {
        Set<String> conjuntoCadena = new TreeSet<>();
        conjuntoCadena.add("Uno");
        conjuntoCadena.add("Dos");
        conjuntoCadena.add("Tres");
        conjuntoCadena.add("Uno");
        System.out.println(conjuntoCadena);

        Set<String> conjuntoCadena2 = new HashSet<>();
        conjuntoCadena2.add("Uno");
        conjuntoCadena2.add("Dos");
        conjuntoCadena2.add("Tres");
        conjuntoCadena2.add("Uno");
        conjuntoCadena2.remove("Dos");
        System.out.println(conjuntoCadena2);
    }
}
