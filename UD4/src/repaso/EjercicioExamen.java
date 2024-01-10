package repaso;

import java.util.Scanner;

public class EjercicioExamen {

    public static void main(String[] args) throws Exception{

        Examen examen1 = new Examen("Tema 1", 8.7);

//        examen1.setCalificacion(-2);

        System.out.println(examen1);
        examen1.redondear();
        System.out.println(examen1);

        System.out.println(examen1.estaAprobado());

        Examen.setAsignatura("Mates");

        Examen examen2 = new Examen("Tema 2", 1);
        System.out.println(examen2);

        System.out.println(examen2.estaAprobado());

        Examen examen3 = null;
        try {
            examen3 = new Examen("Tema 3", 5);
        }catch (Exception e){
            examen3 = new Examen("default", 1);

        }

        System.out.println(examen3);

        Examen examen4 = new Examen(examen1);

        Examen examen5 = new Examen("Tema 5",examen1);

        System.out.println(examen4);

        System.out.println(examen5);


    }
}
