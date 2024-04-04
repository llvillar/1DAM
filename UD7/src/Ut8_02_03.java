import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ut8_02_03 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("UT11_B02_03");
        ventana.setSize(640, 480);

        JPanel pnlPageStart = new JPanel();
        JLabel lblX = new JLabel("X = ?");
        JLabel lblY = new JLabel("Y = ?");
        pnlPageStart.add(lblX);
        pnlPageStart.add(lblY);

        ventana.add(pnlPageStart, BorderLayout.PAGE_START);

        ventana.setVisible(true);

        ventana.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                lblX.setText("X = " + e.getX());
                lblY.setText("Y = " + e.getY());
            }
        });
    }
}
