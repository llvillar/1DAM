package tienda;

public class TiendaMain {

    static Tienda tienda;
    public static void main(String[] args) throws Exception {
        inicializarTienda();

        //añadir cliente
        Cliente  cliente1 = new Cliente("666666666","Pepe");
        tienda.anadirCliente(cliente1);

        Producto producto1 = new Producto();
        producto1.setCodigo(100);
        producto1.setNombre("Alfombrilla");
        producto1.setPrecio(5);

        tienda.anadirProducto(producto1);

        System.out.println(tienda);
    }

    private static void inicializarTienda() throws Exception {
        tienda = new Tienda("Amazon");

        anadirProductosTienda();
        anadirClietesTienda();



    }

    private static void anadirClietesTienda() {
        for (int i = 0; i < 5; i++) {
            Cliente c = new Cliente("12345678Z" + i, "Nombre " + i);
            tienda.anadirCliente(c);
        }
    }

    private static void anadirProductosTienda() throws Exception {
        for (int i = 0; i < 5; i++) {
            Producto p = new Producto();
            p.setCodigo(i);
            p.setNombre("Producto " + i);
            p.setPrecio(30 + i);

            tienda.anadirProducto(p);
        }
    }
}
