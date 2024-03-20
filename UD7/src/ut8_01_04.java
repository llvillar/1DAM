import javax.swing.*;
import java.awt.*;

public class ut8_01_04 {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setSize(400, 300);
        ventana.setTitle("ut8_01_04");

        ventana.setLayout(null);

        JButton b1 = new JButton("Botón 1");
        b1.setBounds(20, 20, 80, 40);
        ventana.add(b1);

        JButton b2 = new JButton("Botón 2");
        b2.setBounds(120, 80, 90, 50);
        b2.setEnabled(false);
        ventana.add(b2);

        JTextField casillaTexto = new JTextField("Escribe algo...");
        casillaTexto.setBounds(20, 160, 200, 30);

        ventana.add(casillaTexto);
        ventana.setVisible(true);
    }
}
