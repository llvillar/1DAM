import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ut7_01_02 {

    public static void main(String[] args) throws IOException {

        byte[] datos = { 'H', 'O', 'L', 'A' };
        try (InputStream is = new ByteArrayInputStream(datos)) {

            long descartado = is.skip(2);
            System.out.format("Descartados %d\n"
                    , descartado);

            int n = 1;
            while (true) {
                int leido = is.read();
                if (leido == -1) break;
                System.out.format("%d: %c, %d\n", n++, leido, leido);
            }


        }
    }
}
