package arrays;

public class Ejemplo {
    public static void main(String[] args) {


        int[][] ejemplo = {
                            {1, 2, 3},
                            {10, 20, 30},
                            {50, 60, 70},
                            {-1, -2, 4},
                            {100, 200, 300}

        };

        System.out.println(ejemplo.length);

        for (int i = 0; i < ejemplo.length; i++){
            for (int j =0; j < ejemplo[i].length; j++){
                int i1 = ejemplo[i][j];
                System.out.print(ejemplo[i][j]);
            }
            System.out.println("");
        }



        int[] datos = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(ut6_03_01.existeIndice(datos, 5));
        System.out.println(ut6_03_01.existeIndice(datos, -1));
        System.out.println(ut6_03_01.existeIndice(datos, 10));

        System.out.println("############## BORRADO #############################");

        int[] borrado = ut6_03_01.borrarPorIndice(datos, 5);


        if(borrado != null){
            for (int a :borrado){
                System.out.println(a);
            }
        }else {
            System.out.println(borrado);
        }


        System.out.println("############## INSERTADO #############################");

        int[] insertado = ut6_03_01.insertarEnIndice(datos, 5, 33);

        if(insertado != null){
            for (int a :insertado){
                System.out.println(a);
            }
        }else {
            System.out.println(insertado);
        }


        System.out.println(ut6_03_01.existeIndice2(datos, 5));
        System.out.println(ut6_03_01.existeIndice2(datos, -1));
        System.out.println(ut6_03_01.existeIndice2(datos, 10));

    }
}
