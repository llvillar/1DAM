package bucles;

public class Random {

    public static void main(String[] args) {

        int max = 1;
        int min = 0;

/*
        for (int i = 0; i < 10; i++) {
            System.out.println((int) (Math.random()*2));
        }


        for (int i = 0; i < 100; i++) {
            System.out.println("metodo 1: " +  (int) (Math.random() * (max - min + 1) + min));
        }
*/

        for (int i = 0; i < 100; i++) {
            System.out.println("metodo 2: " + Math.round(Math.random()));
        }


    }
}
