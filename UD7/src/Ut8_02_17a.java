import javax.swing.*;

public class Ut8_02_17a {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("UT11_B02_17a");

        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        JList<String> lstMeses = new JList<>(meses);

        lstMeses.setLayoutOrientation(JList.VERTICAL_WRAP);


        ventana.add(lstMeses);

        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
