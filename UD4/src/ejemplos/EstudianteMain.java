package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class EstudianteMain {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("12345678Z", "Luis", "Lopez", 23);

        ModuloProfesional modulo1 = new ModuloProfesional(1, "Programación");
        ModuloProfesional modulo2 = new ModuloProfesional(2, "Base de datos");
        ModuloProfesional modulo3 = new ModuloProfesional(3, "Sistemas informáticos");
        ModuloProfesional modulo4 = new ModuloProfesional(4, "Entornos de desarrollo");

        ModuloProfesional modulo5 = new ModuloProfesional(1, "Programación");
        ModuloProfesional modulo6 = new ModuloProfesional(2, "Base de datos");

        estudiante1.agregarModulo(modulo1);
        estudiante1.agregarModulo(modulo2);
        estudiante1.agregarModulo(modulo3);
        estudiante1.agregarModulo(modulo4);

        mostrarModulosEstudiante(estudiante1);

        estudiante1.agregarModulo(modulo5);
        estudiante1.eliminarModulo(modulo6);

        mostrarModulosEstudiante(estudiante1);

        //La variable modulos es un copyOf de la propiedad estudiante.modulos es inmutable
        List<ModuloProfesional> modulos = estudiante1.getModulos();

        for (ModuloProfesional m: modulos){
            System.out.println("Módulo: " + m.getCodigo() + " - " + m.getDescripcion());
        }

        //esta linea da error porque modulos es inmutable
        //modulos.add(modulo4);

        //Listado clonado m este si puedo cambiarlo, ya que estudienate.modulos es inmutable
        List<ModuloProfesional> m =  new ArrayList<>();
        m.addAll(modulos);
        m.add(modulo4);

        String nombre = estudiante1.getNombre();
        System.out.println("Nombre: " + nombre);
        nombre = "Maria";
        String nombre1 = estudiante1.getNombre();
        System.out.println("Nombre: " + nombre1);
    }

    private static void mostrarModulosEstudiante(Estudiante estudiante1) {
        List<ModuloProfesional> modulos2 = estudiante1.getModulos();

        for (int i = 0; i < modulos2.size(); i++) {
            System.out.println("Módulo: " + modulos2.get(i).getCodigo() + " - " + modulos2.get(i).getDescripcion());
        }
    }
}
