public class Ut6_01_01b {

    public static void main(String[] args) {

        apartado_a();
        apartado_b();
        apartado_c();
        apartado_d();
        apartado_e();
        apartado_f();
        apartado_g();
        apartado_h();
        apartado_i();

    }

    private static void apartado_i() {
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

    private static void apartado_h() {
        String txt = "Java";
        String txtII = "JavaScript";
        System.out.println("---------------------------------------");
        System.out.println("\tSi comparamos: \n\t" + txt + " con "

                + txtII + "\n\tEl resultado será "
                + txt.equals(txtII));

        System.out.println("---------------------------------------");
    }

    private static void apartado_g() {
        String txt = "java";
        System.out.println(txt + " en mayúsculas: "

                + txt.toUpperCase());

        txt = txt.toUpperCase();
        System.out.println(txt + " en minúsculas: "

                + txt.toLowerCase());
    }

    private static void apartado_f() {
        String txt = "ProgramacionEntornos";
        String txtPartI = txt.substring(0, 12);
        String txtPartII = txt.substring(12);
        System.out.println(txtPartI);
        System.out.println(txtPartII);
        System.out.println(txtPartI.concat(txtPartII));
    }

    private static void apartado_e() {
        String txt = "Java Java Java";
        int vocales = 0, consonantes = 0;
// Con for tradicional
        txt = txt.toLowerCase();
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == 'a' || txt.charAt(i) == 'e' || txt.charAt(i) == 'i'

                    || txt.charAt(i) == 'o' || txt.charAt(i) == 'u') {
                vocales++;
            } else if (txt.charAt(i) != ' ') {
                consonantes++;
            }
        }
        System.out.println(txt + " tiene " + vocales + " vocales y "

                + consonantes + " consonantes");
    }

    private static void apartado_d() {
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
        textoSinEspacios = textoInicial.replace(" ", "");
        System.out.println("Texto original: \t" + textoInicial
                + "\t\t Texto resultante:\t" + textoSinEspacios);
    }

    private static void apartado_c() {
        String txt = "Java desde 0";
// Forma tradicional
        String txtTmp = "";
        for (int i = txt.length() - 1; i >= 0; i--) {
            txtTmp += (txt.charAt(i));
        }
        System.out.println("\tTexto original: " + txt

                + "\tInvertido: \t" + txtTmp);

// Con StringBuilder y reverse(), que se verá más adelante
        StringBuilder stringBuiler = new StringBuilder(txt);
        System.out.println("\tTexto original: " + txt

                + "\tInvertido: \t" + stringBuiler.reverse());
    }

    private static void apartado_b() {
        String txt = "Java";
// Forma tradicional
        for (int i = 0; i < txt.length(); i++) {
            System.out.println(txt.charAt(i));
        }
// Con foreach
        System.out.println("-------------------------");
        for (char character : txt.toCharArray()) {
            System.out.println(character);
        }
    }

    private static void apartado_a() {
        String txt = "This is Java!";
// No hacer así: no tiene sentido
        int contador = 0;
        for (int i = 0; i < txt.length(); i++) {
            contador++;
        }
        System.out.println("\tTexto: " + txt + "\tLongitud: \t" + contador);
// Forma correcta: Con length()
        System.out.println("\tTexto: " + txt + "\tLongitud: \t" + txt.length());
    }
}
