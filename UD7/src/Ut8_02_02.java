import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ut8_02_02 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("UT11_B02_02");
        ventana.setSize(640, 480);
        ventana.setVisible(true);
        ventana.setName("Principal");

        ventana.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                System.out.println(e);


            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println(e);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println(e);

            }
        });


    }
}
