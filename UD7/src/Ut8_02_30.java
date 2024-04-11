import javax.swing.*;
import java.awt.*;

public class Ut8_02_30 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("UT11_B02_30");

        Action salirAction = new SalirAction();

        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");

        JMenuItem menuItemNuevo = new JMenuItem("Nuevo");
        JMenuItem menuItemAbrir = new JMenuItem("Abrir...");
        JMenu menuRecientes = new JMenu("Recientes");
        menuRecientes.add(new JMenuItem("prueba.txt"));
        menuRecientes.add(new JMenuItem("ejemplo2.dat"));
        JMenuItem menuItemCerrar = new JMenuItem("Cerrar");
        JMenuItem menuItemImprimir = new JMenuItem("Imprimir");

        menuArchivo.add(menuItemNuevo);
        menuArchivo.add(menuItemAbrir);
        menuArchivo.add(menuRecientes);
        menuArchivo.add(menuItemCerrar);
        menuArchivo.addSeparator();
        menuArchivo.add(menuItemImprimir);
        menuArchivo.addSeparator();
        menuArchivo.add(salirAction);

        menuBar.add(menuArchivo);

        ventana.setJMenuBar(menuBar);

        JPanel pnlSuperior = new JPanel(new FlowLayout());
        pnlSuperior.add(new JButton(salirAction));

        ventana.add(pnlSuperior, BorderLayout.PAGE_START);

        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
