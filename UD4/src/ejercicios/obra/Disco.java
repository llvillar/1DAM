package ejercicios.obra;

public class Disco extends ObraAudiovisual{

    private Persona artistaPrincipal;
    private int numeroPistas;
    private int anioPublicacion;

    public Disco(String titulo, int duracion, int numeroPistas, int anioPublicacion) {
        super(titulo, duracion);
        this.numeroPistas = numeroPistas;
        this.anioPublicacion = anioPublicacion;
    }

    public Persona getArtistaPrincipal() {
        return artistaPrincipal;
    }

    public void setArtistaPrincipal(Persona artistaPrincipal) {
        this.artistaPrincipal = artistaPrincipal;
    }

    public int getNumeroPistas() {
        return numeroPistas;
    }

    public void setNumeroPistas(int numeroPistas) {
        this.numeroPistas = numeroPistas;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
