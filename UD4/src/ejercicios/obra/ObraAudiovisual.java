package ejercicios.obra;

import java.util.Objects;

public abstract class ObraAudiovisual implements Puntuable, TieneValoracion {
    private String titulo;
    private int duracion;

    private int valoracion = 0;

    public ObraAudiovisual(String titulo, int duracion) {
        setTitulo(titulo);
        setDuracion(duracion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws IllegalArgumentException{
        if (titulo == null || titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no puede estar vacio");
        }
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) throws IllegalArgumentException{
        if(duracion < 0){
            throw new IllegalArgumentException("Duracion no valida");
        }
        this.duracion = duracion;
    }

    public void asignarPuntuacion(int puntuacion) throws IllegalArgumentException {
        this.valoracion = Puntuable.asignarPuntuacion(puntuacion);
    }

    @Override
    public double obtenerValoracion() {
        return valoracion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObraAudiovisual that = (ObraAudiovisual) o;
        return Objects.equals(titulo, that.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
