import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class ut7_03_05a {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            Map<String, List<Float>> grupo = new LinkedHashMap<>();
            while (true) {
                System.out.print("Introduce el nombre del estudiante: ");
                String nombre;
                do { nombre = sc.nextLine(); } while (nombre.isEmpty());
                if (nombre.equalsIgnoreCase("FIN")) break;
                List<Float> calificaciones = new ArrayList<>();
                System.out.println("Introduce las calificaciones, -1 para terminar:");
                while (true) {
                    float calificacion = sc.nextFloat();
                    if (calificacion == -1) break;
                    calificaciones.add(calificacion);
                }
                grupo.put(nombre, calificaciones);
            }
// Guardar datos
            try (ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("notas3.dat"))
            ) {
                oos.writeObject(grupo);
            }
        }
    }
}
