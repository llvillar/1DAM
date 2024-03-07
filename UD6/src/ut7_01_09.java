import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ut7_01_09 {

    public static void main(String[] args) {
        String nombreArchivo = "quijote.txt"; // Nombre del archivo a leer

        List<String> palabrasMasLargas = obtenerPalabrasMasLargas(nombreArchivo);

        int longitudesDistintas = obtenerLongitudesDistintas(nombreArchivo);

        System.out.println("Las 5 palabras más largas son:");
        for (String palabra : palabrasMasLargas) {
            System.out.println("- " + palabra);
        }

        System.out.println("\nNúmero de longitudes de palabras distintas: " + longitudesDistintas);
    }

    public static List<String> obtenerPalabrasMasLargas(String nombreArchivo) {
        List<String> palabrasMasLargas = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while ((linea = br.readLine()) != null) {

                //linea = linea.replaceAll("[^\\p{L}\\p{N}]", "");


                String[] palabras = linea.split(" ");
                //Arrays.sort(palabras, Comparator.comparingInt(String::length).reversed());
                List<String> list2 = Arrays.asList(palabras);
                palabrasMasLargas.addAll(list2);
                Collections.sort(palabrasMasLargas, Comparator.comparing(String::length).reversed());
                palabrasMasLargas = palabrasMasLargas.subList(0, Math.min(palabrasMasLargas.size(), 5));

                //palabrasMasLargas.addAll(Arrays.asList(palabras).subList(0, Math.min(palabrasMasLargas.size()-1, 4)));

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return palabrasMasLargas;
    }

    public static int obtenerLongitudesDistintas(String nombreArchivo) {
        Set<Integer> longitudesDistintas = new HashSet<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (String palabra : palabras) {
                    longitudesDistintas.add(palabra.length());
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return longitudesDistintas.size();
    }
}
