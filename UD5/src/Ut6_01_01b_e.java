public class Ut6_01_01b_e {
    public static void main(String[] args) {
        String txt = "Java Java Java";
        int vocales = 0, consonantes = 0;

        // Con for tradicional
        for (int i = 0; i < txt.length(); i++) {
            txt = txt.replace(" ","");
            if(txt.charAt(i) == 'a' || txt.charAt(i) == 'e' || txt.charAt(i) == 'i'
                    || txt.charAt(i) == 'o' || txt.charAt(i) == 'u') {
                vocales++;
            } else {
                consonantes++;
            }
        }
        System.out.println(txt + " tiene " + vocales + " vocales y "
                + consonantes + " consonantes");
    }

}
