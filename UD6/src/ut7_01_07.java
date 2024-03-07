import java.io.*;

public class ut7_01_07 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("prueba.txt"))) {
            int n = 1;
            while (true) {
                String linea = br.readLine();
                if (linea == null) break;
                System.out.format("%d: %s\n", n++, linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero");
        }
    }

    private static  void leerTeclado(){

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            int n = 1;
            while(true){
                String linea = br.readLine();
                if(linea == null) break;;
                System.out.format("%d: %s\n", n++, linea);
            }
        }catch (IOException e){
            System.out.println("Error de lectura");
        }
    }

}
