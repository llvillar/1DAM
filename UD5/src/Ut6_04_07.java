import java.util.*;

public class Ut6_04_07 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(10);
        Random random = new Random();

        // Generar la lista
        for (int i = 0; i < 10; i++) {
            lista.add(random.nextInt(100) + 1);
        }
        System.out.println(lista);

        // Eliminar los múltiplos de 3
        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 3 == 0) iterator.remove();
        }
        System.out.println(lista);

        // Duplicar los múltiplos de 2
        ListIterator<Integer> listIterator = lista.listIterator();
        while (listIterator.hasNext()) {
            int elemento = listIterator.next();
            if (elemento % 2 == 0) listIterator.add(elemento);
        }
        System.out.println(lista);


    }
}
