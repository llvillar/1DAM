import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ut7_01_01 {

    public static void main(String[] args) {

        byte[] datos = { 'H', 'O', 'L', 'A' };

        InputStream is = new ByteArrayInputStream(datos);
        try {
            int n = 1;
            while (true) {
                int leido = is.read();
                if (leido == -1) break;
                System.out.format("%d: %c, %d\n", n++, leido, leido);
            }
            //is.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}