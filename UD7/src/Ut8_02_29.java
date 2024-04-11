import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Ut8_02_29 {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("UT11_B02_29");
        JLabel lblContador = new JLabel("0", JLabel.CENTER);
        lblContador.setFont(lblContador.getFont().deriveFont(48.0f));
        JCheckBox cbActivar = new JCheckBox("Acción incrementar activada", true);

        Action actIncrementar = new IncrementarAction(lblContador);
        Action actDecrementar = new DecrementarAction(lblContador);


        JPanel pnlSuperior = new JPanel(new FlowLayout());
        pnlSuperior.add(new JButton(actIncrementar));
        pnlSuperior.add(new JButton(actDecrementar));

        ventana.add(pnlSuperior, BorderLayout.PAGE_START);
        ventana.add(lblContador, BorderLayout.CENTER);
        ventana.add(cbActivar, BorderLayout.PAGE_END);

        cbActivar.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JCheckBox cb = (JCheckBox) e.getSource();
                actIncrementar.setEnabled(cb.isSelected());
            }
        });

        JMenuBar menuBar = new JMenuBar();

        JMenu menuContador = new JMenu("Contador");
        menuContador.add(actIncrementar);
        menuContador.add(actDecrementar);

        menuBar.add(menuContador);

        ventana.setJMenuBar(menuBar);

        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
