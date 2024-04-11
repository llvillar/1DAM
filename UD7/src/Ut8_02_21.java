import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_02_21 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("UT11_B02_21");

        String[] emojis = { "¡Estoy loco!", "¡Ooooh!", "LOL!", "¿Hmmm? "};
        JComboBox<String> comboEmojis = new JComboBox<>(emojis);

        ventana.add(comboEmojis, BorderLayout.PAGE_START);

        JLabel imagen = new JLabel("(Nada que mostrar)", JLabel.CENTER);
        imagen.setPreferredSize(new Dimension(700, 700));
        ventana.add(imagen, BorderLayout.CENTER);
        cambiarImagen(comboEmojis, imagen);
        comboEmojis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarImagen(comboEmojis, imagen);
            }
        });

        comboEmojis.setRenderer(new EmojiComboBoxRenderer());

        ventana.setSize(1024, 768);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    private static void cambiarImagen(JComboBox<String> comboEmojis, JLabel imagen) {
        if (comboEmojis.getSelectedIndex() >= 0) {
            imagen.setIcon(new ImageIcon("emoji" + comboEmojis.getSelectedIndex() + ".png"));
            imagen.setText(null);
        } else {
            imagen.setText("(Nada que mostrar)");
            imagen.setIcon(null);
        }
    }
}
