package capitulo12_arreglos;

public class ArregloIndice {
    public static void main(String[] args) {
        String[] vocales = {"a", "e", "i", "o", "u"};

        System.out.println("--Recorreindo mis vocales con for each--");
        for (String letras : vocales) {
            System.out.println(letras);
        }
        System.out.println("-- Recorriendo el largo de mis vocales --");
        System.out.println(vocales.length);
        System.out.println("--Obteniendo el subindice 4 --");
        System.out.println(vocales[4] + ": es el subindicede las vocales");

        System.out.println("-- Recorriendo con un for mis vocales indice y letra --");

        for (int i = 0; i < vocales.length; i++) {
            System.out.println("El subindice es " + i + " y la vocal es " + vocales[i]);
        }

    }
}
