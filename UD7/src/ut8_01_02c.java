import javax.swing.*;
public class ut8_01_02c {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();

        JLabel etiqueta = new JLabel("¡Hola mundo Swing!", JLabel.CENTER);
        ventana.setBounds(10, 10, 640, 480);
        ventana.setTitle("¡Hola mundo!");
        ventana.add(etiqueta);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JWindow hija = new JWindow(ventana);
        hija.setBounds(200, 200, 400, 300);
        hija.add(new JLabel("Ventana sin título", JLabel.CENTER));
        hija.setVisible(true);
    }
}