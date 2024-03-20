import javax.swing.*;
import java.awt.*;

public class ut8_01_03c {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setSize(400, 300);
        ventana.setTitle("ut8_01_03");

        ventana.setLayout(new GridLayout(3, 2));

        ventana.add(new JButton("Botón 1"));
        ventana.add(new JButton("Botón 2"));
        ventana.add(new JButton("Botón 3"));
        ventana.add(new JLabel("Etiqueta"));
        ventana.add(new JCheckBox("Checkbox"));

        JProgressBar progreso = new JProgressBar(JProgressBar.CENTER, 0, 100);
        progreso.setValue(25);
        ventana.add(progreso);
        ventana.setVisible(true);
    }
}
