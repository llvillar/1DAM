import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ut8_01_10 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(640, 480);
        ventana.setTitle("Prueba de ActionListener");
        ventana.setLayout(new FlowLayout());
        JButton boton = new JButton("¡Púlsame!");

        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hay un evento nuevo en " + e.getWhen());
                System.out.println(e.getActionCommand());
                if ((e.getModifiers() & ActionEvent.ALT_MASK) != 0)
                    System.out.println("Tecla Alt");
                if ((e.getModifiers() & ActionEvent.SHIFT_MASK) != 0)
                    System.out.println("Tecla Shift");
                if ((e.getModifiers() & ActionEvent.CTRL_MASK) != 0)
                    System.out.println("Tecla Ctrl");
                if ((e.getModifiers() & ActionEvent.META_MASK) != 0)
                    System.out.println("Tecla Meta");
                System.out.println("Fin de información del evento");
            }
        });

        ventana.add(boton);
        ventana.setVisible(true);
    }
}
