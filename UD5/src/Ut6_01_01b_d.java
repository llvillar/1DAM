public class Ut6_01_01b_d {
    public static void main(String[] args) {
        String textoInicial = "James Gosling Created Java";

        // Con bucle for tradicional
        String textoSinEspacios = "";
        for (int i = 0; i < textoInicial.length(); i++) {
            if (textoInicial.charAt(i) != ' ') {
                textoSinEspacios += textoInicial.charAt(i);
            }
        }
        System.out.println("Texto original: \t" + textoInicial
                + "\t\t Texto resultante:\t" + textoSinEspacios);

        // Con el método .replace()
        textoInicial = "James Gosling Created Java";
        textoSinEspacios = textoInicial.replace(" ","");
        System.out.println("Texto original: \t" + textoInicial
                + "\t\t Texto resultante:\t" + textoSinEspacios);
    }
}
