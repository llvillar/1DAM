package notasestudiante;

import java.io.Serializable;
import java.util.List;

public class EstudianteV2 implements Serializable {
    private final String nombre;
    private List<Float> notas;

    public EstudianteV2(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }


    public List<Float> getNotas() {
        return notas;
    }

    public void setNotas(List<Float> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", notas=" + notas +
                '}';
    }
}