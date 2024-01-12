package figuras;

import herencia.animales.Animal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FigurasMain {

    private static List<FiguraGeometrica> figuras;
    public static void main(String[] args) {
        figuras = new ArrayList<>();
        menu();
    }

    private static void menu() {

        Scanner sn = new Scanner(System.in);

        boolean salir = false;
        int opcion;

        while(!salir){

            System.out.println("-- Programa para la creación de figuras geométricas y calculo de superficies y perímetro --");

            System.out.println("1.- Crear circulo");
            System.out.println("2.- Crear cuadrado");
            System.out.println("3.- Crear triángulo");
            System.out.println("4.- Calcular areas");
            System.out.println("5.- Calcular perímetros");
            System.out.println("6.- Salir");

            try{

                System.out.println("Seleccione la opcion deseada: ");
                opcion = sn.nextInt();

                switch (opcion){
                    case 1:
                       // FiguraGeometrica circulo = FigurasUtil.crearCirculo(sn);
                        FiguraGeometrica circulo = crearCirculo(sn);
                        figuras.add(circulo);
                        break;
                    case 2:
                        FiguraGeometrica cuadrado = FigurasUtil.crearCuadrado(sn);
                        figuras.add(cuadrado);
                        break;
                    case 3:
                        FiguraGeometrica triangulo = FigurasUtil.crearTriangulo(sn);
                        figuras.add(triangulo);
                        break;
                    case 4:
                        FigurasUtil.calcularAreas(figuras, sn);
                        break;
                    case 5:
                        FigurasUtil.calcularPerimetro(figuras, sn);
                        break;
                    case 6:
                        salir=true;
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 y 6");

                }
            }
            catch(InputMismatchException e){
                System.out.println("Debes seleccionar un numero de opcion");
                sn.next();
            }
        }

        System.out.println("Gracias por utilizar el sistema, hasta luego... ");
    }


    public static Circulo crearCirculo(Scanner sn) {

        System.out.println("Introduce nombre de la figura:");
        String nombre = sn.next();

        System.out.println("Introduce en radio:");
        double radio = sn.nextDouble();

        Circulo c = new Circulo(nombre, radio);

        return c;
    }
}

