import java.util.Scanner;

public class Ut6_01_01c_scanner_split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador;

        System.out.println("Ingrese la cadena a evaluar: ");
        String cadena = sc.nextLine();

        contador = cadena.split(" ").length;

        System.out.println("La cadena contiene " + contador + " palabras");
    }
}


