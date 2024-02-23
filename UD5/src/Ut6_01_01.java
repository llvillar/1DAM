import java.util.Scanner;

public class Ut6_01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String linea = sc.nextLine();
            if (linea.equalsIgnoreCase("FIN")) break;

            // a) minúsculas
            System.out.println(linea.toLowerCase());

            // b) mostrar en orden inverso
            for (int i = linea.length() - 1; i >= 0; i--) {

                System.out.print(linea.charAt(i));
            }
            System.out.println();

            // c) calcular alternando caracteres
            String mayusMinus = "";
            for (int i = 0; i < linea.length(); i++) {
                if (i % 2 == 0) {
                    mayusMinus += Character.toUpperCase(linea.charAt(i));
                } else {
                    mayusMinus += Character.toLowerCase(linea.charAt(i));
                }
            }
            System.out.println(mayusMinus);

            // d) calcular reemplazo de 'a' o 'A' por '@'
            String reemplazo = linea.replace('A', '@');
            reemplazo = reemplazo.replace('a', '@');
            System.out.println(reemplazo);

            // e) contar vocales
            int numA = 0, numE = 0, numI = 0, numO = 0,
                    numU = 0;
            for (int i = 0; i < linea.length(); i++) {
                switch (linea.charAt(i)) {
                    case 'A':
                    case 'a':
                        numA++;
                        break;
                    case 'E':
                    case 'e':
                        numE++;
                        break;
                    case 'I':
                    case 'i':
                        numI++;
                        break;
                    case 'O':
                    case 'o':
                        numO++;
                        break;
                    case 'U':
                    case 'u':
                        numU++;
                        break;
                }
            }
            System.out.println("Número de 'a': " + numA);
            System.out.println("Número de 'e': " + numE);
            System.out.println("Número de 'i': " + numI);
            System.out.println("Número de 'o': " + numO);
            System.out.println("Número de 'u': " + numU);
        }
    }
}
