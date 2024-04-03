import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenosUnoActionListener implements ActionListener {

    private JButton resultado;
    public MenosUnoActionListener(JButton resultado) {
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String total = resultado.getText();
        int i = Integer.parseInt(total);
        total = String.valueOf(i - 1);
        resultado.setText(total);
    }
}