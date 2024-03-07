import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ut7_03_03_a {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("quiniela.dat"))) {

            System.out.print("Ingrese el número de jornadas: ");
            int jornadas = scanner.nextInt();
            dos.writeInt(jornadas);

            System.out.print("Ingrese el número de partidos por jornada: ");
            int partidos = scanner.nextInt();
            dos.writeInt(partidos);
            scanner.nextLine();

            for(int i = 0; i < jornadas; i++){
                System.out.print("Ingrese la fecha de la jornada: ");
                String fecha = scanner.nextLine();
                dos.writeUTF(fecha);

                for (int j = 1; j <= partidos; j++){
                    System.out.print("Goles del partido " + j + ", separados por un espacio: ");

                    String resultado = scanner.nextLine();
                    String[] goles = resultado.split(" ");
                    int golesEquipo1 = Integer.parseInt(goles[0]);
                    int golesEquipo2 = Integer.parseInt(goles[1]);

                    dos.writeInt(golesEquipo1);
                    dos.writeInt(golesEquipo2);
                }
            }
        }
    }
}
