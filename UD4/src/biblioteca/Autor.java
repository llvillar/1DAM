package biblioteca;

public class Autor {

    private String nombre;

    public Autor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {

        System.out.println("hola");
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
