import java.io.*;
import java.util.Scanner;

public class ut7_03_03_b {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        try (DataInputStream is = new DataInputStream(new FileInputStream("quiniela.dat"))) {

            int jornadas =  is.readInt();
            int partidos =  is.readInt();

            for(int i = 0; i < jornadas; i++){
                String fecha = is.readUTF();
                System.out.println("Fecha de la jornada " + fecha);
                for (int j = 1; j <= partidos; j++){

                    int golesEquipo1 = is.readInt();
                    int golesEquipo2 = is.readInt();

                    String resultado = "";

                    if(golesEquipo1 > golesEquipo2){
                        resultado = "1";
                    } else if (golesEquipo2 > golesEquipo1) {
                        resultado = "2";
                    } else {
                        resultado = "X";
                    }

                    System.out.println("Partido " + j +": " + resultado);
                }
            }
        }
    }
}
