import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ut7_03_01b {
    public static void main(String[] args) throws IOException {

        try (DataInputStream dis = new DataInputStream(
                new FileInputStream("notas.dat"))
        ) {
            String nombre = dis.readUTF();
            System.out.println("Mostrando calificaciones de " + nombre);
            int cantidad = dis.readInt();
            if (cantidad > 0) {
                System.out.format("Hay %d calificaciones:\n", cantidad);
                float suma = 0;
                for (int i = 0; i < cantidad; i++) {
                    float calificacion = dis.readFloat();
                    System.out.format("%.2f\n", calificacion);
                    suma += calificacion;
                }
                System.out.format("La media es %.2f\n", suma/cantidad);
            } else {
                System.out.println("No hay ninguna");
            }
        }
    }
}
