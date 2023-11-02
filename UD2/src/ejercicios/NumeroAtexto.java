package ejercicios;

import java.util.Scanner;

public class NumeroAtexto {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n;
        while (true) {
            n = s.nextInt();
            if (n <= 0)
                break;
            convierteNumero(n);
            System.out.println("");
        }
    }

    private static void convierteUnidades(int num, boolean esCompuesto) {
        switch (num) {
            case 1:
                System.out.print("uno");
                break;
            case 2:
                System.out.print(esCompuesto ? "dós" : "dos");
                break;
            case 3:
                System.out.print(esCompuesto ? "trés" : "tres");
                break;
            case 4:
                System.out.print("cuatro");
                break;
            case 5:
                System.out.print("cinco");
                break;
            case 6:
                System.out.print(esCompuesto ? "séis" : "seis");
                break;
            case 7:
                System.out.print("siete");
                break;
            case 8:
                System.out.print("ocho");
                break;
            case 9:
                System.out.print("nueve");
                break;
        }
    }

    private static void convierteNumero(int num) {
        int centenas = num / 100;
        int resto = num % 100;
        boolean mostrarUnidades = true;
        boolean esCompuesto = false;

        if (centenas > 0) {
            if (centenas == 1) {
                System.out.print(resto > 0 ? "ciento" : "cien");
            } else {
                convierteUnidades(centenas, false);
                System.out.print("cientos");
            }
            if (resto > 0)
                System.out.print(' ');
        }

        if (resto > 9 && resto < 20) {
            mostrarUnidades = false;
            switch (resto) {
                case 10:
                    System.out.print("diez");
                    break;
                case 11:
                    System.out.print("once");
                    break;
                case 12:
                    System.out.print("doce");
                    break;
                case 13:
                    System.out.print("trece");
                    break;
                case 14:
                    System.out.print("catorce");
                    break;
                case 15:
                    System.out.print("quince");
                    break;
                default:
                    System.out.print("dieci");
                    mostrarUnidades = true;
                    esCompuesto = true;
            }
        } else if (resto == 20) {
            System.out.print("veinte");
        } else if (resto > 20 && resto < 30) {
            System.out.print("veinti");
            esCompuesto = true;
        } else if (resto >= 30) {
            switch (resto / 10) {
                case 3:
                    System.out.print("treinta");
                    break;
                case 4:
                    System.out.print("cuarenta");
                    break;
                case 5:
                    System.out.print("cincuenta");
                    break;
                case 6:
                    System.out.print("sesenta");
                    break;
                case 7:
                    System.out.print("setenta");
                    break;
                case 8:
                    System.out.print("ochenta");
                    break;
                case 9:
                    System.out.print("noventa");
                    break;
            }
            if (resto % 10 != 0) {
                System.out.print(" y ");
            }
        }

        if (mostrarUnidades) {
            convierteUnidades(resto % 10, esCompuesto);
        }
    }

}
