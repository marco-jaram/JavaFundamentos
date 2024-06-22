package capitulo14_cadenas;

public class MyStringDos {
    public static void main(String[] args) {

        System.out.println("------value OF------");
        int num=10;
        float f = 19.99f;
        System.out.println(String.valueOf(num));



        System.out.println("-----replace -------");
        String cadena="Mi cadena algo larga";
        System.out.println(cadena.replace("a","x"));



        System.out.println("-----getCahrs-------");
        String cadena2 ="mi cadena mega largaaaaaa";
        char[] x= new char[5];
        cadena2.getChars(5,9,x,0);
        System.out.println(x);



        System.out.println("-----length-------");
        String p ="este es mi cadena de texto";
        System.out.println(p.length());




        System.out.println("-----trim-------");
        String micadena = new String("       La cadeno totototo to to ta            ");
        String s = micadena.trim();
        System.out.println(s);

        System.out.println("-----fin-------");














    }
}
