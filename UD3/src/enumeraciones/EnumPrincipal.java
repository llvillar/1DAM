package enumeraciones;

public class EnumPrincipal {

    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.LUNES;

        DiaSemana dia2 = DiaSemana.valueOf("MARTES");

        System.out.println(dia.name());
        System.out.println(dia.ordinal());

        System.out.println(dia2.ordinal());

        DiaSemana[] dias = DiaSemana.values();

        DiaSemana m = dias[2];

        DiaSemana d = dias[6];


        for (int i = 0; i < dias.length; i++) {

            DiaSemana dd = dias[i];

            System.out.println("El dia es: " + dd.name());

        }


        for (DiaSemana x : DiaSemana.values()) {
            System.out.println("El dia es__ : " + x.name());
        }


    }
}
