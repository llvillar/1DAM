import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Ut8_02_07 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("UT11_B02_07");
        ventana.setSize(640, 480);
        ventana.setLayout(new FlowLayout());

        JButton btnNormal = new JButton("Púlsame");
        JToggleButton btnToggle = new JToggleButton("OFF");
        btnToggle.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JToggleButton btn = (JToggleButton) e.getSource();
                btn.setText(btn.isSelected() ? "ON" : "OFF");
            }
        });

        ventana.add(btnNormal);
        ventana.add(btnToggle);

        ventana.setVisible(true);
    }
}
