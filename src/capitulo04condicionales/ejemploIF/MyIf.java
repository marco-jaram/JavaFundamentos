package capitulo04condicionales.ejemploIF;

public class MyIf {


    public static void main(String[] args) {
// Tomando en cuenta que mi horario limite son las 8pm
//        despues de las 12 ya es impoerdonable seguir trabajando
//        antes de las 8 voy pensando en terminar
        int hora=9;

        if (hora>11){
            if (hora<12){
                System.out.println(hora+" Si estas estudiando dale pero si no a dormir");

            }else {
                System.out.println(hora+" aunque estes estudiando mejor duermo siempre es mejor descansar");
            }
        }else {
            if (hora<8){
                System.out.println(hora+" aun tienes tiempo para trabajar un rato pero recuerda que a las 8 se acaba");
            }else{
                System.out.println(hora+" mejor ya ve terminando se te canso el caballo");
            }
        }














    }
}
