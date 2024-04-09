import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_02_18 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("UT11_B02_18");

        String[] meses = { "Enero", "Febrero", "Marzo", "Abril",
                "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        JList<String> lstMeses = new JList<>(meses);
        // no haría falta, porque es el valor por defecto...
        lstMeses.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JButton btnMostrar = new JButton("Mostrar seleccionados");
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(lstMeses.getSelectedValuesList());
            }
        });

        ventana.add(lstMeses, BorderLayout.CENTER);
        ventana.add(btnMostrar, BorderLayout.PAGE_END);

        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
