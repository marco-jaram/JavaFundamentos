package capitulo08_OOP;

public class Carpintero extends Persona{

    @Override
    public void comer() {
        System.out.println("Comiendo taquitos");
        this.hambre=100;
    }
}
