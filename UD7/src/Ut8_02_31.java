import javax.swing.*;

public class Ut8_02_31 {
    public static void main(String[] args) {


        JFrame ventana = new GaleriaFrame(args.length > 0 ? args[0] : ".");





        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
