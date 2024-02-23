public class Ut6_01_01b_i {
    public static void main(String[] args) {
        String txt = "Jeve jeve jeve";
        String txtModified;

        // Con for tradicional
        txtModified = "";
        System.out.println("---------------------------------------------");
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == 'e') {
                txtModified += 'a';
            } else {
                txtModified += txt.charAt(i);
            }
        }
        System.out.println("Texto original: \t" + txt);
        System.out.println("Texto reemplazado: \t" + txtModified);
        System.out.println("---------------------------------------------");

        // Con .replace()
        System.out.println("---------------------------------------------");
        System.out.println("Texto original: \t" + txt);
        System.out.println("Texto reemplazado: \t"
                + txt.replace('e', 'a'));
        System.out.println("---------------------------------------------");
    }
}
