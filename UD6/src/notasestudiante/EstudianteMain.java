package notasestudiante;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("estudiantes.dat"))) {
            List<Estudiante> grupo = new ArrayList<>();
            grupo.add(new Estudiante("Chuck Norris", 10));
            grupo.add(new Estudiante("Mortadelo", 5));
            oos.writeObject(grupo);
        }


        try (ObjectInputStream ios = new ObjectInputStream(new FileInputStream("estudiantes.dat"))) {
            List<Estudiante> grupo = (List<Estudiante>) ios.readObject();
            System.out.println(grupo);
        }
    }
}
