package capitulo08_OOP.persona.herencia;

public class Carpintero extends Persona{

    @Override
    public void comer() {
        System.out.println("Comiendo taquitos");
        this.hambre=100;
    }
}
