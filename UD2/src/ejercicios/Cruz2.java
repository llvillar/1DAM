package ejercicios;

import java.util.Scanner;

public class Cruz2 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero:");
        Scanner s = new Scanner(System.in);

        int numero = s.nextInt();
        if(numero % 2 == 1 && numero >= 1){
            for(int i = 0; i < numero; i++){
                for(int j = 0; j < numero; j++) {
                    if ( i == numero/2 || j == numero/2){
                        System.out.print("X");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
        }else{
            System.out.println("Número no válido.");
        }

    }

}
