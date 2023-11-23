public class ElectrodomesticoPrincipal {

    public static void main(String[] args) {

        Electrodomestico e1 =new Electrodomestico();

        Electrodomestico e2 = new Electrodomestico(100, 20);

        Electrodomestico e3 =  new Electrodomestico(300, "Verde",'J',50);

        Electrodomestico e4 =  new Electrodomestico(500, "Negro",'A',35);


        System.out.println(e1.precioFinal());
        System.out.println(e2.precioFinal());
        System.out.println(e3.precioFinal());
        System.out.println(e4.precioFinal());


        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);


    }
}
