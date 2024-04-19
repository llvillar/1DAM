package model.services;

import model.dao.CocheDao;
import model.dao.DAOFactory;
import model.entities.Coche;

import java.util.List;

public class CocheServiceImpl implements CocheService{

    private CocheDao dao;
    public CocheServiceImpl() {
        dao = DAOFactory.createCocheDao();
    }

    @Override
    public List<Coche> getList() {
        return dao.findAll();
    }

    @Override
    public List<Coche> getByCriteria(String marca, String modelo) {
        return dao.findByCriteria(marca, modelo);
    }

    @Override
    public Coche getById(String matricula) {
        return dao.findById(matricula);
    }

    @Override
    public Coche save(Coche coche) {
        return dao.save(coche);
    }

    @Override
    public void update(Coche coche) {
        dao.update(coche);
    }

    @Override
    public void delete(Coche coche) {
        dao.delete(coche);
    }
}
