package tienda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cesta {

    private Date fecha;
    private boolean pagado;
    private float importe;
    private List<Producto> productos;

    public Cesta() {
        this.productos = new ArrayList<>();
        this.pagado = false;

    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Cesta{" +
                "fecha=" + fecha +
                ", pagado=" + pagado +
                ", importe=" + importe +
                ", productos=" + productos +
                '}';
    }

    public void anadirProducto(Producto producto){
        if (!productos.contains(producto)){
            productos.add(producto);

            calcularImporte();
        }
    }

    public void eliminarProducto(Producto producto){
        if (productos.contains(producto)){
            productos.remove(productos.indexOf(producto));

            calcularImporte();
        }
    }

    private void calcularImporte(){
        float _importe = 0;
        for (Producto p: productos) {
            _importe = _importe + p.getPrecio();
        }
        this.importe = _importe;
    }
}
