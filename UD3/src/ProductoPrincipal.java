public class ProductoPrincipal {

    public static void main(String[] args) throws Exception{

        Producto producto1 = new Producto("Ratón", 6.46);
        Producto producto2 = new Producto("Teclado", 10.99);

        System.out.println(producto1);
        System.out.println(producto2);

        System.out.println(producto1.calcularPrecioNeto());
        System.out.println(producto2.calcularPrecioNeto());

        //double iva = Producto.iva;
        //Producto.iva = 0.50;

        Producto.setIva(0.50);

        System.out.println(producto1.calcularPrecioNeto());
        System.out.println(producto2.calcularPrecioNeto());


    }
}
