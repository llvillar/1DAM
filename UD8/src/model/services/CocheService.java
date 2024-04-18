package model.services;

import model.entities.Coche;

import java.util.List;

public interface CocheService {
    List<Coche> getList();
    List<Coche> getByCriteria(String marca, String modelo);
    Coche getById(String matricula);
    Coche save(Coche coche);
    void update(Coche coche);
    void delete(Coche coche);
}
