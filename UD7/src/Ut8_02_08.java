import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Ut8_02_08 {
    public static void main(String[] args) {

        int numero = (int) (Math.random() * 31) + 1;

        JFrame ventana = new JFrame("UT11_B02_08");
        ventana.setSize(400, 200);

        // Parte superior
        JLabel lblNumero = new JLabel(Integer.toString(numero), JLabel.CENTER);
        lblNumero.setFont(lblNumero.getFont().deriveFont(48.0f));
        ventana.add(lblNumero, BorderLayout.CENTER);

        // Panel inferior
        JPanel pnlPageEnd = new JPanel();
        JToggleButton[] btnBinario = new JToggleButton[5];

        for (int i = 0; i < 5; i++) {
            btnBinario[i] = new JToggleButton("0");
            btnBinario[i].addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    JToggleButton btn = (JToggleButton) e.getSource();
                    btn.setText(btn.isSelected() ? "1" : "0");



                    StringBuilder cadenaBinaria = new StringBuilder();
                    for (int j = 0; j < 5; j++) {
                        cadenaBinaria.append(btnBinario[j].getText());
                    }

                    int numeroEntero = Integer.parseInt(cadenaBinaria.toString(), 2);

                    if (numeroEntero == numero) {
                        JOptionPane.showMessageDialog(ventana, "¡Lo hiciste!", cadenaBinaria.toString(), JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                }
            });
            pnlPageEnd.add(btnBinario[i]);
        }

        ventana.add(pnlPageEnd, BorderLayout.PAGE_END);

        ventana.setVisible(true);
    }
}
