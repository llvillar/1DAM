import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ut7_03_01a {
    public static void main(String[] args) {
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
        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("notas.dat"))
        ) {
            dos.writeUTF(nombre);
            dos.writeInt(calificaciones.size());
            for (Float f : calificaciones) {
                dos.writeFloat(f);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
