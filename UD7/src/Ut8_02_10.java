import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_02_10 {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("UT11_B02_10");
        ventana.setSize(640,480);

        JTextArea txtContenido = new JTextArea("Colca aquí el texto....");

        JButton btnContar = new JButton("Contar");

        btnContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cuenta = txtContenido.getLineCount();
                JOptionPane.showMessageDialog(ventana, "Hay " + cuenta + " líneas en el texto", "Resultado", JOptionPane.INFORMATION_MESSAGE);

            }
        });


        ventana.add(txtContenido, BorderLayout.CENTER);


        ventana.add(btnContar, BorderLayout.PAGE_END);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }

}
