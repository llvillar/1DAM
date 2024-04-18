package model.dao;

import datasource.DataSource;
import model.entities.Coche;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CocheDaoImpl implements CocheDao {

    private Connection connection;

    public CocheDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Coche> findAll() {

        List<Coche> coches = new ArrayList<Coche>();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select * from coche";
            ps = connection.prepareStatement(sql);

            rs = ps.executeQuery();


            while(rs.next()){
                Coche coche = new Coche();
                coche.setMatricula(rs.getString("matricula"));
                coche.setMarca(rs.getString("marca"));
                coche.setModelo(rs.getString("modelo"));
                coche.setAnio(rs.getDate("anio"));
                coche.setPrecio(rs.getDouble("precio"));
                coche.setVendido(rs.getBoolean("vendido"));
                coches.add(coche);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
            DataSource.closeResultSet(rs);
        }
        return coches;
    }

    @Override
    public List<Coche> findByCriteria(String marca, String modelo) {
        List<Coche> coches = new ArrayList<Coche>();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select * from coche where marca = ? and modelo = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, marca);
            ps.setString(2, modelo);

            rs = ps.executeQuery();


            while(rs.next()){
                Coche coche = new Coche();
                coche.setMatricula(rs.getString("matricula"));
                coche.setMarca(rs.getString("marca"));
                coche.setModelo(rs.getString("modelo"));
                coche.setAnio(rs.getDate("anio"));
                coche.setPrecio(rs.getDouble("precio"));
                coche.setVendido(rs.getBoolean("vendido"));
                coches.add(coche);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
            DataSource.closeResultSet(rs);
        }
        return coches;    }

    @Override
    public Coche findById(String matricula) {
        return null;
    }

    @Override
    public Coche save(Coche coche) {
        return null;
    }

    @Override
    public void update(Coche coche) {

    }

    @Override
    public void delete(Coche coche) {

    }
}
