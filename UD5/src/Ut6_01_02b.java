public class Ut6_01_02b {
    public static void main(String[] args) {
        // a) Concatenar
        StringBuffer strBuff =
                new StringBuffer("Hola mundo");
        strBuff.append("!!!");
        System.out.println(strBuff);
        // b) Borrar
        strBuff.deleteCharAt(strBuff.length() - 1);
        System.out.println(strBuff);
        // c) Cambio
        strBuff.replace(0, 1, "h");
        // o también
        strBuff.setCharAt(0, 'h');
        System.out.println(strBuff);
        // d) Insertar
        strBuff.insert(10, '-');
        System.out.println(strBuff);
        // e) Borrar 2
        strBuff.delete(4, 11);
        System.out.println(strBuff);
        // f) Invertir
        strBuff.reverse();
        System.out.println(strBuff);
        // g) Capacidad
        StringBuffer strBuff2 = new StringBuffer();
        System.out.println(strBuff2.capacity());
        strBuff2.append("Esta es una cadena más larga");
        System.out.println(strBuff2.capacity());

    }
}
