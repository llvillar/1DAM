package herencia.animales;

public class AnimalMain {
    public static void main(String[] args) {


        Animal a = new Animal("Neo");
        Gato g = new Gato("Kity", "Siamés");
        Perro p = new Perro("Sultán", "Pastor alemán");

        a.emitirSonido();
        g.emitirSonido();
        p.emitirSonido();

        System.out.println(a);
        System.out.println(g);
        System.out.println(p);

        System.out.println(p.getNombre());





    }
}
