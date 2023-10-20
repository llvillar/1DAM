import java.util.Scanner;

public class ComparacionNumeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce primer numero entero: ");
        int n1 = s.nextInt();
        System.out.println("Introduce segundo numero entero: ");
        int n2 = s.nextInt();

        if(n1 > n2) {
            System.out.println("El numero mayor es " + n1);
        } else {
            System.out.println("El numero mayor es " + n2);
        }

    }
}
