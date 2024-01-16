package figuras;


import figuras.exceptions.LadoNoValidoException;
import figuras.exceptions.NombreFiguraNoValidoException;

public class FiguraGeometrica {
    private String nombre;

    public FiguraGeometrica(String nombre) throws LadoNoValidoException {
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws NombreFiguraNoValidoException{
        if (nombre.isBlank() || nombre.isEmpty()){
            throw new NombreFiguraNoValidoException("El nombre no puede estar en blanco");
        }
        this.nombre = nombre;
    }

    public double calcularArea(){
        return 0;
    }

    public double calcularPerimetro(){
        return 0;
    }
}
