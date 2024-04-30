package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalView extends JFrame {
    public PrincipalView() throws HeadlessException {
        setTitle("Concesionario");
        setSize(640, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem itemCoches = new JMenuItem("Coches");
        JMenuItem itemClientes = new JMenuItem("Clientes");
        itemCoches.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CocheView cocheView = new CocheView();
                add(cocheView);
                cocheView.setVisible(true);
                repaint();
            }
        });

        itemClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                ClienteView clienteView = new ClienteView();
 //               add(clienteView);
            }
        });

        JMenuItem itemSalir = new JMenuItem("Salir");
        itemSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(itemCoches);
        menu.add(itemClientes);
        menu.addSeparator();
        menu.add(itemSalir);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        setVisible(true);
    }
}
