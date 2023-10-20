import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una letra: ");
        char car = s.nextLine().charAt(0);


        if ((car == 'a') || (car == 'A'))
            System.out.println(car + " es una vocal");
        else if ((car == 'e') || (car == 'E'))
            System.out.println(car + " es una vocal");
        else if ((car == 'i') || (car == 'I'))
            System.out.println(car + " es una vocal");
        else if ((car == 'o') || (car == 'O'))
            System.out.println(car + " es una vocal");
        else if ((car == 'u') || (car == 'U'))
            System.out.println(car + " es una vocal");
        else
            System.out.println(car + " no es una vocal");


        System.out.println("Con switch");

        switch (car)
        {
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
                System.out.println(car + " es una vocal");
                break;
            default:
                System.out.println(car + " no es una vocal");
        }

    }
}
