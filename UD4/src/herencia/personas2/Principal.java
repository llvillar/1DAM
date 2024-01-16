package herencia.personas2;



public class Principal {
    public static void main(String[] args) {

        Persona p = new Persona("Luis", "López");

        p.entrar();
        p.salir();

        Estudiante e = new Estudiante("Mario", "Gomez", 12345, "1º DAM");

        e.entrar();
        e.salir();

        e.estudiar();

        Docente doc = new Docente("Jose", "Molina");

        doc.entrar();
        doc.salir();
    }
}
