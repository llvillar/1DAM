package ficheros;

public interface Almacenable {
    void guardar(String nombreFichero);
    void recuperar(String nombreFichero);

    default String describir() {
        return "Almacenable";
    }
}
