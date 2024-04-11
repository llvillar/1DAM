import javax.swing.*;
import java.awt.event.ActionEvent;

public class EliminarAction extends AbstractAction {
    private final JList<?> lista;

    public EliminarAction(JList<?> lista) {
        super("Eliminar");
        this.lista = lista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (lista.getSelectedIndex() > -1) {
            DefaultListModel<?> modelo = (DefaultListModel<?>) lista.getModel();
            modelo.remove(lista.getSelectedIndex());
        }
    }
}
