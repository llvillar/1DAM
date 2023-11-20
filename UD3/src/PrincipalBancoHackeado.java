public class PrincipalBancoHackeado {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria(
                "Chuck Norris",
                "21031221",
                1000.0);
        System.out.println(c1);
        c1.saldo = 1000000; // ¡HACKER!
        System.out.println("\nRetirar 2000 euros");
        System.out.println("Retirado: " +
                c1.retirarDinero(2000));
        System.out.println(c1);
    }
}