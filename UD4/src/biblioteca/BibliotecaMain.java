package biblioteca;

import java.util.List;
import java.util.Scanner;

public class BibliotecaMain {

    private static Biblioteca biblioteca;
    public static void main(String[] args) {

        iniciarBiblioteca();

        mostrarMenu();



    }

    private static void iniciarBiblioteca(){
        biblioteca = new Biblioteca("Biblioteca IES Oretania");

        iniciarLibrosParaBiblioteca();

    }

    private static void iniciarLibrosParaBiblioteca(){

        for (int i = 0; i < 10 ; i++) {
            Libro l = new Libro(String.valueOf(i), "Titulo " + i);
            l.setAutor(new Autor("Autor " + i));

            biblioteca.anadirLibro(l);
        }

    }

    private static void mostrarMenu(){

        listarLibros();

        anadirLibro();

        buscarLibro();

    }

    private static  void listarLibros(){

        System.out.println(biblioteca.getNombre());

        List<Libro> libros = biblioteca.listadoLibros();
        for (Libro libro: libros) {
            System.out.println(libro);
        }
    }

    private static void buscarLibro(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce isbn: ");
        String isbn = scanner.next();

        Libro libro = biblioteca.buscarLibro(isbn);

        if(libro != null){
            System.out.println(libro);
        } else {
            System.out.println("El libro no existe en la biblioteca.");
        }


    }

    private static void reservarLibro(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce isbn: ");
        String isbn = scanner.next();

        if(biblioteca.reservarLibro(isbn)){
            System.out.println("El libro ha sido reservado correctamente.");
        } else {
            System.out.println("El libro no ha podido ser reservado, está prestado en este momento.");
        }
    }

    private static void devolverLibro(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce isbn: ");
        String isbn = scanner.next();
        boolean b = biblioteca.devolverLibro(isbn);
        if(b){
            System.out.println("El libro ha sido devuelto correctamente.");
        } else {
            System.out.println("El libro no ha podido ser devuelto.");
        }
    }


    private static void anadirLibro(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce isbn: ");
        String isbn = scanner.next();

        System.out.println("Introduce titulo: ");
        String titulo = scanner.next();

        System.out.println("Introduce nombre del autor: ");
        String nombreAutor = scanner.next();

        Autor autor = new Autor(nombreAutor);

        //Libro libro = new Libro(isbn, titulo, autor);

        Libro libro = new Libro(isbn);

        libro.setTitulo(titulo);

        libro.setAutor(autor);


        libro.setReservado(false);

        biblioteca.anadirLibro(libro);

    }

    private static void eliminarLibro(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce isbn: ");
        String isbn = scanner.next();

        boolean eliminarLibro = biblioteca.eliminarLibro(isbn);

        if(eliminarLibro){
            System.out.println("El libro ha sido eliminado correctamente.");
        } else {
            System.out.println("El libro no ha podido ser eliminado.");
        }
    }
}
