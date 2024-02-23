package comparacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparacionMain {
    public static void main(String[] args) {
        Persona p1 = new Persona("12345678Z", "Luis", "Lopez", "55512321312");
        Persona p2 = new Persona("66667777A", "Antonio", "Molina", "123213");
        Persona p3 = new Persona("12345678Z", "Isabel", "Garcia", "56456546");
        Persona p4 = new Persona("88889999X", "Manuel", "Perez", "879789789");
        Persona p5 = new Persona("12345678Z", "Alfonso", "Lopez", "755512312");
        Persona p6 = new Persona("32345678Z", "Felipe", "Lopez", "44512321312");
        Persona p7 = new Persona("42345678Z", "Maria", "Lopez", "6612321312");
        Persona p8 = new Persona("82345678Z", "Javier", "Garcia", "56456546");

        List<Persona> lista = new ArrayList<>();

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        lista.add(p7);
        lista.add(p8);

        System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p3));
        System.out.println(p1.compareTo(p4));
        System.out.println(p2.compareTo(p1));

        for (Persona p: lista) {
            System.out.println(p);
        }


        Collections.sort(lista);

        Collections.sort(lista, new ComparadorTelefonoPersona());

        Collections.sort(lista, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return  o1.getDni().compareTo(o2.getDni());
            }
        });


        Collections.sort(lista, (o1, o2) -> o1.getDni().compareTo(o2.getDni()));


        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        for (Persona p: lista) {
            System.out.println(p);
        }


    }
}
