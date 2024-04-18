package model.dao;

import model.entities.Coche;

import java.util.List;

public interface CocheDao {
    List<Coche> findAll();
    List<Coche> findByCriteria(String marca, String modelo);
    Coche findById(String matricula);
    Coche save(Coche coche);
    void update(Coche coche);
    void delete(Coche coche);
}
