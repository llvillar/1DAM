import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_02_12 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("UT11_B02_12");
        ventana.setLayout(new FlowLayout());
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton rb = (JRadioButton) e.getSource();
                if (rb.isSelected()) {
                    System.out.println("El elemento seleccionado del grupo es: " + rb.getText());
                }
            }
        };
        ButtonGroup bg = new ButtonGroup();
        JRadioButton rb1 = new JRadioButton("Windows");
        JRadioButton rb2 = new JRadioButton("Linux");
        JRadioButton rb3 = new JRadioButton("macOS", true);
        JRadioButton rb4 = new JRadioButton("BeOS");
        bg.add(rb1); rb1.addActionListener(al); ventana.add(rb1);
        bg.add(rb2); rb2.addActionListener(al); ventana.add(rb2);
        bg.add(rb3); rb3.addActionListener(al); ventana.add(rb3);
        bg.add(rb4); rb4.addActionListener(al); ventana.add(rb4);

        ventana.setSize(300, 100);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
