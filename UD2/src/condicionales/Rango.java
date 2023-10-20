import java.util.Scanner;

public class Rango {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion = s.nextInt();

        switch (opcion)
        {
            case 0:
                System.out.println("Cero!");
                break;
            case 1:
                System.out.println("Uno!");
                break;
            case 2:
                System.out.println("Dos!");
                break;
            default:
                System.out.println("Fuera de rango!");
        }

        System.out.println("Segundo switch!");

        switch (opcion)
        {
            case 0:
            case 1:
            case 2:
                System.out.println("Menor que 3!");
                break;
            case 3:
                System.out.println("Igual a 3!");
                break;
            default:
                System.out.println("Mayor que 3!");
        }

        System.out.println("Adios!");


    }
}
