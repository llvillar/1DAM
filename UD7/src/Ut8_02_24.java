import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ut8_02_24 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("UT11_B02_24");

        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuEdicion = new JMenu("Edición");

        JMenuItem menuItemNuevo = new JMenuItem("Nuevo");
        JMenuItem menuItemAbrir = new JMenuItem("Abrir...");
        JMenuItem menuItemCerrar = new JMenuItem("Cerrar");
        JMenuItem menuItemImprimir = new JMenuItem("Imprimir");
        JMenuItem menuItemSalir = new JMenuItem("Salir");

        menuItemSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuArchivo.add(menuItemNuevo);
        menuArchivo.add(menuItemAbrir);
        menuArchivo.add(menuItemCerrar);
        menuArchivo.addSeparator();
        menuArchivo.add(menuItemImprimir);
        menuArchivo.addSeparator();
        menuArchivo.add(menuItemSalir);

        JMenuItem menuItemDeshacer = new JMenuItem("Deshacer");
        JMenuItem menuItemRehacer = new JMenuItem("Rehacer");
        JMenuItem menuItemCortar = new JMenuItem("Cortar");
        JMenuItem menuItemCopiar = new JMenuItem("Copiar");
        JMenuItem menuItemPegar = new JMenuItem("Pegar");

        menuEdicion.add(menuItemDeshacer);
        menuEdicion.add(menuItemRehacer);
        menuEdicion.addSeparator();
        menuEdicion.add(menuItemCortar);
        menuEdicion.add(menuItemCopiar);
        menuEdicion.add(menuItemPegar);

        menuBar.add(menuArchivo);
        menuBar.add(menuEdicion);

        ventana.setJMenuBar(menuBar);

        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
