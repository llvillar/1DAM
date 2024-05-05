package views;

import model.entities.Cliente;
import model.entities.Coche;
import model.services.ClienteService;
import model.services.ClienteServiceImpl;
import model.services.CocheService;
import model.services.CocheServiceImpl;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Date;
import java.util.List;

public class ClienteView extends JPanel{

    ClienteService service;
    JTable listadoTable;
    private JPanel formPanel;
    JTextField _nif;
    JTextField _nombre;
    JTextField _apellido1;
    JTextField _apellido2;
    JTextField _direccion;
    JTextField _ciudad;
    JTextField _codigoPostal;
    JTextField _telefono;
    JButton addButton;
    JButton updateButton;
    JButton deleteButton;
    JButton clearButton;

    public ClienteView () {

        service = new ClienteServiceImpl();

        this.setLayout(new GridLayout(2,1));

        listadoTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(listadoTable);
        this.add(scrollPane, BorderLayout.CENTER);

        crearFormulario();

        this.add(formPanel, BorderLayout.SOUTH);
        formPanel.setVisible(true);

        listadoTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow = listadoTable.getSelectedRow();
                if (selectedRow >= 0) {
                    showCarForm(selectedRow);
                }
            }
        });

        showClient();
        this.setVisible(true);
    }

    private void crearFormulario() {
        // Crear formulario
        formPanel = new JPanel(new GridLayout(5, 2));

        formPanel.setBorder(BorderFactory.createTitledBorder("Detalles del Cliente"));
        formPanel.add(new JLabel("Nif:"));
        _nif = new JTextField();
        formPanel.add(_nif);

        formPanel.add(new JLabel("Nombre:"));
        _nombre = new JTextField();
        formPanel.add(_nombre);

        formPanel.add(new JLabel("Apellido 1:"));
        _apellido1 = new JTextField();
        formPanel.add(_apellido1);

        formPanel.add(new JLabel("Apellido 2:"));
        _apellido2 = new JTextField();
        formPanel.add(_apellido2);

        formPanel.add(new JLabel("Dirección:"));
        _direccion = new JTextField();
        formPanel.add(_direccion);

        formPanel.add(new JLabel("Ciudad:"));
        _ciudad = new JTextField();
        formPanel.add(_ciudad);

        formPanel.add(new JLabel("Código postal:"));
        _codigoPostal = new JTextField();
        formPanel.add(_codigoPostal);

        formPanel.add(new JLabel("Telefono:"));
        _telefono = new JTextField();
        formPanel.add(_telefono);


        addButton = new JButton("Nuevo");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addClient();
            }
        });
        formPanel.add(addButton);

        updateButton = new JButton("Actualizar");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateClient();
            }
        });
        formPanel.add(updateButton);

        deleteButton = new JButton("Eliminar");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteClient();
            }
        });
        formPanel.add(deleteButton);

        clearButton = new JButton("Limpiar");

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });
        formPanel.add(clearButton);
    }

    private void showClient() {

        // Configurar modelo de datos
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nif");
        model.addColumn("Nombre");
        model.addColumn("Apellido 1");
        model.addColumn("Apellido 2");
        model.addColumn("Dirección");
        model.addColumn("Ciudad");
        model.addColumn("Codigo postal");
        model.addColumn("Teléfono");

        List<Cliente> Clientes = service.getList();

        for (Cliente cliente : Clientes) {
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

        listadoTable.setModel(model);
        formPanel.setVisible(true);
    }

    private void showCarForm(int rowIndex) {
        DefaultTableModel model = (DefaultTableModel) listadoTable.getModel();
        String nif = (String) model.getValueAt(rowIndex, 0);

        Cliente cliente = service.getById(nif);

        _nif.setText(cliente.getNif());
        _nombre.setText(cliente.getNombre());
        _apellido1.setText(cliente.getApellido1());
        _apellido2.setText(cliente.getApellido2());
        _direccion.setText(cliente.getDireccion());
        _ciudad.setText(cliente.getCiudad());
        _codigoPostal.setText(cliente.getCodigoPostal());
        _telefono.setText(cliente.getTelefono());
    }

    private void addClient() {

        String nif = _nif.getText();
        String nombre = _nombre.getText();
        String apellido1 = _apellido1.getText();
        String apellido2 = _apellido2.getText();
        String direccion = _direccion.getText();
        String ciudad = _ciudad.getText();
        String codigoPostal = _codigoPostal.getText();
        String telefono = _telefono.getText();

        Cliente cliente = new Cliente();

        cliente.setNif(nif);
        cliente.setNombre(nombre);
        cliente.setApellido1(apellido1);
        cliente.setApellido2(apellido2);
        cliente.setDireccion(direccion);
        cliente.setCiudad(ciudad);
        cliente.setCodigoPostal(codigoPostal);
        cliente.setTelefono(telefono);

        DefaultTableModel model = (DefaultTableModel) listadoTable.getModel();

        service.save(cliente);

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

        clearForm();
    }

    private void updateClient() {

        String nif = _nif.getText();
        String nombre = _nombre.getText();
        String apellido1 = _apellido1.getText();
        String apellido2 = _apellido2.getText();
        String direccion = _direccion.getText();
        String ciudad = _ciudad.getText();
        String codigoPostal = _codigoPostal.getText();
        String telefono = _telefono.getText();

        Cliente cliente = new Cliente();

        cliente.setNif(nif);
        cliente.setNombre(nombre);
        cliente.setApellido1(apellido1);
        cliente.setApellido2(apellido2);
        cliente.setDireccion(direccion);
        cliente.setCiudad(ciudad);
        cliente.setCodigoPostal(codigoPostal);
        cliente.setTelefono(telefono);

        service.update(cliente);
        showClient();
    }

    private void deleteClient() {
        String nif = _nif.getText();
        Cliente cliente = new Cliente();
        cliente.setNif(nif);
        service.delete(cliente);
        showClient();
    }

    private void clearForm() {
        _nif.setText("");
        _nombre.setText("");
        _apellido1.setText("");
        _apellido2.setText("");
        _direccion.setText("");
        _ciudad.setText("");
        _codigoPostal.setText("");
        _telefono.setText("");
    }
}