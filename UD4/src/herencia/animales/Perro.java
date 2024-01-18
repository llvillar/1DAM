package herencia.animales;

import java.util.Objects;

//public final class Perro extends Animal{
public class Perro extends Animal{

    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " ha ladrado.");
    }

    @Override
    public String getNombre(){
        return "El perro se llama " + super.getNombre();
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + super.getNombre() + '\'' +
                "raza='" + raza + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perro perro = (Perro) o;
        return Objects.equals(raza, perro.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raza);
    }
}
