package capitulo14_cadenas;

public class MyStringUno {

    public static void main(String[] args) {
        String name = "Marco";
        System.out.println("Este es mi primer String ajaja: " + name);
        System.out.println("------contact------");
        String cadena = "Hola mundo ";
        cadena = cadena.concat("Marco Jaramillo");
        System.out.println(cadena);


        System.out.println(cadena.length());


        System.out.println("-----compare-------");
        String cadena1 = "marc";
        String x = "marco jaramillo";
        int r = cadena1.compareTo(x);
        System.out.println(r);
//        num positivo= la cadena 1 es mayot que la 2
//        num - son identicas
//        num negativo la cadena 1 es menor que la 2


        System.out.println("------equals------");
        String cadena2 = "Hola mundo";
        String x2 = "Hola mundo";
        if (cadena2.equals(x2)) {
            System.out.println("Si :) ");

        } else {
            System.out.println("noooo :(");
        }


        System.out.println("-----endsWith-------");
        String cadena3 = "Marco Jaramillo";
        String x3 = "Jaramillo";
        System.out.println(cadena3.endsWith(x3));
//        la ultima palabra es igual jijij


        System.out.println("------Upper anda Low------");
        String cadena4 = "marco jaramillo";
        System.out.println(cadena4.toUpperCase());
        String cadena5 = "MARCO JARAMILLO";
        System.out.println(cadena5.toLowerCase());


    }


}
