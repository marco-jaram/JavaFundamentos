package capitulo05_bucles_seleccion;

public class MyBreakContinue {

    public static void main(String[] args) {

        int i;

        for (i = 0; i < 11; i++) {
            System.out.println("i Repetitio number: " + i);
            if (i == 8) {
                break;
            }
        }

        System.out.println("------------------------------");

        int a;
        for (a = 0; a < 11; a++) {
            System.out.println("a Repetition number: " + a);
            if (a == 8) {
                continue;
            }
            System.out.println("Final loop "+a);
        }


    }
}
