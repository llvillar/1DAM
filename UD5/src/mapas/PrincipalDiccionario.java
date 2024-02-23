package mapas;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PrincipalDiccionario {
    private final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String, Persona> listado = new TreeMap<>();
        String dni;
        Persona p;
        boolean salir = false;
        while (!salir) {
            switch (dibujarMenu()) {
                case 1:
                    muestraListado(listado);
                    break;
                case 2:
                    listado.put(leeDni(), leePersona());
                    break;
                case 3:
                    dni = leeDni();
                    p = listado.get(dni);
                    if (p != null) {
                        System.out.println(p);
                    } else {
                        System.out.println("DNI no encontrado");
                    }
                    break;
                case 4:
                    dni = leeDni();
                    p = listado.remove(dni);
                    if (p != null) {
                        System.out.println("Eliminado: " + p);
                    } else {
                        System.out.println("DNI no encontrado");
                    }
                    break;
                case 5:
                    listado.clear();
                    System.out.println("Todos eliminados");
                    break;
                case 6:
                    System.out.println("Hay " + listado.size() + " personas");
                    break;
                case 0:
                    salir = true;
            }
        }
        sc.close();
    }

    public static int dibujarMenu() {
        System.out.println();
        System.out.println("Elige una opción:");
        System.out.println("1. Listar todas las personas");
        System.out.println("2. Añadir una persona");
        System.out.println("3. Buscar una persona por DNI");
        System.out.println("4. Eliminar una persona por DNI");
        System.out.println("5. Borrar todas las personas");
        System.out.println("6. Mostrar el número de personas almacenadas");
        System.out.println("0. Salir");
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }
    public static String leeDni() {
        System.out.print("DNI: ");
        return sc.nextLine();
    }
    public static Persona leePersona() {
        String nombre;
        String apellidos;
        String telefono;

        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        apellidos = sc.nextLine();
        System.out.print("Teléfono: ");
        telefono = sc.nextLine();
        return new Persona(nombre, apellidos, telefono);
    }
    public static void muestraListado(Map<String, Persona> diccionario) {


        Set<String> keys = diccionario.keySet();

        for (String key: keys) {
            Persona persona = diccionario.get(key);

            System.out.println(key
                    + ": "
                    + persona.getApellidos()
                    + ", "
                    + persona.getNombre()
                    + " - "
                    + persona.getTelefono()
            );

        }

      //  Set<Map.Entry<String, Persona>> entries = diccionario.entrySet();


        Set<Map.Entry<String, Persona>> entradas = diccionario.entrySet();
        for (Map.Entry<String, Persona> entrada : entradas) {
            System.out.println(entrada.getKey()
                    + ": "
                    + entrada.getValue().getApellidos()
                    + ", "
                    + entrada.getValue().getNombre()
                    + " - "
                    + entrada.getValue().getTelefono()
            );
        }
    }
}