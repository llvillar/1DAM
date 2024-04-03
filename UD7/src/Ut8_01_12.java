import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_01_12 {
    public static void main(String[] args) {
        String[] diasSemana = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(640, 100);
        ventana.setTitle("Accediendo a otros componentes");

        JTextField txtCampo = new JTextField("Pulsa un botón");

        JPanel pnlBotones = new JPanel();
        DiaSemanaActionListener diaSemanaActionListener = new DiaSemanaActionListener(txtCampo);

        for (String nombreDia : diasSemana) {
            JButton boton = new JButton(nombreDia);
            boton.addActionListener(diaSemanaActionListener);
            pnlBotones.add(boton);
        }

        ventana.add(pnlBotones, BorderLayout.PAGE_START);
        ventana.add(txtCampo, BorderLayout.CENTER);

        ventana.setVisible(true);
    }

    static class DiaSemanaActionListener implements ActionListener {
        JTextField txt;

        public DiaSemanaActionListener(JTextField txt) {
            this.txt = txt;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            txt.setText(btn.getText());
        }
    }
}

