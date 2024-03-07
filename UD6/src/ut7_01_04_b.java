import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ut7_01_04_b {
    public static void main(String[] args) {

        Map<Integer, Integer> mapa = new TreeMap<>();

        try (InputStream is = new FileInputStream("ejemplo.txt")) {
            int n = 1;
            while (true) {
                int dato = is.read();
                if (dato == -1) break;
                if (mapa.containsKey(dato)) {
                    mapa.put(dato, mapa.get(dato) + 1);
                } else {
                    mapa.put(dato, 1);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero");
        }
        for (Map.Entry<Integer, Integer> e : mapa.entrySet()) {
            System.out.format("%3d: %d veces\n", e.getKey(), e.getValue());
        }

        System.out.println("********************************************************************");
        System.out.println("********************************************************************");

        Set<Integer> keys = mapa.keySet();
        for (Integer k: keys) {
            System.out.format("%3d: %d veces\n", k, mapa.get(k));

        }


    }
}
