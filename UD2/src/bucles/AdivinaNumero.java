package bucles;

import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        int num1 , num2;
        num1 = (int) (Math.random()*100 +1);

        int contador = 1;

        do
        {
            System.out.print("Acierta el número(intento " + contador + ");");
            num2 = s.nextInt();

            if (num1 > num2)
            {
                System.out.println("El número es mayor");
            }
            else if (num1 < num2)
            {
                System.out.println("El número es menor");
            }
            else
            {
                System.out.println("¡Acertaste! el número era " + num1);
            }
            contador++;
            if(contador > 10)
                System.out.println("¡Lo siento! el número era " + num1);

        } while (num2 != num1 && contador <= 10);

        s.close();
    }
}
