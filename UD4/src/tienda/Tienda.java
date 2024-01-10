package tienda;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private String nombre;

    private List<Producto> catalogo;

    private List<Cliente> clientes;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.catalogo = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void anadirCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente){
        if(clientes.contains(cliente)){
            clientes.remove(cliente);
        }
    }

    public void anadirProducto(Producto producto){
        if(!catalogo.contains(producto)) {
            catalogo.add(producto);
        }
    }

    public void eliminarProducto(Producto producto){
        if(catalogo.contains(producto)){
            catalogo.remove(producto);
        }
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", catalogo=" + catalogo +
                ", clientes=" + clientes +
                '}';
    }
}
