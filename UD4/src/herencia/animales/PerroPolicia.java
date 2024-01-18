package herencia.animales;

public class PerroPolicia extends Perro{
    private String unidad;

    public PerroPolicia(String nombre, String raza, String unidad) {
        super(nombre, raza);
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
