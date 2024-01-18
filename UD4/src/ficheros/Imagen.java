package ficheros;

public class Imagen  implements Almacenable, Rotable{

    private int anchura;
    private int altura;

    public Imagen(int anchura, int altura) {
        this.anchura = anchura;
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void guardar(String nombreFichero) {
        System.out.println("Guardando imagen en " + nombreFichero);
    }

    @Override
    public void recuperar(String nombreFichero) {
        System.out.println("Cargando imagen desde " + nombreFichero);
    }

    @Override
    public void rotarSentidoAgujas() {
        System.out.println("Rotando imagen +90º");
    }

    @Override
    public void rotarSentidoContrarioAgujas() {
        System.out.println("Rotando imagen -90º");
    }

    @Override
    public String describir() {
        return "Imagen es " + Rotable.super.describir()
                + " " + Almacenable.super.describir();
    }
}
