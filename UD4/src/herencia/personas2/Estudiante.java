package herencia.personas2;

public class Estudiante extends Persona {

    private int nie;
    private String grupo;

    public Estudiante(String nombre, String apellidos, int nie, String grupo) {

        super(nombre, apellidos);

        this.nie = nie;
        this.grupo = grupo;
    }

    public void estudiar(){
        System.out.println(getNombre() + " estudia en " + grupo);
    }

    @Override
    public void entrar() {
        System.out.println(getNombre() + " debe identificarse para entrar en el edificio");
    }

    @Override
    public void salir() {
        System.out.println(getNombre() + " sale del edificio");
    }
}
