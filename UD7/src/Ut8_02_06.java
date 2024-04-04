import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ut8_02_06 {

    final static int NUM_FILAS = 10;
    final static int NUM_COLUMNAS = 10;
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Ut11_B8_02_06");
        ventana.setSize(800,600);
        ventana.setLayout(new GridLayout(NUM_FILAS, NUM_COLUMNAS));

        for(int i = 0; i < NUM_FILAS * NUM_COLUMNAS; i++){
            JLabel lbl = new JLabel("Márcame", JLabel.CENTER);
            ventana.add(lbl);

            lbl.addMouseListener(new MouseAdapter() {

                Color original;

                @Override
                public void mouseEntered(MouseEvent e) {
                    JLabel lbl = (JLabel) e.getSource();
                    original = lbl.getForeground();
                    lbl.setForeground(Color.RED);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    JLabel lbl = (JLabel) e.getSource();
                    lbl.setForeground(original);
                }
            });


        }




        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);


    }
}
