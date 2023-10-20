import java.util.Scanner;

class SignoNumero  {

    public static void main(String[] a)
    {
        float numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número real");
        numero = entrada.nextFloat();
        // comparar número con cero
        if (numero > 0) {
            System.out.println(numero + " es mayor que cero");
        }

        System.out.println("Paso por aqui");

        if (numero < 0) {
            System.out.println(numero + " es menor que cero");
        }

        if (numero == 0) {
            System.out.println(numero + " es igual que cero");
        }
    }
}
