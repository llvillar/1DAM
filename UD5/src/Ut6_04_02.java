import java.util.ArrayList;
import java.util.Collections;

public class Ut6_04_02 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Hola");
        al.add("Adiós");
        al.add("Saludo");
        al.add("Despedida");

        Collections.sort(al);

        System.out.println(al.get(0) + " - " + al.get(al.size() - 1));
    }
}
