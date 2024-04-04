import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class Ut8_02_05 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("UT11_B02_05");
        ventana.setSize(640, 480);
        ventana.setAlwaysOnTop(true);
        ventana.addWindowFocusListener(new WindowFocusListener() {
            String tituloOriginal = null;
            @Override
            public void windowGainedFocus(WindowEvent e) {
                JFrame v = (JFrame) e.getSource();
                if (tituloOriginal == null) {
                    tituloOriginal = v.getTitle();
                } else {
                    v.setTitle(tituloOriginal);
                }
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                JFrame v = (JFrame) e.getSource();
                v.setTitle("(INACTIVA)");
            }
        });

        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ventana.setVisible(true);
    }
}
