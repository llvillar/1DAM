import java.util.Scanner;

public class Ut6_01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String linea = sc.nextLine();
            if (linea.equalsIgnoreCase("FIN")) break;

            StringBuffer salida = new StringBuffer(linea.length());

            for (int i = 0; i < linea.length(); i++) {
                char c = linea.charAt(i);

                if (c == '9') {
                    salida.append('0');
                } else if (c >= '0' && c <= '8') {
                    salida.append((char) (c + 1));
                } else {
                    salida.append(c);
                }
            }

            System.out.println(salida);
        }
    }
}
