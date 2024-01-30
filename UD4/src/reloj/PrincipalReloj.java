package reloj;

public class PrincipalReloj {
    public static void main(String[] args) {
        Reloj r = new RelojCalendario(
                28, 2, 2001,
                23, 59, 59
        );
        System.out.println(r);
        r.incrementaSegundos(86410);
        System.out.println(r);
        r.dibujar();

        Reloj r2 = new RelojBinario(23, 59, 58);
        r2.dibujar();
        System.out.println(r2);


        System.out.println("Diferencia segundos: " + r2.diferenciaSegundos(r));


        System.out.println(Character.toString(0x2800 + 1));
        System.out.println(Character.toString(0x2800 + 2));
        System.out.println(Character.toString(0x2800 + 3));
        System.out.println(Character.toString(0x2800 + 4));


        System.out.println(Character.toString(97));
        System.out.println(Character.toString(98));
        System.out.println(Character.toString(99));
        System.out.println(Character.toString(100));


        Reloj rrr = new RelojCalendario(
                28, 12, 2023,
                00, 00, 00
        );

        System.out.println(rrr);

        rrr.incrementaSegundos(100*86400);

        System.out.println(rrr);

    }
}
