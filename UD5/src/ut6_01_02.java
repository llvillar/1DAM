import java.util.Scanner;

public class ut6_01_02 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String linea = s.nextLine();

        StringBuffer salida = new StringBuffer(linea.length());

        System.out.println(salida.length());

        System.out.println(salida.capacity());


        for (int i = 0; i < linea.length(); i++){
            char c = linea.charAt(i);

            if ( c == '9'){
                salida.append('0');
            } else if (c >= '0' && c <= '8') {
                salida.append((char) (c + 1));
            } else {
                salida.append(c);
            }
        }

        System.out.println(salida);

        System.out.println(salida.length());
        System.out.println(salida.capacity());

    }
}
