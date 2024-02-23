package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ut6_03_03 {

    private static ArrayList<Persona> lista = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Listar");
            System.out.println("2. Añadir");
            System.out.println("3. Insertar");
            System.out.println("4. Eliminar");
            System.out.println("5. Número de personas");
            System.out.println("6. Eliminar todas");
            System.out.println("7. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    listar();
                    break;
                case 2:
                    añadir();
                    break;
                case 3:
                    insertar();
                    break;
                case 4:
                    eliminar();
                    break;
                case 5:
                    total();
                    break;
                case 6:
                    eliminarTodas();
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 7);
    }

    private static void total() {
        System.out.println("Número de personas en la lista: " + lista.size());
    }

    private static void listar() {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("Lista de personas:");
            for (Persona persona : lista) {
                System.out.println(persona);
            }
        }
    }

    private static void añadir() {
        System.out.println("Escriba los datos de la persona a añadir: ");
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Apellidos: ");
        String apellidos = scanner.next();
        System.out.print("Telefono: ");
        String telefono = scanner.next();

        Persona persona = new Persona(nombre, apellidos, telefono);

        lista.add(persona);
        System.out.println("Persona añadida correctamente.");
    }

    private static void insertar() {
        System.out.println("Escriba los datos de la persona a insertar y la posicion: ");
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Apellidos: ");
        String apellidos = scanner.next();
        System.out.print("Telefono: ");
        String telefono = scanner.next();
        System.out.print("Posicion: ");
        int posicion = scanner.nextInt();
        Persona persona = new Persona(nombre, apellidos, telefono);

        lista.add(posicion, persona);
        System.out.println("Persona añadida correctamente en la posición " + posicion);
    }

    private static void eliminar() {
        System.out.println("Indique la posicion de la persona a eliminar: ");

        System.out.print("Posicion: ");
        int posicion = scanner.nextInt();

        try {
            lista.remove(posicion);
            System.out.println("Persona eliminada correctamente.");
        }catch (IndexOutOfBoundsException e){
            System.out.println("La persona/posicion no existe en la lista.");
        }
    }

    private static void eliminarTodas() {
        lista.clear();
        System.out.println("Todas las personas han sido eliminadas de la lista.");
    }
}