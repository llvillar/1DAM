public class MainStringBuffer {
    public static void main(String[] args) {

        String cadena1 = "Hola mundo";

        StringBuffer cadena2 = new StringBuffer();
        StringBuffer cadena3 = new StringBuffer("Hola mundo");
        StringBuffer cadena4 = new StringBuffer(1024);

        StringBuffer cadena5 = new StringBuffer("Hola mundo");

        System.out.println(cadena1);
        System.out.println(cadena2);
        System.out.println(cadena3);
        System.out.println(cadena4);

        System.out.println(cadena3.compareTo(cadena5));

        cadena3.append(" !!!!");
        System.out.println(cadena3);
        System.out.println(cadena3.toString());
        System.out.println(cadena3.length());

        System.out.println(cadena3.insert(4, "adios"));

        System.out.println(cadena3.delete(3,7));

        System.out.println(cadena3.compareTo(cadena5));
        System.out.println(cadena3.length());
        System.out.println(cadena3.capacity());

        cadena3.ensureCapacity(30);
        System.out.println(cadena3.capacity());

        cadena3.trimToSize();

        System.out.println(cadena3.length());
        System.out.println(cadena3.capacity());

        System.out.println(cadena3.charAt(5));
        cadena3.setCharAt(5,'H');
        cadena3.deleteCharAt(1);

        cadena3.reverse();
        System.out.println(cadena3);

        System.out.println(cadena3.replace(1, 7, "que pasa "));


    }
}
