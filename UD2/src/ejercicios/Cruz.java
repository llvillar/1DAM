package ejercicios;

import java.util.Scanner;

public class Cruz {
    public static void main(String[] args) {
        System.out.println("Introduce un numero:");
        Scanner s = new Scanner(System.in);

        int numero = s.nextInt();
        if(numero % 2 == 1 && numero >= 1){
            for(int i = 0; i < numero; i++){
                if(i == numero/2){
                    for(int j = 0; j < numero; j++) System.out.print("X");
                }else{
                    for(int j = 0; j < numero/2; j++) System.out.print(" ");
                        System.out.print("X");
                }
                System.out.print("\n");
            }
        }else{
            System.out.println("Número no válido.");
        }

    }

}
