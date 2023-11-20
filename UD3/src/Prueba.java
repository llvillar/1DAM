import figuras.Punto;
import figuras.Rectangulo;

public class Prueba {

    public static void main(String[] args) throws Exception {



        Persona p = new Persona();
        p.nombre = "Luis";
        p.apellidos = "López Villar";
        p.dni = "12345678Z";

        p.imprimirDatos();


        Contacto c1 = new Contacto();

        c1.nombre = "Luis Lopez";
        c1.telefono = "555 678 123";

        Contacto c2 = new Contacto();

        c2.nombre = "Luis Lopez";
        c2.telefono = "555 678 123";

        System.out.println(c1);


//        System.out.println(c1.equals(c2));
//        System.out.println(c1 == c2);
        //1b2c6ec2
        //1b2c6ec2
        //1b2c6ec2

        Punto p1 = new Punto();
        p1.x = 1;
        p1.y = 2;

        System.out.println(p1);

        p1.moverA(3,4);

        System.out.println(p1);

        Rectangulo r1 = new Rectangulo();
        r1.base = 10;
        r1.altura = 5;

        System.out.println(r1);

        System.out.println("El rectángulo tiene: base= " + r1.base + " y altura= " + r1.altura);

        System.out.println("El área es: " + r1.calcularArea());
        System.out.println("El perímetro es: " + r1.calcularPerimetro());

        Rectangulo r2 = new Rectangulo();

        r2 = r1;

        System.out.println("base r2: " + r2.base);
        System.out.println(r2);

        r2.base = 14;

        System.out.println("base r1: " + r1.base);
        System.out.println("base r2: " + r2.base);

        Rectangulo r3 = new Rectangulo(5,-8);

        System.out.println("El área es: " + r3.calcularArea());
        System.out.println("El perímetro es: " + r3.calcularPerimetro());

        Rectangulo r4 = new Rectangulo(8);

        System.out.println("El área es: " + r4.calcularArea());
        System.out.println("El perímetro es: " + r4.calcularPerimetro());
    }
}
