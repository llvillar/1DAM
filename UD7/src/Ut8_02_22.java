import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_02_22 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setLayout(null);

        String[] meses = { "Enero", "Febrero", "Marzo", "Abril",
                "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre" };

        JComboBox<String> comboBoxEditable = new JComboBox<>(meses);
        comboBoxEditable.setEditable(true);
        comboBoxEditable.setBounds(200, 20, 120, 26);

        ventana.add(comboBoxEditable);

        // añadir elemento si se edita y se pulsa intro
        comboBoxEditable.getEditor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cadena = (String) comboBoxEditable.getEditor().getItem();
                if (((DefaultComboBoxModel<String>)
                        comboBoxEditable.getModel()).getIndexOf(cadena) == -1) {
                    comboBoxEditable.addItem(cadena);
                }
                comboBoxEditable.setSelectedItem(cadena);
            }
        });

        comboBoxEditable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha elegido " + comboBoxEditable.getSelectedItem());
            }
        });

        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
