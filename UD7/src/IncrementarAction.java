import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class IncrementarAction extends AbstractAction {
    private final JLabel lblContador;

    public IncrementarAction(JLabel lblContador) {
        super("Incrementar");
        this.lblContador = lblContador;
        this.putValue(SHORT_DESCRIPTION, "Incrementa el valor del número");
        putValue(MNEMONIC_KEY, KeyEvent.VK_I);
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
            KeyEvent.VK_1, InputEvent.CTRL_DOWN_MASK));
        putValue(SMALL_ICON, new ImageIcon("mas16.png"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int cuenta = Integer.parseInt(lblContador.getText()) + 1;
        lblContador.setText(String.valueOf(cuenta));
    }
}
