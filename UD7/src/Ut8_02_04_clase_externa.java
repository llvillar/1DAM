import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ut8_02_04_clase_externa {
    final static int NUM_FILAS = 5;
    final static int NUM_COLUMNAS = 5;

    public static void main(String[] args) {
        JFrame ventana = new JFrame("UT11_B02_04");
        ventana.setSize(800, 600);
        ventana.setLayout(new GridLayout(NUM_FILAS, NUM_COLUMNAS));
        MouseListener destructor = new EtiquetaMouseListener(ventana);

        for (int i = 0; i < NUM_FILAS * NUM_COLUMNAS; i++) {
            JLabel lbl = new JLabel("Dispárame", JLabel.CENTER);
            lbl.addMouseListener(destructor);
            ventana.add(lbl);
        }
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }









    private static class EtiquetaMouseListener extends MouseAdapter {
        int cuenta = NUM_FILAS * NUM_COLUMNAS;
        JFrame ventana;

        public EtiquetaMouseListener(JFrame ventana) {
            this.ventana = ventana;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            JLabel lbl = (JLabel) e.getSource();
            lbl.setVisible(false);
            cuenta--;
            ventana.setTitle("Quedan " + cuenta);
            if (cuenta == 0) {
                JOptionPane.showMessageDialog(ventana, "¡Todos borrados!", "Game over", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
    }
}
