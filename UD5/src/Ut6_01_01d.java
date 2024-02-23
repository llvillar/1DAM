import java.util.Scanner;

public class Ut6_01_01d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;
        String texto, m1 = "", m2 = "", m3 = "", m4 = "", m5 = "";

        System.out.println("Ingrese el texto a evaluar: ");
        texto = sc.nextLine();
        texto = texto.toLowerCase();
        for (i = 0; i < texto.length(); i++) {
            switch (texto.charAt(i)) {
                case 'a':
                    c1++;
                    m1 += "*";
                    break;
                case 'e':
                    c2++;
                    m2 += "*";
                    break;
                case 'i':
                    c3++;
                    m3 += "*";
                    break;
                case 'o':
                    c4++;
                    m4 += "*";
                    break;
                case 'u':
                    c5++;
                    m5 += "*";
                    break;
            }
        }
        System.out.println();
        System.out.println("a" + "    " + c1 + "    " + m1);
        System.out.println("e" + "    " + c2 + "    " + m2);
        System.out.println("i" + "    " + c3 + "    " + m3);
        System.out.println("o" + "    " + c4 + "    " + m4);
        System.out.println("u" + "    " + c5 + "    " + m5);
    }
}
