package comparacion;

import java.util.Objects;

public class Persona implements Comparable<Persona>{

    private String dni;
    private String nombre;
    private String apellidos;
    private String telefono;
    public Persona(String dni, String nombre, String apellidos, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    @Override
    public String toString() {
        return "Persona {" +
                "dni='" + dni + '\'' +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    /*@Override
    //public int compareTo(Object o) {
       return this.dni.compareTo(((Persona) o).getDni());
    }

     */


    @Override
    public int compareTo(Persona o) {

        int compare = this.apellidos.compareTo(o.apellidos);
        if(compare == 0){
            compare = this.nombre.compareTo(o.nombre);
        }

        return compare;
    }
}