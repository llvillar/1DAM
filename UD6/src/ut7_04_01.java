import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ut7_04_01 {
    public static void main(String[] args) throws IOException {

        File fichero = new File("temperaturas.dat");
        // si no existe, inicializamos los 31 días
        if (!fichero.exists()) {
            try (RandomAccessFile raf = new RandomAccessFile(fichero, "rw")) {
                for (int i = 0; i < 31; i++) {
                    raf.writeDouble(Double.NaN);
                }
            }
        }

        try (RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
             Scanner sc = new Scanner(System.in)) {
            int opcion;
            do {
                opcion = mostrarMenu(sc);
                switch (opcion) {
                    case 1:
                        listarTemperaturas(raf);
                        break;
                    case 2:
                        recuperarTemperatura(sc, raf);
                        break;
                    case 3:
                        almacenarTemperatura(sc, raf);
                        break;
                    case 4:
                        eliminarTemperatura(sc, raf);
                        break;
                    case 5:
                        calcularMediaTemperatura(raf);
                }
            } while (opcion != 0);
        }

    }

    private static int mostrarMenu(Scanner sc) {
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("1. Listar las temperaturas registradas");
        System.out.println("2. Recuperar una temperatura");
        System.out.println("3. Almacenar una temperatura");
        System.out.println("4. Eliminar una temperatura");
        System.out.println("5. Calcular la media de temperaturas");
        System.out.println("0. Salir");
        return sc.nextInt();
    }

    private static void listarTemperaturas(RandomAccessFile raf) throws IOException {
// posición 0 = inicio del fichero
        raf.seek(0);
        for (int i = 0; i < 31; i++) {
            double temperatura = raf.readDouble();
// si temperatura no es NaN, es que tiene valor almacenado
// CUIDADO: temperatura != Double.NaN siempre será true
            if (!Double.isNaN(temperatura)) {
                System.out.format("Día %02d: %.2f\n", i + 1, temperatura);
            }
        }
    }

    private static void recuperarTemperatura(Scanner sc, RandomAccessFile raf) throws IOException {
        long dia = pedirDia(sc);
// nos colocamos en la posición sizeof(Double)*(dia-1)
        raf.seek(Double.BYTES * (dia - 1));
        double temperatura = raf.readDouble();
        if (!Double.isNaN(temperatura)) {
            System.out.format("Día %02d: %.2f\n", dia, temperatura);
        } else {
            System.out.println("No hay temperatura registrada ese día");
        }
    }

    private static void almacenarTemperatura(Scanner sc, RandomAccessFile raf) throws IOException {
        long dia = pedirDia(sc);
        long posicion = Double.BYTES * (dia - 1);
        raf.seek(posicion);
        double temperatura = raf.readDouble();
        if (!Double.isNaN(temperatura)) {
            System.out.format("Actualmente, el día %02d tiene registrado %.2f\n", dia, temperatura);
        }
        temperatura = pedirTemperatura(sc);
        raf.seek(posicion);
        raf.writeDouble(temperatura);
    }

    private static void eliminarTemperatura(Scanner sc, RandomAccessFile raf) throws IOException {
        long dia = pedirDia(sc);
        long posicion = Double.BYTES * (dia - 1);
        raf.seek(posicion);
        double temperatura = raf.readDouble();
        if (!Double.isNaN(temperatura)) {
            System.out.format("Actualmente, el día %02d tiene registrado %.2f\n", dia, temperatura);
            raf.seek(posicion);
            raf.writeDouble(Double.NaN);
            System.out.println("Registro eliminado");
        } else {
            System.out.println("No hay temperatura registrada ese día");
        }
    }

    private static void calcularMediaTemperatura(RandomAccessFile raf) throws IOException {
        double suma = 0;
        int cuenta = 0;
        raf.seek(0);
        for (int i = 0; i < 31; i++) {
            double temperatura = raf.readDouble();
            if (!Double.isNaN(temperatura)) {
                suma += temperatura;
                cuenta++;
            }
        }
        if (cuenta == 0) {
            System.out.println("No hay temperaturas registradas");
        } else {
            System.out.format("La media de %d días es %.2f\n", cuenta, suma / cuenta);
        }
    }

    private static long pedirDia(Scanner sc) {
        long dia;
        while (true) {
            System.out.print("Introduzca día del mes (1-31): ");
            try {
                dia = sc.nextInt();
                if (dia >= 1 && dia <= 31) break;
            } catch (NumberFormatException ignored) {
            }
            System.out.println("El número introducido no es correcto");
        }
        return dia;
    }

    private static double pedirTemperatura(Scanner sc) {
        double temperatura;
        while (true) {
            System.out.print("Introduzca temperatura: ");
            try {
                temperatura = sc.nextDouble();
                break;
            } catch (NumberFormatException ignored) {
            }
            System.out.println("El número introducido no es correcto");
        }
        return temperatura;
    }
}
