package capitulo10_clases_interface.claseAbstracta;

public class Estudiante extends Persona{
    String carrera;

    @Override
    void comer() {
        System.out.println("botaneando en la uni");
    }
}
