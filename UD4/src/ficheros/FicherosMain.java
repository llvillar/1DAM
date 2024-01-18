package ficheros;

import java.util.ArrayList;
import java.util.List;

public class FicherosMain {
    public static void main(String[] args) {

        Imagen a1 = new Imagen(300, 200);
        Almacenable a2 = new DocumentoTexto("El el fondo del mar ....");

        a1.guardar("foto.png");
        a1.recuperar("foto.png");

        a2.guardar("poema.txt");
        a2.recuperar("poema.txt");

        a1.rotarSentidoAgujas();
        a1.rotarSentidoContrarioAgujas();

        List<Rotable> lista = new ArrayList<>();
        lista.add(a1);
        //lista.add(a2);
        listar(lista);

        System.out.println(a1.describir());


    }

    private static void listar(List<Rotable> lista){
        for (Rotable l: lista) {
            l.rotarSentidoAgujas();
            l.rotar360grados();
           System.out.println( Rotable.radianesAGrados(1) );
        }
        /**
        for (int i = 0; i < lista.size(); i++) {

            if(lista.get(i) instanceof Rotable){
                Rotable l = (Rotable) lista.get(i);
                l.rotarSentidoAgujas();
            }

            //l.guardar("estamos guardando.....");
        }
         **/
    }
}
