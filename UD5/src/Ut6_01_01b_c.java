public class Ut6_01_01b_c {
    public static void main(String[] args) {
        String txt = "Java desde 0";

        // Con forma tradicional
        String txtTmp = "";
        for (int i = txt.length()-1; i >= 0 ; i--) {
            txtTmp += (txt.charAt(i));
        }
        System.out.println("\tTexto original: " + txt
                + "\tInvertido: \t" + txtTmp);

        // Con StringBuilder y reverse(), que se verá más adelante
        StringBuilder stringBuiler = new StringBuilder(txt);
        System.out.println("\tTexto original: " + txt
                + "\tInvertido: \t" + stringBuiler.reverse());
    }
}
