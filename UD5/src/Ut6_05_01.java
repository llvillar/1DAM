import java.util.Scanner;
import java.util.regex.Pattern;

public class Ut6_05_01 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (casoDePrueba());
        sc.close();
    }

    private static boolean casoDePrueba() {
        String dato = sc.nextLine();

        if (Pattern.matches("^FIN.*", dato)) {
            return false;
        }

        System.out.println(Pattern.matches("([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]", dato) ? "SI" : "NO");

        return true;
    }
}
