package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ut6_03_02 {

        private static ArrayList<String> lista = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            int opcion;

            do {
                System.out.println("\nMenú:");
                System.out.println("1. Listar");
                System.out.println("2. Añadir");
                System.out.println("3. Insertar");
                System.out.println("4. Eliminar");
                System.out.println("5. Número de palabras");
                System.out.println("6. Eliminar todas");
                System.out.println("7. Salir");

                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        listarPalabras();
                        break;
                    case 2:
                        añadirPalabra();
                        break;
                    case 3:
                        insertarPalabra();
                        break;
                    case 4:
                        eliminarPalabra();
                        break;
                    case 5:
                        totalPalabras();
                        break;
                    case 6:
                        eliminarTodas();
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            } while (opcion != 7);
        }

    private static void totalPalabras() {
        System.out.println("Número de palabras en la lista: " + lista.size());
    }

    private static void listarPalabras() {
            if (lista.isEmpty()) {
                System.out.println("La lista está vacía.");
            } else {
                System.out.println("Lista de palabras:");
                for (String palabra : lista) {
                    System.out.println(palabra);
                }
            }
        }

        private static void añadirPalabra() {
            System.out.print("Escriba la palabra a añadir: ");
            String palabra = scanner.next();
            if (lista.contains(palabra)) {
                System.out.println("La palabra ya existe " + (lista.indexOf(palabra) + 1));
            } else {
                lista.add(palabra);
                System.out.println("Palabra añadida correctamente.");
            }
        }

        private static void insertarPalabra() {
            System.out.print("Escriba la palabra a insertar al comienzo de la lista: ");
            String palabra = scanner.next();
            if (lista.contains(palabra)) {
                System.out.println("La palabra ya existe en la lista en la posición " + (lista.indexOf(palabra) + 1));
            } else {
                lista.add(0, palabra);
                System.out.println("Palabra insertada correctamente al comienzo de la lista.");
            }
        }

        private static void eliminarPalabra() {
            System.out.print("Ingrese la palabra a eliminar: ");
            String palabra = scanner.next();
            if (lista.remove(palabra)) {
                System.out.println("Palabra eliminada correctamente.");
            } else {
                System.out.println("La palabra no existe en la lista.");
            }
        }

        private static void eliminarTodas() {
            lista.clear();
            System.out.println("Todas las palabras han sido eliminadas de la lista.");
        }
    }