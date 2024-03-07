import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ut7_03_04a {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.print("Introduce el nombre del estudiante: ");
        nombre = sc.nextLine();
        List<Float> calificaciones = new ArrayList<>();
        System.out.println("Introduce las calificaciones, -1 para terminar:");
        while (true) {
            float calificacion = sc.nextFloat();
            if (calificacion == -1) break;
            calificaciones.add(calificacion);
        }
// Guardar datos
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("notas2.dat"))
        ) {
            try {
                oos.writeObject(nombre);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            oos.writeObject(calificaciones);
        }
    }
}
