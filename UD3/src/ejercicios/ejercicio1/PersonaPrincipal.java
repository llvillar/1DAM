package ejercicios.ejercicio1;

import java.util.Scanner;

public class PersonaPrincipal {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce nombre: ");
        String nombre = s.nextLine();

        System.out.println("Introduce edad: ");
        int edad = s.nextInt();

        System.out.println("Introduce sexo(H/M): ");
        char sexo = s.next().charAt(0);

        System.out.println("Introduce peso(kg): ");
        double peso = s.nextDouble();

        System.out.println("Introduce altura(m): ");
        double altura = s.nextDouble();

        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona p2 = new Persona("Luis García", 17, 'H');
        Persona p3 = new Persona();

        p3.setNombre("Antonia Molina");
        p3.setSexo('M');
        p3.setEdad(55);
        p3.setAltura(1.80);
        p3.setPeso(135.0);

        p1.generarDNI();
        p2.generarDNI();
        p3.generarDNI();

        System.out.println(p1.comprobarSexo('H'));
        System.out.println(p2.comprobarSexo('H'));
        System.out.println(p3.comprobarSexo('M'));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        comprobarIMC(p1);
        comprobarIMC(p2);
        comprobarIMC(p3);
    }

    private static void comprobarIMC(Persona persona){
        int imc = persona.calcularIMC();
        if(imc == 0){
            System.out.println(persona.getNombre() + " está en su peso ideal");
        } else if(imc == -1){
            System.out.println(persona.getNombre() + " está por debajo de su peso ideal");
        } else {
            System.out.println(persona.getNombre() + " tiene sobrepeso");
        }
    }
}
