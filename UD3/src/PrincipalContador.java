import dam1.Contador;

public class PrincipalContador {
    public static void main(String[] args) {

        Contador c1 = new Contador();
        Contador c2 = new Contador(15);

        //c1.cantidad = 56;

        System.out.println("c1 inicial: " + c1.getCantidad());
        c1.incrementar();
        System.out.println("c1 final: " + c1.getCantidad());
        System.out.println("c2 inicial: " + c2.getCantidad());
        c2.incrementar();
        System.out.println("c2 final: " + c2.getCantidad());

    }
}
