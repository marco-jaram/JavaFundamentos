package capitulo09_ambitos;

public class AmbitoMetodo {
    int numero;
    public void sumar() {
        numero = 2 + 1;
    }

    public void restar() {
        int numero, dato;
        numero = 10;
        dato = 1;
        numero = numero + 2;
    }
    public void multiplicar(){
        int resultado = dato*dato;
//        Error porque dato sta fuera del metodo
    }
}



