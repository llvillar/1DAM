package ejercicios.obra;

public class ObraAudiovisual {
    private String titulo;
    private int duracion;

    public ObraAudiovisual(String titulo, int duracion) {
        setTitulo(titulo);
        setDuracion(duracion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws IllegalArgumentException{
        if (titulo.isEmpty()){
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
}
