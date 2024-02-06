package ejercicios.obra;

import java.util.List;

public class PrincipalAudioVisual {
    public static void main(String[] args) throws ObraDuplicadaException {

        Pelicula p1 = new Pelicula("Camino de la venganza", 3600+1800+300, 2023);

        p1.setDirector(new Persona("Brett", "Donowho"));

        p1.getActoresPrincipales().add(new Persona("Nicolas", "Cage"));
        p1.getActoresPrincipales().add(new Persona("Kerry", "Knuppe"));
        p1.getActoresPrincipales().add(new Persona("Clint", "Howard"));

        p1.getGeneros().add(new GeneroPelicula("Terror"));
        p1.getGeneros().add(new GeneroPelicula("Drama"));


        System.out.println(p1);

        Pelicula p2 = new Pelicula("Indiana Jones and the Dial of Destiny", 154*60, 2023);

        p2.setDirector(new Persona("James", "Mangold"));

        p2.getActoresPrincipales().add(new Persona("Harrison", "Ford"));
        p2.getActoresPrincipales().add(new Persona("Antonio", "Banderas"));
        p2.getActoresPrincipales().add(new Persona("Karen", "Allen"));
        p2.getActoresPrincipales().add(new Persona("Phoebe", "Waller-Bridge"));

        p2.getGeneros().add(new GeneroPelicula("Aventura"));
        p2.getGeneros().add(new GeneroPelicula("Accion"));

        System.out.println(p2);

        ColeccionAudioVisual coleccion = new ColeccionAudioVisual("Coleccion de Luis");

        System.out.println(coleccion);

        coleccion.addObra(p1);

        List<ObraAudiovisual> obras = coleccion.getObras();

        coleccion.addObra(p2);

        System.out.println("obras++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(obras);
        System.out.println("obras ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        System.out.println("Valoraciones *******************************************************");

        p1.asignarPuntuacion(1);
        p2.asignarPuntuacion(2);

        System.out.println(p1.obtenerValoracion());
        System.out.println(p2.obtenerValoracion());
        System.out.println(coleccion.obtenerValoracion());

       // p2.asignarPuntuacion(22);

        System.out.println("Mejor valorada *******************************************************");

        System.out.println(coleccion.mejorValorada());
        System.out.println("Peor Valorada *******************************************************");
        System.out.println(coleccion.peorValorada());

        ColeccionMusical coleccionMusical = new ColeccionMusical("Musica de los 80");

        coleccionMusical.addObra(new Disco("asdasdasd",12,12,12));
        coleccionMusical.addObra(new Pelicula("asdasd",12,12));

    }
}
