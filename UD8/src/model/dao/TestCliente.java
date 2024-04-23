package model.dao;

import model.dao.ClienteDao;
import model.dao.DAOFactory;
import model.entities.Cliente;

import java.util.Date;
import java.util.List;

public class TestCliente {
    public static void main(String[] args) {

        ClienteDao dao = DAOFactory.createClienteDao();

        List<Cliente> all = dao.findAll();
        for (Cliente c: all) {
            System.out.println(c);
        }

        System.out.println("*******************************Criteria******************************");
        List<Cliente> byCriteria = dao.findByCriteria("Irene", "Linares");
        for (Cliente c: byCriteria) {
            System.out.println(c);
        }

        System.out.println("*******************************findById******************************");
        System.out.println(dao.findById("27200200D"));


        System.out.println("*******************************Insert******************************");
        Cliente cliente = new Cliente();
        cliente.setNif("12345678Z");
        cliente.setNombre("Pepe");
        cliente.setApellido1("Perez");
        cliente.setApellido2("Garcia");
        cliente.setDireccion("Su casa");
        cliente.setCiudad("Linares");
        cliente.setCodigoPostal("23700");
        cliente.setTelefono("5554564");
        dao.save(cliente);
        System.out.println(cliente);

        System.out.println("*******************************Update******************************");
        Cliente cliente2 = new Cliente();
        cliente2.setNif("12345678Z");
        cliente2.setNombre("Pepe");
        cliente2.setApellido1("Perez");
        cliente2.setApellido2("Garcia");
        cliente2.setDireccion("Su casa");
        cliente2.setCiudad("Bailen");
        cliente2.setCodigoPostal("23700");
        cliente2.setTelefono("88888888");
        dao.update(cliente2);
        System.out.println(cliente2);

        System.out.println("*******************************Delete******************************");
        dao.delete(cliente2);

    }
}
