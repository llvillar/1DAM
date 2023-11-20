public class PrincipalBancoHackeado3 {
    public static void main(String[] args) throws Exception{
        CuentaBancaria3 c1 = new CuentaBancaria3(
                "Chuck Norris",
                "21031221",
                1000.0);

        c1.setActiva(true);

        System.out.println(c1);


        c1.setTitular("Pepe");
        System.out.println(c1);

        if(c1.isActiva()) {
            System.out.println("\nRetirar dinero");
            c1.retirarDinero(1001);
        }
        System.out.println(c1);
    }
}