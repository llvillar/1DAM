import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ut7_04_04 {

    private final static int TAMANIO_CABECERA = 4;
    private final static int TAMANIO_REGISTRO = 2 + 30 * 2 + 4;

    public static void main(String[] args) throws IOException {

        File fichero = new File("amigos.dat");
// si no existe, inicializamos la cabecera con 0 registros
        if (!fichero.exists()) {
            try (RandomAccessFile raf = new RandomAccessFile(fichero,
                    "rw")) {
                guardarNumeroRegistros(raf, 0);
            }
        }

        try (RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
             Scanner sc = new Scanner(System.in)) {
            int opcion;
            do {
                int numRegistros = leerNumeroRegistros(raf);
                System.out.println("Actualmente hay " + numRegistros + " registros");
                opcion = mostrarMenu(sc);
                switch (opcion) {
                    case 1:
                        listarAmigos(raf);
                        break;
                    case 2:
                        buscarAmigo(sc, raf);
                        break;
                    case 3:
                        aniadirAmigo(sc, raf);
                        break;
                    case 4:
                        eliminarAmigo(sc, raf);
                }
            } while (opcion != 0);
        }

    }

    private static int mostrarMenu(Scanner sc) {
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("1. Listar amigos");
        System.out.println("2. Buscar amigo");
        System.out.println("3. Añadir amigo");
        System.out.println("4. Eliminar amigo");
        System.out.println("0. Salir");
        return sc.nextInt();
    }

    private static void listarAmigos(RandomAccessFile raf) throws IOException {
        int cuenta = leerNumeroRegistros(raf);
        long registroActual = 0;
        System.out.println("Imprimiendo " + cuenta + " registros");
        while (cuenta > 0) {
            raf.seek(TAMANIO_CABECERA + TAMANIO_REGISTRO * registroActual);
            int edad = raf.readInt();
            if (edad != -1) {
                cuenta--;
                String nombre = raf.readUTF();
                System.out.format("%s (%d años)\n", nombre, edad);
            }
            registroActual++;
        }
    }

    private static void buscarAmigo(Scanner sc, RandomAccessFile raf) throws IOException {
        sc.nextLine();
        System.out.print("Introduzca el nombre a buscar: ");
        String contenido = sc.nextLine().toLowerCase();
        boolean encontrado = false;
        int numRegistros = leerNumeroRegistros(raf);
        long registroActual = 0;
        System.out.println("Buscando en " + numRegistros + " registros");
        while (numRegistros > 0) {
            raf.seek(TAMANIO_CABECERA + TAMANIO_REGISTRO * registroActual);
            int edad = raf.readInt();
            if (edad != -1) {
                numRegistros--;
                String nombre = raf.readUTF();
                if (nombre.contains(contenido)) {
                    encontrado = true;
                    System.out.format("%s (%d años)\n", nombre, edad);
                }
            }
            registroActual++;
        }
        if (!encontrado) {
            System.out.println("No se han encontrado coincidencias");
        }
    }

    private static void aniadirAmigo(Scanner sc, RandomAccessFile raf) throws IOException {
        sc.nextLine();
        System.out.print("Introduzca el nombre a añadir: ");
        String nuevoNombre = getNombre(sc);
        System.out.print("Introduzca la edad: ");
        int nuevaEdad = sc.nextInt();
        int numRegistros = leerNumeroRegistros(raf);
        int cuenta = numRegistros;
        long registroActual = 0;
        while (cuenta > 0) {
            long posicion = TAMANIO_CABECERA + TAMANIO_REGISTRO * registroActual;
            raf.seek(posicion);
            int edad = raf.readInt();
            if (edad == -1) {
// sobreescribir registro libre
                raf.seek(posicion);
                raf.writeInt(nuevaEdad);
                raf.writeUTF(nuevoNombre);
                break;
            }
            registroActual++;
            cuenta--;
        }
        if (cuenta == 0) {
// añadir al final
            System.out.println("Insertando al final del fichero");
            long posicion = TAMANIO_CABECERA + TAMANIO_REGISTRO * registroActual;
            raf.seek(posicion);
            raf.writeInt(nuevaEdad);
            raf.writeUTF(nuevoNombre);
            raf.setLength(posicion + TAMANIO_REGISTRO);
        }
        numRegistros++;
        guardarNumeroRegistros(raf, numRegistros);
    }


    private static void eliminarAmigo(Scanner sc, RandomAccessFile raf) throws IOException {
        sc.nextLine();
        System.out.print("Introduzca el nombre a eliminar: ");
        String contenido = sc.nextLine().toLowerCase();
        boolean encontrado = false;
        int numRegistros = leerNumeroRegistros(raf);
        int cuenta = numRegistros;
        long registroActual = 0;
        System.out.println("Buscando en " + numRegistros + " registros");
        while (cuenta > 0) {
            long posicion = TAMANIO_CABECERA + TAMANIO_REGISTRO * registroActual;
            raf.seek(posicion);
            int edad = raf.readInt();
            if (edad != -1) {
                cuenta--;
                String nombre = raf.readUTF();
                if (nombre.toLowerCase().contains(contenido)) {
                    encontrado = true;
                    System.out.format("%s (%d años)\n", nombre, edad);
                    String respuesta;
                    do {
                        System.out.println("¿Eliminar? (S/N)");
                        respuesta = sc.nextLine();
                    } while (!respuesta.matches("[SsNn]"));
                    if (respuesta.toLowerCase().charAt(0) == 's') {
                        raf.seek(posicion);
                        raf.writeInt(-1);
                        numRegistros--;
                        System.out.println("Eliminado");
                    }
                }
            }
            registroActual++;
        }
        if (!encontrado) {
            System.out.println("No se han encontrado coincidencias");
        } else {
            guardarNumeroRegistros(raf, numRegistros);
        }
    }

    private static String getNombre(Scanner sc) {
        while (true) {
            String nombre = sc.nextLine();
            if (nombre.length() > 0 && nombre.length() <= 30) return nombre;
            System.out.println("Longitud incorrecta (el nombre tiene que tener entre 1 y 30 caracteres)");
            System.out.print("Introduzca de nuevo el nombre: ");
        }
    }

    private static void guardarNumeroRegistros(RandomAccessFile raf, int numRegistros) throws IOException {
        raf.seek(0);
        raf.writeInt(numRegistros);
    }

    private static int leerNumeroRegistros(RandomAccessFile raf) throws IOException {
        raf.seek(0);
        return raf.readInt();
    }
}
