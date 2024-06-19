package capitulo10_clases_interface.interfac;

public class Perro extends Animal implements Mascota{
    @Override
    void sonido() {
        System.out.println("Guau");
    }

    @Override
    public void juega() {
        System.out.println("juego con una pelaota");
    }

    @Override
    public void amigable() {
        System.out.println("Soy amigable con mi familia");
    }
}
