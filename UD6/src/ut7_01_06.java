import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ut7_01_06 {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("prueba.txt")) {
            int n = 1;
            while (true) {
                int dato = reader.read();
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
