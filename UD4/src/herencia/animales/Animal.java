package herencia.animales;

public class Animal {

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void emitirSonido(){
        System.out.println(nombre + " hace algún sonido");
    }
}
