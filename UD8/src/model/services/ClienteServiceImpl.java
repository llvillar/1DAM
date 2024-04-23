package model.services;

import model.dao.ClienteDao;
import model.dao.DAOFactory;
import model.entities.Cliente;

import java.util.List;

public class ClienteServiceImpl implements ClienteService{

    private ClienteDao dao;


    public ClienteServiceImpl() {
        this.dao = DAOFactory.createClienteDao();
    }

    @Override
    public List<Cliente> getList() {
        return dao.findAll();
    }

    @Override
    public List<Cliente> getByCriteria(String nombre, String ciudad) {
        return dao.findByCriteria(nombre, ciudad);
    }

    @Override
    public Cliente getById(String nif) {
        return dao.findById(nif);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return dao.save(cliente);
    }

    @Override
    public void update(Cliente cliente) {
        dao.update(cliente);
    }

    @Override
    public void delete(Cliente cliente) {
        dao.delete(cliente);
    }
}
