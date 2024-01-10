package herencia.personas;

public class PersonalAdministracionServicios extends Persona{

    private String cargo;

    public PersonalAdministracionServicios(String nombre, String apellidos, String cargo) {
        super(nombre, apellidos);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
