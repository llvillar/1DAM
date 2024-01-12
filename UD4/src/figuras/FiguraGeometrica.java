package figuras;

public class FiguraGeometrica {
    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcularArea(){
        return 0;
    }

    public double calcularPerimetro(){
        return 0;
    }
}
