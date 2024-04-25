package views;

import model.entities.Cliente;
import model.entities.Coche;
import model.services.ClienteService;
import model.services.ClienteServiceImpl;
import model.services.CocheService;
import model.services.CocheServiceImpl;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ConcesionarioViewMenu extends JFrame {
    private JTable carTable;
    private JScrollPane scrollPane;

    public ConcesionarioViewMenu() {
        setTitle("Listado de Coches");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Crear menú
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Archivo");
        JMenuItem exitMenuItem = new JMenuItem("Salir");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        JMenuItem showCarsMenuItem = new JMenuItem("Coches");
        showCarsMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCars();
            }
        });

        JMenuItem showClientesMenuItem = new JMenuItem("Clientes");
        showClientesMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showClientes();
            }
        });

        fileMenu.add(showCarsMenuItem);
        fileMenu.add(showClientesMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);


        setJMenuBar(menuBar);

        // Crear tabla
        carTable = new JTable();
        scrollPane = new JScrollPane(carTable);

        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    private void showCars() {

        // Configurar modelo de datos
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Matricula");
        model.addColumn("Marca");
        model.addColumn("Modelo");
        model.addColumn("Año");
        model.addColumn("Precio");
        model.addColumn("Vendido");

        CocheService service = new CocheServiceImpl();

        List<Coche> coches = service.getList();

        for (Coche coche : coches) {
            model.addRow(new Object[]{
                    coche.getMatricula(),
                    coche.getMarca(),
                    coche.getModelo(),
                    coche.getAnio(),
                    coche.getPrecio(),
                    coche.isVendido()
            });
        }

        carTable.setModel(model);
    }

    private void showClientes() {

        // Configurar modelo de datos
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("nif");
        model.addColumn("Nombre");
        model.addColumn("1º Apellido");
        model.addColumn("2º Apellido");
        model.addColumn("Direccion");
        model.addColumn("Ciudad");
        model.addColumn("Codigo postal");
        model.addColumn("Telefono");

        ClienteService service = new ClienteServiceImpl();

        List<Cliente> clientes = service.getList();

        for (Cliente cliente : clientes) {
            model.addRow(new Object[]{
                    cliente.getNif(),
                    cliente.getNombre(),
                    cliente.getApellido1(),
                    cliente.getApellido2(),
                    cliente.getDireccion(),
                    cliente.getCiudad(),
                    cliente.getCodigoPostal(),
                    cliente.getTelefono()
            });
        }

        carTable.setModel(model);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ConcesionarioViewMenu example = new ConcesionarioViewMenu();
            example.setVisible(true);
        });
    }
}
