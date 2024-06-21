package capitulo13_excepciones;

public class MyFinally {

    static void ejecutar() throws Exception{
        throw new Exception();
    }

    public static void main(String[] args) {

        try {
            ejecutar();
        } catch (Exception e) {
            System.out.println("Tenemos una exepciton");
        }
        finally{
            System.out.println("El bloque que siempre  se ejetuva jiji");
            System.out.println("Ve y borra el throw new Exception(); y lo veras");
        }


    }











}
