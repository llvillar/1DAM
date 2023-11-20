package dam1;

import java.util.Random;

public class Contador {
    private int cantidad = 0;

    public Contador() {
        Random r = new Random();
        this.cantidad = r.nextInt(11) + 1;
    }

    public Contador(int cantidad) {
        this.cantidad = cantidad;
    }

    public void incrementar() {
        cantidad++;
    }

    public void decrementar() {
        cantidad--;
    }

    public int getCantidad(){
        return cantidad;
    }
}
