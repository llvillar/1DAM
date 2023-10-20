import java.util.Scanner;

public class Heladeria {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Tamaño del helado pequeño(P), mediano(M), grande(G): ");
        char tamano = s.nextLine().charAt(0);

        System.out.println("Topping Sin topping(S) kitkat(K) Brownie(B) lacasitos(L): ");
        char topping = s.nextLine().charAt(0);

        float precio = calcularPrecioDelHelado(tamano, topping);


        System.out.println("El precio del helado es : " + precio);

    }

    private static float calcularPrecioDelHelado(char tamano, char topping) {
        float precio = 0.0f;

        if(tamano == 'P') {
            precio = 1;
        }else if(tamano == 'M'){
            precio = 2;
        }else if (tamano == 'G'){
            precio = 3;
        }

        if(topping != 'S'){
            if(topping == 'K') {
                precio = precio + 1;
            } else {
                if (topping == 'B') {
                    precio = precio + 1.5f;
                } else {
                    precio = precio + 0.8f;
                }
            }
        }
        return precio;
    }
}
