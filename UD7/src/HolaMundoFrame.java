import javax.swing.*;
import java.awt.*;

public class HolaMundoFrame extends JFrame {
    public HolaMundoFrame() {
        JLabel etiqueta = new JLabel("¡Hola mundo Swing!", JLabel.CENTER);
        this.setSize(640, 480);
        this.setTitle("¡Hola mundo!");
        this.add(etiqueta);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
