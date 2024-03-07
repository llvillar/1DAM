import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ut7_01_01_c {

    public static void main(String[] args) throws IOException{

        byte[] datos = { 'H', 'O', 'L', 'A' };
        try (InputStream is = new ByteArrayInputStream(datos)) {
            int leido = is.read();
            System.out.format("%c, %d\n", leido, leido);
        }

    }
}