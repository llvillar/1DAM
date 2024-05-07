package model.dao;

import model.entities.Producto;

import java.util.List;

public interface ProductoDao {
    List<Producto> findAll();
    List<Producto> findByCriteria(String descripcion);
    Producto findById(String matricula);
    Producto save(Producto Producto);
    void update(Producto Producto);
    void delete(Producto Producto);
}
