package herencia.animales;

public class GatoDomestico extends Gato{
    private String familia;

    public GatoDomestico(String nombre, String raza, String familia) {
        super(nombre, raza);
        this.familia = familia;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    /**
     *

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " ha maullado en la cocina.");
    }
    */
}
