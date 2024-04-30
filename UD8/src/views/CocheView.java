package views;

import model.entities.Coche;
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

public class CocheView extends JPanel{

    CocheService service;
    JTable listadoTable;
    private JPanel formPanel;
    JTextField _matricula;
    JTextField _marca;
    JTextField _modelo;
    JTextField _anio;
    JTextField _precio;
    JCheckBox _vendido;
    JButton addButton;
    JButton updateButton;
    JButton deleteButton;
    JButton clearButton;

    public CocheView () {

        service = new CocheServiceImpl();

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

        showCars();
        this.setVisible(true);
    }

    private void crearFormulario() {
        // Crear formulario
        formPanel = new JPanel(new GridLayout(5, 2));

        formPanel.setBorder(BorderFactory.createTitledBorder("Detalles del Coche"));
        formPanel.add(new JLabel("Matricula:"));
        _matricula = new JTextField();
        formPanel.add(_matricula);

        formPanel.add(new JLabel("Marca:"));
        _marca = new JTextField();
        formPanel.add(_marca);

        formPanel.add(new JLabel("Modelo:"));
        _modelo = new JTextField();
        formPanel.add(_modelo);

        formPanel.add(new JLabel("Año:"));
        _anio = new JTextField();
        formPanel.add(_anio);

        formPanel.add(new JLabel("Precio:"));
        _precio = new JTextField();
        formPanel.add(_precio);

        formPanel.add(new JLabel("Vendido:"));
        _vendido = new JCheckBox();
        formPanel.add(_vendido);


        addButton = new JButton("Nuevo");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCar();
            }
        });
        formPanel.add(addButton);

        updateButton = new JButton("Actualizar");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateCar();
            }
        });
        formPanel.add(updateButton);

        deleteButton = new JButton("Eliminar");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteCar();
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

    private void showCars() {

        // Configurar modelo de datos
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Matricula");
        model.addColumn("Marca");
        model.addColumn("Modelo");
        model.addColumn("Año");
        model.addColumn("Precio");
        model.addColumn("Vendido");

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

        listadoTable.setModel(model);
        formPanel.setVisible(true);
    }

    private void showCarForm(int rowIndex) {
        DefaultTableModel model = (DefaultTableModel) listadoTable.getModel();
        String matricula = (String) model.getValueAt(rowIndex, 0);

        Coche coche = service.getById(matricula);

        _matricula.setText(coche.getMatricula());
        _marca.setText(coche.getMarca());
        _modelo.setText(coche.getModelo());
        _precio.setText(String.valueOf(coche.getPrecio()));
        _anio.setText(String.valueOf(coche.getAnio()));
        _vendido.setSelected(coche.isVendido());
    }

    private void addCar() {
        String matricula = _matricula.getText();
        String marca = _marca.getText();
        String modelo = _modelo.getText();
        String precio = _precio.getText();
        String anio = _anio.getText();
        boolean vendido = _vendido.isSelected();

        Coche coche = new Coche();

        coche.setMatricula(matricula);
        coche.setMarca(marca);
        coche.setModelo(modelo);
        coche.setPrecio(Double.valueOf(precio));
        coche.setAnio(new Date());
        coche.setVendido(vendido);

        DefaultTableModel model = (DefaultTableModel) listadoTable.getModel();

        service.save(coche);

        model.addRow(new Object[]{
                coche.getMatricula(),
                coche.getMarca(),
                coche.getModelo(),
                coche.getAnio(),
                coche.getPrecio(),
                coche.isVendido()
        });

        clearForm();
    }

    private void updateCar() {

        String matricula = _matricula.getText();
        String marca = _marca.getText();
        String modelo = _modelo.getText();
        String precio = _precio.getText();
        String anio = _anio.getText();
        boolean vendido = _vendido.isSelected();

        Coche coche = new Coche();

        coche.setMatricula(matricula);
        coche.setMarca(marca);
        coche.setModelo(modelo);
        coche.setPrecio(Double.valueOf(precio));
        coche.setAnio(new Date());
        coche.setVendido(vendido);

        service.update(coche);
        showCars();
    }

    private void deleteCar() {
        String matricula = _matricula.getText();
        Coche coche = new Coche();
        coche.setMatricula(matricula);
        service.delete(coche);
        showCars();
    }

    private void clearForm() {
        _matricula.setText("");
        _marca.setText("");
        _modelo.setText("");
        _precio.setText("");
        _anio.setText("");
        _vendido.setSelected(false);
    }
}