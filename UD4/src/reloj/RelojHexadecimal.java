package reloj;

public class RelojHexadecimal extends Reloj {
    public RelojHexadecimal(int horas, int minutos, int segundos) {
        super(horas, minutos, segundos);
    }

    public RelojHexadecimal() {
        super();
    }

    public RelojHexadecimal(int horas) {
        super(horas);
    }

    public RelojHexadecimal(int horas, int minutos) {
        super(horas, minutos);
    }

    @Override
    public String toString() {
        return String.format("%02X:%02X:%02X",
                getHoras(), getMinutos(), getSegundos());
    }

    @Override
    public void dibujar() {
        System.out.println(this);
    }
}
