package model.dao;

import datasource.DataSource;
import model.entities.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDaoImpl extends BaseDao implements ProductoDao {

    private Connection connection;

    public ProductoDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Producto> findAll() {

        List<Producto> productos = new ArrayList<Producto>();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select * from producto order by codigo desc";
            ps = connection.prepareStatement(sql);

            rs = ps.executeQuery();


            while(rs.next()){
                Producto producto = new Producto();
                producto.setCodigo(rs.getInt("codigo"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                productos.add(producto);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
            DataSource.closeResultSet(rs);
        }
        return productos;
    }

    @Override
    public List<Producto> findByCriteria(String descripcion) {
        List<Producto> productos = new ArrayList<Producto>();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select * from producto where descripcion = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, descripcion);

            rs = ps.executeQuery();


            while(rs.next()){
                Producto producto = new Producto();
                producto.setCodigo(rs.getInt("codigo"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                productos.add(producto);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
            DataSource.closeResultSet(rs);
        }
        return productos;    }

    @Override
    public Producto findById(String codigo) {

        Producto producto = null;

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select * from producto where codigo = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, codigo);

            rs = ps.executeQuery();


            if(rs.next()){
                producto = new Producto();
                producto.setCodigo(rs.getInt("codigo"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
            DataSource.closeResultSet(rs);
        }
        return producto;
    }

    @Override
    public Producto save(Producto producto) {

        PreparedStatement ps = null;

        try {
            String sql = "insert into Producto (codigo, descripcion, precio, stock) values (?, ?, ?, ?)";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, producto.getCodigo());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());

            int fila = ps.executeUpdate();

            /*
             /// codigo para recuperrar secuencia de base de datos
            if(fila > 0){
                ResultSet keys = ps.getGeneratedKeys();
                if(keys.next()){
                    int id = keys.getInt(1);
                    Producto.setId(id);
                }else{
                    throw new DataSourceException("No se ha insertado registro");
                }
            }*/


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
        }
        return producto;
    }

    @Override
    public void update(Producto producto) {

        PreparedStatement ps = null;

        try {
            String sql = "update Producto set descripcion = ?, precio = ?, stock = ? where codigo = ?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, producto.getCodigo());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
        }
    }

    @Override
    public void delete(Producto producto) {
        PreparedStatement ps = null;

        try {
            String sql = "delete from Producto where codigo = ?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, producto.getCodigo());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DataSource.closeStatement(ps);
        }
    }
}
