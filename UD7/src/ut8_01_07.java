import javax.swing.*;
import java.awt.*;

public class ut8_01_07 {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setSize(800, 600);
        ventana.setTitle("BorderLayout");

        ventana.setLayout(new BorderLayout());

        JPanel panelPageStart = new JPanel();
        panelPageStart.add(new JButton("Botón 1"));
        panelPageStart.add(new JButton("Botón 2"));
        panelPageStart.add(new JButton("Botón 3"));
        ventana.add(panelPageStart, BorderLayout.PAGE_START);

        JPanel panelPageEnd = new JPanel(new GridLayout(1, 2));
        panelPageEnd.add(new JButton("Botón 4"));
        panelPageEnd.add(new JButton("Botón 5"));
        ventana.add(panelPageEnd, BorderLayout.PAGE_END);

        ventana.add(new JButton("LINE_START"), BorderLayout.LINE_START);
        ventana.add(new JButton("LINE_END"), BorderLayout.LINE_END);
        ventana.add(new JButton("CENTER"), BorderLayout.CENTER);

        ventana.setVisible(true);
    }
}
