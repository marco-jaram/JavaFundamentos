package capitulo13_excepciones;

public class MiTryCatch {
    public static void main(String[] args) {
        int r;

        try {
            r=20/0;
// no se puede dividir entrte 0
        } catch (Exception e) {
            System.out.println("Tenemos una excepcion"+e.getMessage());
        }

        int q;
        try {
            q = 30 / 0;
        } catch (Exception e) {
            System.out.println("otra excepcion"+e.getMessage());
        }

    }



}
