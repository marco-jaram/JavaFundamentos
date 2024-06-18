package capitulo05_bucles_seleccion;

public class MyForWhilw {

    public static void main(String[] args) {

        int i;

        for (i = 0; i < 10; i++) {
            System.out.println(" i Repetition: " + i);
        }

        System.out.println("-----------------------");

        int a = 0;

        while (a < 10) {
            System.out.println("a Repetition  number: " + a);
            a++;
        }
        System.out.println("-----------------------");


        int x =5;

        do {
            System.out.println("X Repetition number: " +x);
            x++;
        } while (x<11);


        System.out.println("-----------------------");
    }


}
