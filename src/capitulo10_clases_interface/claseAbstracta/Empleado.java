package capitulo10_clases_interface.claseAbstracta;

public class Empleado extends Persona{
   String puesto;

    @Override
    void comer() {
        System.out.println("comiendo en el trabajo");
    }

}
