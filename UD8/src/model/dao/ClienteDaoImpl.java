package model.dao;

import datasource.DataSource;
import model.entities.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoImpl extends BaseDao implements ClienteDao {

    private Connection connection;

    public ClienteDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Cliente> findAll() {

        List<Cliente> clientes = new ArrayList<Cliente>();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select * from cliente order by nif";
            ps = connection.prepareStatement(sql);

            rs = ps.executeQuery();

            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setNif(rs.getString("nif"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido1(rs.getString("apellido1"));
                cliente.setApellido2(rs.getString("apellido2"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("c_postal"));
                cliente.setTelefono(rs.getString("telefono"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
            DataSource.closeResultSet(rs);
        }
        return clientes;
    }

    @Override
    public List<Cliente> findByCriteria(String nombre, String ciudad) {
        List<Cliente> clientes = new ArrayList<Cliente>();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select * from cliente where nombre = ? and ciudad = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, ciudad);

            rs = ps.executeQuery();


            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setNif(rs.getString("nif"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido1(rs.getString("apellido1"));
                cliente.setApellido2(rs.getString("apellido2"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("c_postal"));
                cliente.setTelefono(rs.getString("telefono"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
            DataSource.closeResultSet(rs);
        }
        return clientes;
    }

    @Override
    public Cliente findById(String nif) {

        Cliente cliente = null;

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select * from cliente where nif = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, nif);

            rs = ps.executeQuery();


            if(rs.next()){
                cliente = new Cliente();
                cliente.setNif(rs.getString("nif"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido1(rs.getString("apellido1"));
                cliente.setApellido2(rs.getString("apellido2"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("c_postal"));
                cliente.setTelefono(rs.getString("telefono"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
            DataSource.closeResultSet(rs);
        }
        return cliente;
    }

    @Override
    public Cliente save(Cliente cliente) {

        PreparedStatement ps = null;

        try {
            String sql = "insert into Cliente (nif, nombre, apellido1, apellido2, direccion, ciudad, c_postal, telefono) " +
                    " values (?, ?, ?, ?, ?, ?, ?, ?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, cliente.getNif());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido1());
            ps.setString(4, cliente.getApellido2());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getCiudad());
            ps.setString(7, cliente.getCodigoPostal());
            ps.setString(8, cliente.getTelefono());


            int fila = ps.executeUpdate();

            /*
             /// codigo para recuperrar secuencia de base de datos
            if(fila > 0){
                ResultSet keys = ps.getGeneratedKeys();
                if(keys.next()){
                    int id = keys.getInt(1);
                    cliente.setId(id);
                }else{
                    throw new DataSourceException("No se ha insertado registro");
                }
            }*/


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
        }
        return cliente;
    }

    @Override
    public void update(Cliente cliente) {

        PreparedStatement ps = null;

        try {
            String sql = "update cliente set nombre = ?, apellido1 = ?, apellido2 = ?, direccion = ?," +
                    " ciudad = ?, c_postal = ?, telefono = ? where nif = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido1());
            ps.setString(3, cliente.getApellido2());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getCiudad());
            ps.setString(6, cliente.getCodigoPostal());
            ps.setString(7, cliente.getTelefono());
            ps.setString(8, cliente.getNif());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
        }
    }

    @Override
    public void delete(Cliente cliente) {
        PreparedStatement ps = null;

        try {
            String sql = "delete from cliente where nif = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, cliente.getNif());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
        }
    }
}
