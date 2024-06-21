package capitulo13_excepciones;

public class MyThrow {

    static void ejecutar() throws Exception{
        throw new Exception();
    }

    public static void main(String[] args) {

        try {
            ejecutar();
        } catch (Exception e) {
            System.out.println("Tenemos una escepciton");
        }


    }





}
