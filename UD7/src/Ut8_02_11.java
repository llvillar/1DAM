import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_02_11 {
    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setLayout(new FlowLayout());

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox cb = (JCheckBox) e.getSource();
                System.out.println(cb.getText() + ": Es ahora " + cb.isSelected());
            }
        };

        JCheckBox cb1 = new JCheckBox("Windows");
        JCheckBox cb2 = new JCheckBox("Linux");
        JCheckBox cb3 = new JCheckBox("macOS", true);
        JCheckBox cb4 = new JCheckBox("BeOS");

        cb1.addActionListener(al);
        ventana.add(cb1);
        cb2.addActionListener(al);
        ventana.add(cb2);
        cb3.addActionListener(al);
        ventana.add(cb3);
        cb4.addActionListener(al);
        ventana.add(cb4);

        ventana.setSize(300, 100);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
