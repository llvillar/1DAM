package ejercicios.obra;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends ObraAudiovisual{
    private int anioEstreno;
    private Persona director;
    private List<Persona> actoresPrincipales;
    private List<GeneroPelicula> generos;

    public Pelicula(String titulo, int duracion, int anioEstreno) {
        super(titulo, duracion);
        this.anioEstreno = anioEstreno;
        this.actoresPrincipales =  new ArrayList<>();
        this.generos = new ArrayList<>();
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    public List<Persona> getActoresPrincipales() {
        return actoresPrincipales;
    }

    public void setActoresPrincipales(List<Persona> actoresPrincipales) {
        this.actoresPrincipales = actoresPrincipales;
    }

    public List<GeneroPelicula> getGeneros() {
        return generos;
    }

    public void setGeneros(List<GeneroPelicula> generos) {
        this.generos = generos;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "\ntitulo=" + getTitulo() +
                "\nduracion=" + calcularDuracion(getDuracion()) +
                "\nanioEstreno=" + anioEstreno +
                "\ndirector=" + (director == null ? "desconocido" : (director.getNombre() + " "+ director.getApellidos())) +
                "\nactoresPrincipales=" + actoresPrincipalesToString(actoresPrincipales) +
                "\ngeneros=" + generosToString(generos) +
                "\n}";
    }

    private String generosToString(List<GeneroPelicula> generos) {
        String resultado = "", separador = "";
        for (GeneroPelicula g : generos){
            resultado += separador + g.getNombre();
            separador = ", ";
        }
        return resultado;
    }

    private String actoresPrincipalesToString(List<Persona> actoresPrincipales) {
        String resultado = "", separador = "";
        for (Persona p : actoresPrincipales){
            resultado += separador + p.getNombre() + " " + p.getApellidos();
            separador = ", ";
        }
        return resultado;
    }

    private String calcularDuracion(int duracion) {
        int horas = duracion / 3600;
        int minutos = (duracion % 3600) / 60;
        return horas + ":" + minutos;
    }
}
