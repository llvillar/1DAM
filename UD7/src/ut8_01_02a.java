import javax.swing.*;
public class ut8_01_02a {
    public static void main(String[] args) {

        JFrame ventana = new JFrame();

        JLabel etiqueta = new JLabel("¡Hola mundo Swing!", JLabel.CENTER);

        ventana.setSize(640, 480);
        ventana.setTitle("¡Hola mundo!");
        ventana.add(etiqueta);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JDialog hija = new JDialog(ventana);
        hija.setSize(400, 300);
        hija.setTitle("Ventana hija");
        hija.setVisible(true);
    }
}