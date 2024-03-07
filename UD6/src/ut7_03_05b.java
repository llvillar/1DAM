import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Map;

public class ut7_03_05b {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("notas3.dat"))
        ) {
            Map<String, List<Float>> grupo = (Map<String, List<Float>>) ois.readObject();
            for (Map.Entry<String, List<Float>> e : grupo.entrySet()) {
                System.out.println("Mostrando calificaciones de " + e.getKey());
                List<Float> calificaciones = e.getValue();
                if (!calificaciones.isEmpty()) {
                    System.out.format("Hay %d calificaciones:\n", calificaciones.size());
                    float suma = 0;
                    for (Float calificacion : calificaciones) {
                        System.out.format("%.2f\n", calificacion);
                        suma += calificacion;
                    }
                    System.out.format("La media es %.2f\n", suma / calificaciones.size());
                } else {
                    System.out.println("No hay ninguna");
                }
            }
        }
    }
}
