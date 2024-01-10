package herencia.personas;

public class HerenciaMain {
    public static void main(String[] args) {

        Persona p = new Persona("Luis", "López");

        p.entrar();
        p.salir();

        Estudiante e1 = new Estudiante("Mario", "Gomez", 12345, "1º DAM");

        e1.entrar();
        e1.estudiar();

        DocenteFP dfp = new DocenteFP("Jose", "Molina");

        Docente d = dfp;
        Persona p1 = dfp;

       // Estudiante e2 = dfp;

        Persona p2 = new DocenteFP("Maria", "Perez");

        Docente d1 = (Docente) p2;

        Docente d2 = dfp;


        Persona p3 = new DocenteFP("Antonio", "Ramirez");

        p3.salir();

        System.out.println(e1 instanceof Persona);
        System.out.println(e1 instanceof Estudiante);
        System.out.println(p3 instanceof DocenteFP);
        System.out.println(p3 instanceof Estudiante);

        if(p3 instanceof Estudiante) {
            Estudiante e3 = (Estudiante) p3;
            e3.estudiar();
        }


        PersonalAdministracionServicios ps = new PersonalAdministracionServicios("Jose", "Fernandez", "Administrativo");
        ps.salir();

        DocenteESOBach deso = new DocenteESOBach("Fernando", "Cortés");
        deso.entrar();

        EstudianteESOBach eeso = new EstudianteESOBach("Teresa", "Villar", 1232134, "4º ESO");
        eeso.salir();

        Persona per = new Persona("Fran", "Garcia");
        per.entrar();

        Estudiante doc1 = eeso;

        doc1.entrar();


        Persona per2 = new DocenteFP("Carlos", "Garcia");

        per2.entrar();

        DocenteFP docFP1 = (DocenteFP) per2;
        docFP1.salir();

        System.out.println(per2 instanceof Persona);
        System.out.println(per2 instanceof Estudiante);
        System.out.println(per2 instanceof Docente);
        System.out.println(per2 instanceof DocenteFP);
        System.out.println(per2 instanceof DocenteESOBach);

        if(per2 instanceof Estudiante) {
            Estudiante es12 = (Estudiante) per2;
        }
    }
}
