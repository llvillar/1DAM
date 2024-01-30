package reloj;

public class RelojBinario extends Reloj {
    public RelojBinario(int horas, int minutos, int segundos) {
        super(horas, minutos, segundos);
    }

    public RelojBinario() {
        super();
    }

    public RelojBinario(int horas) {
        super(horas);
    }

    public RelojBinario(int horas, int minutos) {
        super(horas, minutos);
    }

    @Override
    public String toString() {
        String horasBinario = Integer.toBinaryString(getHoras());
        String minutosBinario = Integer.toBinaryString(getMinutos());
        String segundosBinario = Integer.toBinaryString(getSegundos());

        return "0".repeat(6 - horasBinario.length()) + horasBinario + ":" +
               "0".repeat(6 - minutosBinario.length()) + minutosBinario + ":" +
               "0".repeat(6 - segundosBinario.length()) + segundosBinario;
    }

    @Override
    public void dibujar() {
        System.out.printf("|%02d%s|%02d%s|%02d%s|\n",
                getHoras(),
                Character.toString(0x2800 + getHoras()),
                getMinutos(),
                Character.toString(0x2800 + getMinutos()),
                getSegundos(),
                Character.toString(0x2800 + getSegundos())
        );
    }
}
