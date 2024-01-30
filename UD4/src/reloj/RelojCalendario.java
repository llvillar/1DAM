package reloj;

public class RelojCalendario extends Reloj {
    private int dia;
    private int mes;
    private int anio;

    private int[] diasMes = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    private final String[] nombreMes = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };

    public RelojCalendario(int dia, int mes, int anio, int horas, int minutos, int segundos) {
        super(horas, minutos, segundos);
        establecerFecha(dia, mes, anio);
    }

    public RelojCalendario(int dia, int mes, int anio) {
        establecerFecha(dia, mes, anio);
    }

    public RelojCalendario(int dia, int mes, int anio, int horas) {
        super(horas);
        establecerFecha(dia, mes, anio);
    }

    public RelojCalendario(int dia, int mes, int anio, int horas, int minutos) {
        super(horas, minutos);
        establecerFecha(dia, mes, anio);
    }

    private void establecerFecha(int dia, int mes, int anio) {
        setAnio(anio);
        setMes(mes);
        setDia(dia);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia < 0 || dia > diasMes[mes - 1]) {
            throw new IllegalArgumentException("Día no válido");
        }
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes < 0 || mes > 12) {
            throw new IllegalArgumentException("Mes no válido");
        }
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
        diasMes[1] = esBisiesto() ? 29 : 28;
    }

    private boolean esBisiesto() {
        return anio % 400 == 0 || anio % 100 != 0 && anio % 4 == 0;
    }



    @Override
    public void incrementaSegundos(int numSegundos) {
        int segundos = getSegundos() + numSegundos;
        int minutos = getMinutos() + segundos / 60;
        int horas = getHoras() + minutos / 60;
        int incrementoDias = horas / 24;

        super.incrementaSegundos(numSegundos);

        dia += incrementoDias;

        while (dia > diasMes[mes - 1]) {
            dia -= diasMes[mes - 1];
            mes++;
            if (mes == 13) {
                mes = 1;
                setAnio(anio + 1);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d ", dia, mes, anio) + super.toString();
    }

    @Override
    public void dibujar() {
        String fecha = getDia() +
            " de " + nombreMes[getMes() - 1] + " de " +
            getAnio();

        int rellenoIzda = (fecha.length() - 8) / 2;
        System.out.println("╭─" + "─".repeat(fecha.length()) + "─╮");
        System.out.println("│ " + fecha + " |");
        System.out.println("│ " + " ".repeat(rellenoIzda) + super.toString() +
                " ".repeat(fecha.length() - rellenoIzda - 8) + " |");
        System.out.println("└─" + "─".repeat(fecha.length()) + "─┘" );
    }
}
