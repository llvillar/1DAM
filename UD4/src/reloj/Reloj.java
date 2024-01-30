package reloj;

public abstract class Reloj implements Dibujable {
    private int horas;
    private int minutos;
    private int segundos;

    public Reloj(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public Reloj() {
        this(0, 0, 0);
    }

    public Reloj(int horas) {
        this(horas, 0, 0);
    }

    public Reloj(int horas, int minutos) {
        this(horas, minutos, 0);
    }

    public int getHoras() {
        return horas;
    }

    private void setHoras(int horas) {
        if (horas < 0 || horas > 23) {
            throw new IllegalArgumentException("Hora no válida");
        }
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    private void setMinutos(int minutos) {
        if (minutos < 0 || minutos > 59) {
            throw new IllegalArgumentException("Minutos no válidos");
        }
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    private void setSegundos(int segundos) {
        if (segundos < 0 || segundos > 59) {
            throw new IllegalArgumentException("Segundos no válidos");
        }
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",
                horas, minutos, segundos);
    }

    public void incrementaSegundos() {
        /*segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }*/
        incrementaSegundos(1);
    }

    public void incrementaSegundos(int numSegundos) {
        /* Cutre, no hacer así
        for (int i = 0; i < numSegundos; i++) {
            incrementaSegundo();
        }
        */
        segundos += numSegundos;
        minutos += segundos / 60;
        segundos = segundos % 60;

        horas += minutos / 60;
        minutos = minutos % 60;

        horas = horas % 24;
    }

    public long diferenciaSegundos(Reloj r){
        long dif_horas = this.horas - r.horas;
        long dif_min = this.minutos - r.minutos;
        long dif_seg = this.segundos - r.segundos;
        return dif_horas * 3600 + dif_min * 60 + dif_seg;
    }
}
