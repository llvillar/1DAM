import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class DecrementarAction extends AbstractAction {
    private final JLabel lblContador;

    public DecrementarAction(JLabel lblContador) {
        super("Decrementar");
        this.lblContador = lblContador;
        this.putValue(SHORT_DESCRIPTION, "Decrementa el valor del número");
        putValue(MNEMONIC_KEY, KeyEvent.VK_D);
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
            KeyEvent.VK_2, InputEvent.CTRL_DOWN_MASK));
        putValue(SMALL_ICON, new ImageIcon("menos16.png"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int cuenta = Integer.parseInt(lblContador.getText()) - 1;
        lblContador.setText(String.valueOf(cuenta));
    }
}
