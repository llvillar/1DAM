import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_01_13 {
    public static void main(String[] args) {
        new TablaMultiplicarFrame();
    }

    private static class TablaMultiplicarFrame extends JFrame {
        JTextField txtNumero;
        JButton btnMultiplicar;
        JLabel[] lblResultados;

        public TablaMultiplicarFrame() throws HeadlessException {
            super("Tabla de multiplicar");

            this.setSize(640, 480);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(new GridLayout(1, 3));

            JPanel pnlResultados = new JPanel(new GridLayout(10, 1));

            txtNumero = new JTextField("0");
            btnMultiplicar = new JButton("Multiplicar");
            lblResultados = new JLabel[10];
            for (int i = 0; i < 10; i++) {
                lblResultados[i] = new JLabel("---");
                pnlResultados.add(lblResultados[i]);
            }
            this.add(txtNumero);
            this.add(btnMultiplicar);

            btnMultiplicar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int numero = Integer.parseInt(txtNumero.getText());
                    for (int i = 0; i < 10; i++) {
                        lblResultados[i].setText(numero + "x" + (i + 1) + "=" + numero * (i + 1));
                    }
                }
            });

            this.add(pnlResultados);

            this.setVisible(true);
        }
    }
}
