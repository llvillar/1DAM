import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ut8_02_28 {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFrame ventana = new JFrame("UT11_B02_28");

        JPopupMenu menuDesplegable = new JPopupMenu();

        JMenuItem menuItemNuevo = new JMenuItem("Nuevo");
        JMenuItem menuItemAbrir = new JMenuItem("Abrir...");
        JMenu menuRecientes = new JMenu("Recientes");
        menuRecientes.add(new JMenuItem("prueba.txt"));
        menuRecientes.add(new JMenuItem("ejemplo2.dat"));
        JMenuItem menuItemCerrar = new JMenuItem("Cerrar");
        JMenuItem menuItemImprimir = new JMenuItem("Imprimir");
        JMenuItem menuItemSalir = new JMenuItem("Salir");

        menuItemSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuDesplegable.add(menuItemNuevo);
        menuDesplegable.add(menuItemAbrir);
        menuDesplegable.add(menuRecientes);
        menuDesplegable.add(menuItemCerrar);
        menuDesplegable.addSeparator();
        menuDesplegable.add(menuItemImprimir);
        menuDesplegable.addSeparator();
        menuDesplegable.add(menuItemSalir);

        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);

        ventana.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                comprobar(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                comprobar(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                comprobar(e);
            }

            private void comprobar(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    menuDesplegable.show(ventana, e.getX(), e.getY());
                }
            }
        });
    }
}
