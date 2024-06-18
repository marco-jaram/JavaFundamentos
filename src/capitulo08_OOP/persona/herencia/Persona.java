package capitulo08_OOP.persona.herencia;

public class Persona {
    public int vida;
    int hambre;
    private int sed;
    protected int consancio;
    int sueno;
    int edad;
    String colorPiel;
    String colorCabello;
    String nacionalidad;
    char sexo;

    public Persona() {
        vida = 10;
        edad = 10;
    }

    public Persona(int vida, int edad) {
        this.vida = vida;
        this.edad = edad;
    }


    public Persona(int v, int e, String c){
        vida=v;
        edad=e;
        colorCabello=c;

    }

    public void comer(){
        hambre=0;
    }










}
