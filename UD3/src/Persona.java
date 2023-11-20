public class Persona {
    String nombre;
    String apellidos;
    String dni;
    int nivelAcceso;
    boolean activo;

    String devolverNombreCompleto() {
        return nombre + " " + apellidos;
    }

    void registrarEntrada() {
        System.out.println(devolverNombreCompleto() +
                " ha entrado");

    }
    void registrarSalida() {
        System.out.println(devolverNombreCompleto() +
                " ha salido");

    }
    void activar() {
        activo = true;
    }
    void desactivar() {
        activo = false;
    }

    void imprimirDatos() {
        System.out.println("DNI: " + dni + ", Nombre: " + devolverNombreCompleto());
    }

}
