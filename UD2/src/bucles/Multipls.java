package bucles;

public class Multipls {

    public static void main(String[] args) {

        final int CLAVE = 3;
        final int RANGO = 10;
        int n = (int)(Math.random()*RANGO) +1;
        for (int i = 0; i < n; i++)
        {
            int numero;
            numero = (int)(Math.random()*RANGO) +1;
            if (numero % CLAVE == 0)
            {
                System.out.println();
                //continue;
                break;
            }
            System.out.print(" " + numero);
        }
    }
}
