import java.util.ArrayList;
import java.util.List;

public class VectoresArray {

    public static void main(String[] args) {

        String[] vector = new String[10];

        extracted(vector);


        List<String> lista = new ArrayList<String>();

        lista.add("Hola");
        lista.add("Adios");
        lista.set(1, "hasta luego");
        lista.add("Adios");

        List<String> lista2 = new ArrayList<String>();

        lista2.add("Antonio");
        lista2.add("Maria");

        lista.addAll(lista2);

        lista.add(3,"Fran");

        for (int i = 0; i < lista.size() ; i++) {

            System.out.println(" indice " + i + ":" + lista.get(i));

        }

        for (int i = 0; i < lista2.size() ; i++) {

            System.out.println(" indice " + i + ":" + lista2.get(i));

        }

        lista2.clear();

        for (int i = 0; i < lista2.size() ; i++) {

            System.out.println(" lista 2 indice " + i + ":" + lista2.get(i));

        }

        System.out.println(" lista 1 vacia? " + lista.isEmpty() );

        System.out.println(" lista 2 vacia? " + lista2.isEmpty());

        lista.remove("Antonio");

        lista.remove(2);

        for (int i = 0; i < lista.size() ; i++) {

            System.out.println(" lista indice " + i + ":" + lista.get(i));

        }

        boolean contains = lista.contains("Fran");
        if(contains){
            int index = lista.indexOf("Fran");
            lista.remove(index);
        }

        for (int i = 0; i < lista.size() ; i++) {

            System.out.println(" lista indice " + i + ":" + lista.get(i));

        }


        String a = "Hola";
        String b = new String("Hola");

        int a1 = 4;
        int b1 = 0;

        System.out.println(" a1 " + a1);
        System.out.println(" b1 " + b1);


        int[] vectorEnteros = new int[10];

        vectorEnteros[0] = 5;

        for (int i = 0; i < vectorEnteros.length ; i++) {
            System.out.println(" vectorEnteros indice " + i + ":" + vectorEnteros[i]);
        }

        List<Integer> listaEnteros = new ArrayList<Integer>();
        listaEnteros.add(6);
        Integer value = Integer.valueOf("8");
        listaEnteros.add(value);

        for (int i = 0; i < listaEnteros.size() ; i++) {

            Integer i1 =  listaEnteros.get(i);

            System.out.println(" listaEnteros indice " + i + ":" + listaEnteros.get(i));
        }






    }

    private static void extracted(String[] vector) {
        for (int i = 0; i < vector.length; i++) {

            String a = vector[i];

            System.out.println(" indice " + i + ":" + a);

            //a.length();
        }
    }
}
