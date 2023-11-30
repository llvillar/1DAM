package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private List<ModuloProfesional> modulos;
    public Estudiante(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.modulos = new ArrayList<ModuloProfesional>();
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public List<ModuloProfesional> getModulos() {
        return List.copyOf(modulos);
    }
    public void agregarModulo(ModuloProfesional modulo){
        if(!modulos.contains(modulo)){
            modulos.add(modulo);
        }
    }

    public void eliminarModulo(ModuloProfesional modulo){
        modulos.remove(modulo);
    }
}
