package capitulo04condicionales.ejemploIF;


import java.util.logging.Logger;

public class EjemploIF {

    public static void main(String[] args) {
        Logger logger
                = Logger.getLogger(
                EjemploIF.class.getName());


        int x = 1;
        int y = 99;

        if (x > y) {

            System.out.println("X es mayor a Y");

        } else {

            System.out.println("X es menor a Y");

        }
        System.out.println("-------------------------------------");


        x = 25;
        y = 99;
        if (x > y) {

            logger.info("X es mayor a Y");

        } else {

            logger.info("X es menor a Y");

            System.out.println("-------------------------------------");
            x=99;
            y=1;

           if (x < y){
               logger.info("x es mayor por que vale: "  + x +" mientras que y vale: " +y );
           }else{
               logger.info("y es menor por que vale: "  + y +" mientras que x vale: " +x);
           }


        }





    }
}

