package model.dao;

import datasource.DataSource;
import datasource.DataSourceException;
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
            String sql = "select * from coche order by matricula";
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

        Coche coche = null;

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select * from coche where matricula = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, matricula);

            rs = ps.executeQuery();


            if(rs.next()){
                coche = new Coche();
                coche.setMatricula(rs.getString("matricula"));
                coche.setMarca(rs.getString("marca"));
                coche.setModelo(rs.getString("modelo"));
                coche.setAnio(rs.getDate("anio"));
                coche.setPrecio(rs.getDouble("precio"));
                coche.setVendido(rs.getBoolean("vendido"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
            DataSource.closeResultSet(rs);
        }
        return coche;
    }

    @Override
    public Coche save(Coche coche) {

        PreparedStatement ps = null;

        try {
            String sql = "insert into coche (matricula, marca, modelo, anio, precio, vendido) values (?, ?, ?, ?, ?, ?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, coche.getMatricula());
            ps.setString(2, coche.getMarca());
            ps.setString(3, coche.getModelo());
            ps.setInt(4, coche.getAnio().getYear()+1900);
            ps.setDouble(5, coche.getPrecio());
            ps.setBoolean(6, coche.isVendido());

            int fila = ps.executeUpdate();

            /***
             /// codigo para recuperrar secuencia de base de datos
            if(fila > 0){
                ResultSet keys = ps.getGeneratedKeys();
                if(keys.next()){
                    int id = keys.getInt(1);
                    coche.setId(id);
                }else{
                    throw new DataSourceException("No se ha insertado registro");
                }
            }
             **/

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
        }
        return coche;
    }

    @Override
    public void update(Coche coche) {

        PreparedStatement ps = null;

        try {
            String sql = "update coche set marca = ? , modelo = ?, anio = ?, precio = ?, vendido = ? where matricula = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, coche.getMarca());
            ps.setString(2, coche.getModelo());
            ps.setInt(3, coche.getAnio().getYear()+1900);
            ps.setDouble(4, coche.getPrecio());
            ps.setBoolean(5, coche.isVendido());
            ps.setString(6, coche.getMatricula());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
        }
    }

    @Override
    public void delete(Coche coche) {
        PreparedStatement ps = null;

        try {
            String sql = "delete from coche where matricula = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, coche.getMatricula());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
        }
    }
}
