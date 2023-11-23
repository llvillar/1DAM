package enumeraciones;

public class ElectrodomesticoPrincipalEnum {

    public static void main(String[] args) {

        ElectrodomesticoEnum e1 =new ElectrodomesticoEnum();

        ElectrodomesticoEnum e2 = new ElectrodomesticoEnum(100, 20);

        ElectrodomesticoEnum e3 =  new ElectrodomesticoEnum(300, "verde",'J',50);

        ElectrodomesticoEnum e4 =  new ElectrodomesticoEnum(500, "negro",'A',35);


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
