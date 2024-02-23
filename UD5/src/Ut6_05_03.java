import java.util.Scanner;
import java.util.regex.Pattern;

public class Ut6_05_03 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = sc.nextInt();
        sc.nextLine();

        while (i-- > 0) casoDePrueba();
        sc.close();
    }

    private static void casoDePrueba() {
        String dato = sc.nextLine();

        System.out.println(Pattern.matches("(\\d{4}[BCDFGHJKLMNPQRSTVWXYZ]{3})|[A-Z]{1,2}\\d{4}[A-Z]{1,2}", dato) ? "SI" : "NO");
    }
}
