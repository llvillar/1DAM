import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_02_19a {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("UT11_B02_19a");
        DefaultListModel<String> elementos = new DefaultListModel<>();
        JList<String> lstListaCentral = new JList<>(elementos);
        lstListaCentral.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // parte superior (campo de texto + botón)
        JPanel pnlSuperior = new JPanel(new GridLayout(1, 2));
        JTextField txtItem = new JTextField(30);
        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elementos.addElement(txtItem.getText());
                txtItem.setText("");
            }
        });
        pnlSuperior.add(txtItem);
        pnlSuperior.add(btnAgregar);

        ventana.add(pnlSuperior, BorderLayout.PAGE_START);

        // parte central
        JScrollPane scrLista = new JScrollPane(lstListaCentral);

        ventana.add(scrLista, BorderLayout.CENTER);

        // parte inferior
        JPanel pnlInferior = new JPanel(new GridLayout(1, 2));
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lstListaCentral.getSelectedIndex() >= 0) {
                    elementos.remove(lstListaCentral.getSelectedIndex());
                }
            }
        });
        JButton btnVaciar = new JButton("Vaciar");
        btnVaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elementos.clear();
            }
        });

        pnlInferior.add(btnEliminar);
        pnlInferior.add(btnVaciar);

        ventana.add(pnlInferior, BorderLayout.PAGE_END);

        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
