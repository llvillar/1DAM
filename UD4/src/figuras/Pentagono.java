package figuras;

import java.io.IOException;

public class Pentagono extends FiguraGeometrica {
    private double arista;

    public Pentagono(String nombre, double arista) throws IllegalArgumentException, IOException{
        super(nombre);
        setArista(arista);
    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) throws IllegalArgumentException, IOException {
        if (arista < 0) {
            throw new IllegalArgumentException("Lado no válido");
        }
        this.arista = arista;
    }

    @Override
    public double calcularPerimetro() {
        return 5 * arista;
    }

    public static void main(String[] args) {
        Pentagono p;
        try {
             p = new Pentagono("Pentagono", -1);
        }catch (Throwable e){
            try {
                p = new Pentagono("Pentagono", -1);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

        System.out.println(p.calcularPerimetro());
    }
}
