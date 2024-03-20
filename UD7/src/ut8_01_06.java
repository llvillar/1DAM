import javax.swing.*;
import java.awt.*;

public class ut8_01_06 {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setSize(800, 600);
        ventana.setTitle("Regilla de botones");

        ventana.setLayout(new GridLayout(6,8));

        for (int i = 1; i <= 48 ; i++)
            ventana.add(new JButton("Botón "  + i));

        ventana.setVisible(true);
    }
}
