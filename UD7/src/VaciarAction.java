import javax.swing.*;
import java.awt.event.ActionEvent;

public class VaciarAction extends AbstractAction {
    private final JList<?> lista;

    public VaciarAction(String nombre, JList<?> lista) {
        super(nombre);
        this.lista = lista;
    }

    public VaciarAction(JList<?> lista) {
        super("Vaciar");
        this.lista = lista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<?> modelo = (DefaultListModel<?>) lista.getModel();
        modelo.clear();
    }
}
