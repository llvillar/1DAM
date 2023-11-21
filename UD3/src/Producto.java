public class Producto {
    private String descripcion;
    private double precio;

    private static double iva = 0.21;

    public Producto(String descripcion, double precio) throws Exception{
        if(precio < 0 ){
            throw  new Exception("El precio no puede ser negativo");
        }
        if( descripcion == null || descripcion.length() == 0){
            throw  new Exception("La descripcion debe de estar rellena");
        }
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Descripción: " + this.descripcion + ", precio: " + this.precio;
    }

    public double calcularPrecioNeto(){
        return this.precio * (1 + iva);
    }

    public static double getIva() {
        return iva;
    }

    public static void setIva(double iva) {
        Producto.iva = iva;
    }
}
