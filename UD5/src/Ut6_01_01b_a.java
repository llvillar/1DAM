public class Ut6_01_01b_a {
    public static void main(String[] args) {
        String txt = "This is Java!";

        // Forma tradicional
        int contador = 0;
        for (int i = 0; i < txt.length(); i++) {
            contador++;
        }
        System.out.println("\tTexto: " + txt + "\tLongitud: \t" + contador);

        // Con length()
        System.out.println("\tTexto: " + txt + "\tLongitud: \t" + txt.length());
    }
}
