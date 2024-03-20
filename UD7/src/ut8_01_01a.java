import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ut8_01_01a {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        JLabel etiqueta = new JLabel("¡Hola mundo Swing!", JLabel.CENTER);
        ventana.setSize(640, 480);
        ventana.setTitle("¡Hola mundo!");
        ventana.add(etiqueta);
        ventana.setVisible(true);
    }
}