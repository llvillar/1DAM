package directorioEmpresas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DirectorioEmpresas implements Serializable {

    private static Map<String, Empresa> empresas;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       empresas = cargarDirectorio("empresas.dat");

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Listado de empresas");
            System.out.println("2. Búsqueda de empresa por CIF");
            System.out.println("3. Alta de una nueva empresa");
            System.out.println("4. Baja de una empresa por CIF");
            System.out.println("5. Modificación de una empresa por CIF");
            System.out.println("6. Guardar y salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    listarEmpresas();
                    break;
                case 2:
                    buscarEmpresaPorCIF(scanner);
                    break;
                case 3:
                    altaEmpresa(scanner);
                    guardarDirectorio("empresas.dat");
                    break;
                case 4:
                    bajaEmpresa(scanner);
                    guardarDirectorio("empresas.dat");
                    break;
                case 5:
                    modificarEmpresa(scanner);
                    guardarDirectorio("empresas.dat");
                    break;
                case 6:
                    guardarDirectorio("empresas.dat");
                    System.out.println("Guardando y saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
        } while (opcion != 6);

        scanner.close();
    }

    public DirectorioEmpresas() {
        empresas = new HashMap<>();
    }

    private static void listarEmpresas() {
        for (Empresa empresa : empresas.values()) {
            System.out.println(empresa);
        }
    }

    private static void buscarEmpresaPorCIF(Scanner scanner) {
        System.out.print("Introduce el CIF de la empresa a buscar: ");
        String cif = scanner.nextLine();
        Empresa empresa = empresas.get(cif);
        if (empresa != null) {
            System.out.println(empresa);
        } else {
            System.out.println("No se encontró ninguna empresa con ese CIF.");
        }
    }

    private static void altaEmpresa(Scanner scanner) {

        System.out.print("Introduce el CIF de la nueva empresa: ");
        String cif = scanner.nextLine();
        System.out.print("Introduce la razón social de la nueva empresa: ");
        String razonSocial = scanner.nextLine();
        System.out.print("Introduce el teléfono de la nueva empresa: ");
        String telefono = scanner.nextLine();
        System.out.print("Introduce el año de constitución de la nueva empresa: ");
        int anoConstitucion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Introduce el nombre del contacto de la nueva empresa: ");
        String nombreContacto = scanner.nextLine();

        if (validarCIF(cif)) {
            Empresa empresa = new Empresa(cif, razonSocial, telefono, anoConstitucion, nombreContacto);
            empresas.put(cif, empresa);
            System.out.println("Empresa añadida correctamente.");
        } else {
            System.out.println("CIF inválido. Asegúrate de que el CIF sigue el formato correcto.");
        }
    }

    private static void bajaEmpresa(Scanner scanner) {
        System.out.print("Introduce el CIF de la empresa a dar de baja: ");
        String cif = scanner.nextLine();
        empresas.remove(cif);
        System.out.println("Empresa eliminada correctamente.");
    }

    private static void modificarEmpresa(Scanner scanner) {
        System.out.print("Introduce el CIF de la empresa a modificar: ");
        String cif = scanner.nextLine();
        System.out.print("Introduce la nueva razón social: ");
        String razonSocial = scanner.nextLine();
        System.out.print("Introduce el nuevo teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Introduce el nuevo año de constitución: ");
        int anoConstitucion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Introduce el nuevo nombre del contacto: ");
        String nombreContacto = scanner.nextLine();
        if (empresas.containsKey(cif)) {
            Empresa empresa = empresas.get(cif);
            empresa.setRazonSocial(razonSocial);
            empresa.setTelefono(telefono);
            empresa.setAnoConstitucion(anoConstitucion);
            empresa.setNombreContacto(nombreContacto);
            System.out.println("Empresa modificada correctamente.");
        } else {
            System.out.println("No se encontró ninguna empresa con ese CIF.");
        }
    }

    private static boolean validarCIF(String cif) {
        // Validar el formato del CIF
        // Implementar la lógica de validación del CIF aquí
        return true; // Por ahora, siempre devuelve true (debes implementar la lógica real)
    }

    private static void guardarDirectorio(String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(empresas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static HashMap<String, Empresa>  cargarDirectorio(String nombreArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            return (HashMap<String, Empresa>) ois.readObject();
        } catch (Exception e) {
            //e.printStackTrace();
            return new HashMap<String, Empresa>();
        }
    }


}


