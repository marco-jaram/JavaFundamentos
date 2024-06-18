package capitulo07_modificadoresAcceso;

class MyModifiers { // Esta clase no es pública

    public int vida;
    int hambre;
    private int sed;
    protected int casancio;
    String nacionalidad;
    char sexo;

    public String comer() {
        hambre = 0;
        return "comiendo taquitos";
    }

    public String llorar() {

       return  "llorando...";
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public void setSed(int sed) {
        this.sed = sed;
    }

    public void setCasancio(int casancio) {
        this.casancio = casancio;
    }
}

class Main { // La clase pública debe coincidir con el nombre del archivo

    public static void main(String[] args) {
        MyModifiers marco = new MyModifiers();

        System.out.println(marco.comer());
        System.out.println(marco.llorar());

    }
}