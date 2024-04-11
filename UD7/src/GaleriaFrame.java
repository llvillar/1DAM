import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.io.File;

public class GaleriaFrame extends JFrame {
    public GaleriaFrame(String nombre) throws HeadlessException {
        super("Galería de imágenes");

        JLabel lblImagen = new JLabel("", SwingConstants.CENTER);
        lblImagen.setBackground(Color.WHITE);
        lblImagen.setOpaque(true);

        DefaultListModel<String> modelo = new DefaultListModel<>();
        JList<String> lista = new JList<>(modelo);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        EliminarAction eliminarAction = new EliminarAction(lista);
        eliminarAction.setEnabled(false);
        VaciarAction vaciarAction = new VaciarAction(lista);
        vaciarAction.setEnabled(false);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuImagenes = new JMenu("Imagenes");

        menuBar.add(menuArchivo);
        menuBar.add(menuImagenes);

        setJMenuBar(menuBar);

        File directorio = new File(".");

        for (File f : directorio.listFiles()) {
            if (f.getName().toLowerCase().endsWith(".png")) {
                menuImagenes.add(new AniadirAction(f.getPath(), lista));
            }
        }

        lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                eliminarAction.setEnabled(lista.getSelectedIndex() > -1);
                if (lista.getSelectedValue() != null) {
                    lblImagen.setIcon(new ImageIcon(lista.getSelectedValue()));
                } else {
                    lblImagen.setIcon(null);
                }
            }
        });

        lista.getModel().addListDataListener(new ListDataListener() {
            @Override
            public void intervalAdded(ListDataEvent e) {
                comprueba();
            }

            @Override
            public void intervalRemoved(ListDataEvent e) {
                comprueba();
            }

            @Override
            public void contentsChanged(ListDataEvent e) {
                comprueba();
            }

            private void comprueba() {
                DefaultListModel<?> modelo = (DefaultListModel<?>) lista.getModel();
                vaciarAction.setEnabled(!modelo.isEmpty());
            }
        });

        setLayout(new GridLayout(1, 3));

        // primer tercio
        add(new JScrollPane(lista));

        // segundo tercio
        JPanel pnlCentro = new JPanel(new FlowLayout());
        pnlCentro.add(new JButton(eliminarAction));
        pnlCentro.add(new JButton(vaciarAction));
        add(pnlCentro);

        // tercer tercio
        add(lblImagen);

        // menú Archivo
        menuArchivo.add(vaciarAction);
        menuArchivo.addSeparator();
        menuArchivo.add(new SalirAction());
    }
}
