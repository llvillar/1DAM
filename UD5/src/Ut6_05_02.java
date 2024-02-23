import java.util.Scanner;

public class Ut6_05_02 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = sc.nextInt();
        sc.nextLine();

        while (i-- > 0) casoDePrueba();
        sc.close();
    }

    private static void casoDePrueba() {
        sc.useDelimiter("[\r\n-]+");
        int menor = sc.nextInt();
        int mayor = sc.nextInt();

        if (menor > mayor) {
            int c = menor;
            menor = mayor;
            mayor = c;
        }

        System.out.println((menor + 1 == mayor && menor % 2 == 0) ? "SI" : "NO");
    }
}
