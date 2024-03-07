import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ut7_03_04b {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("notas2.dat"))
        ) {
            String nombre = null;
            try {
                nombre = (String) ois.readObject();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            List<Float> calificaciones = (List<Float>) ois.readObject();
            System.out.println("Mostrando calificaciones de " + nombre);
            if (!calificaciones.isEmpty()) {
                System.out.format("Hay %d calificaciones:\n", calificaciones.size());
                float suma = 0;
                for (Float calificacion : calificaciones) {
                    System.out.format("%.2f\n", calificacion);
                    suma += calificacion;
                }
                System.out.format("La media es %.2f\n", suma/calificaciones.size());
            } else {
                System.out.println("No hay ninguna");
            }
        }
    }
}
