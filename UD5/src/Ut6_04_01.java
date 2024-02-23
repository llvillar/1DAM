import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Ut6_04_01 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new HashSet();

        c1.add("Hola");
        c2.add("Hola");

        c1.add("Hola");
        c2.add("Hola");

        c1.add("Adiós");
        c2.add("Adiós");

        System.out.println(c1);
        System.out.println(c2);
    }
}
