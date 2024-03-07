import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ut7_01_04 {

    public static void main(String[] args) {

        int[] contador = new int[256];

        try (InputStream is = new FileInputStream("ejemplo.txt")) {
            while (true) {
                int dato = is.read();
                if (dato == -1) break;
                contador[dato]++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero");
        }
        for (int i = 0; i < 256; i++) {
            if (contador[i] > 0) {
                System.out.format("%3d: %d veces\n", i, contador[i]);
            }
        }
    }

}
