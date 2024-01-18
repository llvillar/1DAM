package herencia.animales;

public class Gallina extends Animal{

    public Gallina(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " ha cacareado.");

    }
}
