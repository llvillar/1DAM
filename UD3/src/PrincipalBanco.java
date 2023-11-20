public class PrincipalBanco {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria(
                "Chuck Norris",
                "21031221",
                1000.0);
        System.out.println(c1);
        System.out.println("\nIngresar 500 euros");
        System.out.println("Ingresado: " +
                c1.ingresarDinero(500));
        System.out.println(c1);
        System.out.println("\nRetirar 2000 euros");
        System.out.println("Retirado: " +
                c1.retirarDinero(2000));
        System.out.println(c1);
    }
}