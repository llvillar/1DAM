package model.services;

import model.entities.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> getList();
    List<Cliente> getByCriteria(String nombre, String ciudad);
    Cliente getById(String nif);
    Cliente save(Cliente cliente);
    void update(Cliente cliente);
    void delete(Cliente cliente);
}
