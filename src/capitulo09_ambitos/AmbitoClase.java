package capitulo09_ambitos;

public class AmbitoClase {
    int numero = 25;
// Esta dura de main por lo que no lo econocera
//    por eso imprime 26
    public static void main(String[] args) {
        int numero =26;
        System.out.println(numero);
    }
}
