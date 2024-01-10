package herencia.personas;

public class Persona {
    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void entrar(){
        System.out.println(nombre + " entra en el edificio.");
    }

    public void salir(){
        System.out.println(nombre + " sale del edificio.");
    }

}
