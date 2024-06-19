package capitulo10_clases_interface.interfac;

public class Gato extends Animal implements Mascota{
    @Override
    void sonido() {
        System.out.println("Miau");
    }

    @Override
    public void juega() {
        System.out.println("juego corretenado una luz");
    }

    @Override
    public void amigable() {
        System.out.println(" soy amigable pero me eonjo");
    }
}
