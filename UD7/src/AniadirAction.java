import javax.swing.*;
import java.awt.event.ActionEvent;

public class AniadirAction extends AbstractAction {
    private final String path;
    private final JList<String> lista;

    public AniadirAction(String path, JList<String> lista) {
        super(path);
        this.path = path;
        this.lista = lista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<String> modelo = (DefaultListModel<String>) lista.getModel();

        if (!modelo.contains(path)) {
            modelo.addElement(path);
        }
    }
}
