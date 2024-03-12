import notasestudiante.Estudiante;
import notasestudiante.EstudianteV2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

public class ut7_03_06b_v2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("notas5.dat"))
        ) {
            LinkedList<EstudianteV2> grupo = (LinkedList<EstudianteV2>) ois.readObject();

            for (EstudianteV2 e: grupo){
                System.out.println("Mostrando calificaciones de " + e.getNombre());
                List<Float> calificaciones = e.getNotas();
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
