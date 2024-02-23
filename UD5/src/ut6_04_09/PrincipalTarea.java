package ut6_04_09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PrincipalTarea {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final Map<String, List<Estudiante>> listadoGrupos = new TreeMap<>();

        boolean salir = false;
        while (!salir) {
            switch (dibujarMenuGrupos()) {
                case 1:
                    crearGrupo(listadoGrupos);
                    break;
                case 2:
                    listarGrupos(listadoGrupos);
                    break;
                case 3:
                    eliminarGrupo(listadoGrupos);
                    break;
                case 4:
                    seleccionarGrupo(listadoGrupos);
                    break;
                case 0:
                    salir = true;
                    break;
            }
        }

        sc.close();
    }

    public static int dibujarMenuGrupos() {
        System.out.println();
        System.out.println("Elige una opción:");
        System.out.println("1. Crear un grupo de estudiantes");
        System.out.println("2. Listar grupos de estudiantes");
        System.out.println("3. Eliminar un grupo de estudiantes");
        System.out.println("4. Seleccionar un grupo de estudiantes");
        System.out.println("0. Salir");

        int opcion = sc.nextInt();
        sc.nextLine();

        return opcion;
    }

    private static void crearGrupo(Map<String, List<Estudiante>> listadoGrupos) {
        String grupo = leerGrupo();
        if (listadoGrupos.containsKey(grupo)) {
            System.out.println("El grupo ya existe");
        } else {
            listadoGrupos.put(grupo, new ArrayList<>());
            System.out.println("Grupo creado con éxito");
        }
    }

    public static void listarGrupos(Map<String, List<Estudiante>> listado) {
        for (String grupo : listado.keySet()) {
            System.out.println("> " + grupo);
        }
    }

    private static void eliminarGrupo(Map<String, List<Estudiante>> listadoGrupos) {
        String grupo = leerGrupo();
        if (!listadoGrupos.containsKey(grupo)) {
            System.out.println("El grupo no existe");
        } else {
            listadoGrupos.remove(grupo);
            System.out.println("Grupo eliminado con éxito");
        }
    }

    private static void seleccionarGrupo(Map<String, List<Estudiante>> listadoGrupos) {
        String grupo = leerGrupo();
        List<Estudiante> listadoEstudiantes = listadoGrupos.get(grupo);

        if (null == listadoEstudiantes) {
            System.out.println("El grupo no existe");
        } else {
            mainEstudiantes(listadoEstudiantes);
        }
    }

    public static String leerGrupo() {
        System.out.print("Grupo: ");
        return sc.nextLine();
    }

    private static void mainEstudiantes(List<Estudiante> listadoEstudiantes) {
        boolean salir = false;
        while (!salir) {
            switch (dibujarMenuEstudiantes()) {
                case 1:
                    listarEstudiantes(listadoEstudiantes);
                    break;
                case 2:
                    anyadirEstudiante(listadoEstudiantes);
                    break;
                case 3:
                    insertarEstudiante(listadoEstudiantes);
                    break;
                case 4:
                    ordenarEstudiantesPorNIE(listadoEstudiantes);
                    break;
                case 5:
                    eliminarEstudiante(listadoEstudiantes);
                    break;
                case 6:
                    eliminarEstudiantes(listadoEstudiantes);
                    break;
                case 0:
                    salir = true;
            }
        }
    }

    private static int dibujarMenuEstudiantes() {
        System.out.println();
        System.out.println("Elige una opción:");
        System.out.println("1. Listar estudiantes");
        System.out.println("2. Añadir un estudiante al final del grupo ");
        System.out.println("3. Insertar un estudiante en la posición indicada");
        System.out.println("4. Ordenar el listado por NIE");
        System.out.println("5. Eliminar el estudiante de la posición indicada");
        System.out.println("6. Eliminar todos los estudiantes de la clase");
        System.out.println("0. Salir");

        int opcion = sc.nextInt();
        sc.nextLine();

        return opcion;
    }

    private static void listarEstudiantes(List<Estudiante> listadoEstudiantes) {
        for (int i = 0; i < listadoEstudiantes.size(); i++) {
            System.out.printf("%02d: %s\n", i + 1, listadoEstudiantes.get(i));
        }
    }

    private static void anyadirEstudiante(List<Estudiante> listadoEstudiantes) {
        Estudiante e = leerEstudiante();
        listadoEstudiantes.add(e);
        System.out.println("Estudiante añadido");
    }

    private static void insertarEstudiante(List<Estudiante> listadoEstudiantes) {
        int pos = leerPosicion(listadoEstudiantes.size() + 1);
        Estudiante e = leerEstudiante();
        listadoEstudiantes.add(pos, e);
        System.out.println("Estudiante insertado");
    }

    private static void ordenarEstudiantesPorNIE(List<Estudiante> listadoEstudiantes) {
        listadoEstudiantes.sort(new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o1.getNie() - o2.getNie();
            }
        });
    }

    private static void eliminarEstudiante(List<Estudiante> listadoEstudiantes) {
        int pos = leerPosicion(listadoEstudiantes.size());
        Estudiante e = listadoEstudiantes.remove(pos);
        System.out.println("Estudiante eliminado: " + e);
    }

    private static void eliminarEstudiantes(List<Estudiante> listadoEstudiantes) {
        listadoEstudiantes.clear();
        System.out.println("Estudiantes del grupo eliminados");
    }

    public static Estudiante leerEstudiante() {
        String nombre;
        String apellidos;
        int nie, edad;

        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        apellidos = sc.nextLine();
        System.out.print("NIE: ");
        nie = sc.nextInt();
        System.out.print("Edad: ");
        edad = sc.nextInt();
        sc.nextLine();

        return new Estudiante(nie, nombre, apellidos, edad);
    }

    public static int leerPosicion(int max) {
        int num;

        do {
            System.out.printf("Posición [1-%d]: ", max);
            num = sc.nextInt();
        } while (num < 1 || num > max);
        sc.nextLine();

        // devolver como un índice de [0,size()-1]
        return num - 1;
    }
}