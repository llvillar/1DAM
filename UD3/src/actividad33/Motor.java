package actividad33;

public class Motor {

    private String cilindrada;
    private int potencia;
    private String combustible;

    public Motor() {
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "cilindrada='" + cilindrada + '\'' +
                ", potencia=" + potencia +
                ", combustible='" + combustible + '\'' +
                '}';
    }
}
