import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_02_09 {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("UT11_B8_02_09");
        ventana.setSize(640,480);
        ventana.setLayout(new FlowLayout());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btnEntrar = new JButton("Entrar");

        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UsuarioClaveDialog dialogo = new UsuarioClaveDialog(ventana, true);
            }
        });


        ventana.add(btnEntrar);
        ventana.setVisible(true);


    }
}
