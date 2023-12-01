package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;

    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<Libro>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> listadoLibros() {
        return List.copyOf(libros);
    }

    public void anadirLibro(Libro libro){
        libros.add(libro);
    }

    public Libro buscarLibro(String isbn){
        Libro l = new Libro(isbn);

        if(libros.contains(l)){
           return  libros.get(libros.indexOf(l));
        }
        return null;
    }

    public boolean reservarLibro(String isbn){

        Libro libro = buscarLibro(isbn);
        if (libro != null && !libro.isReservado()){
            libro.setReservado(true);
            return true;
        }
        return false;
    }

    public boolean devolverLibro(String isbn){
        Libro libro = buscarLibro(isbn);
        if(libro !=null && libro.isReservado()){
            libro.setReservado(false);
            return true;
        }
        return false;
    }

    public boolean eliminarLibro(String isbn){
        Libro libro = buscarLibro(isbn);
        if(libro != null){
            libros.remove(libro);
            return true;
        }
        return false;
    }
}
