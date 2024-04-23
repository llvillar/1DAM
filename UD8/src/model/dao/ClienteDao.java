package model.dao;

import model.entities.Cliente;

import java.util.List;

public interface ClienteDao {
    List<Cliente> findAll();
    List<Cliente> findByCriteria(String nombre, String ciudad);
    Cliente findById(String nif);
    Cliente save(Cliente Cliente);
    void update(Cliente Cliente);
    void delete(Cliente Cliente);
}
