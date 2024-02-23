
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainString {
    public static void main(String[] args) {

        String cadena = null;

        System.out.println(cadena);

        cadena = "Hola mundo";

        String cadena2 = cadena;

        System.out.println(cadena2);

        //cadena2 = cadena2 + " adios";

        System.out.println(cadena2);

        String cadena3 = cadena.toUpperCase();

        System.out.println(cadena.toUpperCase());

        System.out.println(cadena);

        cadena = cadena.toUpperCase();

        System.out.println(cadena);

        String cadena4 = "Hola mundo";
        cadena4 = cadena4 + "!!!";


        String cadena5 = new String("Hola caracola");

        char[] charArray = cadena5.toCharArray();

        char[] charArray2 = {'a','b','c'};
        char[] charArray3 = new char[6];


        for (int i = 0; i < charArray.length; i++){
            System.out.println(charArray[i]);
        }

        for (int i = 0; i < charArray2.length; i++){
            System.out.println(charArray2[i]);
        }

        String cadena6 = new String(charArray2);

        System.out.println(cadena6);

        String cadena7 = new String(charArray,3,6);

        System.out.println(cadena7);

        String cadena8 = 2 + 3 + " cervezas";
        String cadena9 = "cervezas " + 2 + 3;
        String cadena10 = "cervezas " + 2 + 3;

        System.out.println(cadena8);
        System.out.println(cadena9);

        System.out.println(cadena10.length());
        System.out.println(cadena10.toUpperCase());
        System.out.println(cadena10.toLowerCase());

        System.out.println(cadena10.equals(cadena9));

        System.out.println(cadena10.equalsIgnoreCase(cadena9));

        System.out.println(cadena10.toLowerCase().equals(cadena9.toLowerCase()));

        System.out.println(cadena10.compareTo(cadena9));
        System.out.println(cadena9.compareTo(cadena10));

        System.out.println(cadena9.concat(cadena10));
        cadena9 = cadena9.concat(cadena10);
        System.out.println(cadena9);

        System.out.println(cadena9.repeat(4));

        String cadena11 = " Adios mundo cruel ";

        System.out.println("*" + cadena11 + "*");

        System.out.println("*" + cadena11.trim() + "*");

        System.out.println("*" + cadena11.strip() + "*");

        System.out.println("*" + cadena11.stripLeading() + "*");
        System.out.println("*" + cadena11.stripTrailing() + "*");
        System.out.println("*" + cadena11.stripIndent() + "*");

        System.out.println(cadena11.isEmpty());
        System.out.println(cadena11.isBlank());

        System.out.println(cadena11.charAt(3));

        System.out.println(cadena11.substring(3));
        System.out.println(cadena11.substring(3, cadena11.length()));


        System.out.println(cadena11.indexOf('m'));

        System.out.println(cadena11.substring(7));

        System.out.println(cadena11.indexOf("mundo"));

        System.out.println(cadena11.lastIndexOf("cruel"));

        System.out.println(cadena11.indexOf('u'));
        System.out.println(cadena11.lastIndexOf('u'));

        System.out.println(cadena11.replace('u','@'));

        System.out.println(cadena11.replace('u','@'));

        System.out.println(cadena10.startsWith("cer"));

        String cadena12 = cadena11.repeat(10);


        String[] s = cadena12.split("u");

        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }


    }
}