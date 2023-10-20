package bucles;

public class Bucle3 {

    public static void main(String[] args) {
        ejecutaBucleFor();
        ejecutaBucleWhile();
    }

    public static void ejecutaBucleFor(){
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        System.out.println("Fin del bucle for");
    }

    public static void ejecutaBucleWhile(){
        int i = 0;
        while(i < 10){
            System.out.println(i);
            i++;
        }

        System.out.println("Fin del bucle while");
    }
}
