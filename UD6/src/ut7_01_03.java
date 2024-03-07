import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ut7_01_03 {

    public static void main(String[] args) {

        try (InputStream is = new FileInputStream("prueba.txt")) {
            int n = 1;
            while (true) {
                int dato = is.read();
                if (dato == -1) break;
                System.out.format("%d: %d='%c'\n", n++, dato, dato);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero");
        }
    }
}
