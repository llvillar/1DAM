package herencia.personas2;

public class Docente extends Persona {

    public Docente(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    @Override
    public void entrar() {
        System.out.println(getNombre() + " debe fichar antes de entrar en el edificio");
    }

    @Override
    public void salir() {
        System.out.println(getNombre() + " debe fichar para salir del edificio");
    }

}
