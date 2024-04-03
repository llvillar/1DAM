import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MasUnoActionListener implements ActionListener {

    private JButton resultado;
    public MasUnoActionListener(JButton resultado) {
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String total = resultado.getText();
        int i = Integer.parseInt(total);
        total = String.valueOf(i + 1);
        resultado.setText(total);
    }
}