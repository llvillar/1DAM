import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ut7_03_02 {

    public static void main(String[] args) throws IOException {
        introducirInvitados();
        leerInvitados();
    }

    private static void leerInvitados() throws IOException {
        // Leer invitados del archivo binario
        try (DataInputStream dis = new DataInputStream(new FileInputStream("invitados.dat"))) {
            while (true) {
                String invitado = dis.readUTF();
                if(invitado == null){
                    break;
                }
                System.out.println(invitado);
            }
        }catch (EOFException e){}
    }
    private static void introducirInvitados() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Set<String> invitados = new TreeSet<>();
        while (true) {
            System.out.print("Ingrese los nombres de los invitados (ingrese 'fin' para terminar):");
            String nombre = scanner.nextLine().trim();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            invitados.add(nombre);
        }
        // Escribir invitados en archivo binario
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("invitados.dat"))) {
            for (String invitado : invitados) {
                dos.writeUTF(invitado);
            }
            System.out.println("Lista de invitados almacenada correctamente en el archivo ");
        }
    }
}
