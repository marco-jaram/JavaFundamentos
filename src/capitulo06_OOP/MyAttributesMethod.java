package capitulo06_OOP;

public class MyAttributesMethod {
    //Attributes
    int age = 48;
    int hunger = 60;
    int thirst = 30;
    String skinColor = "dark";

    // Methods
    public void eat() {
        int hunger = 0;
        System.out.println("hunger: " + hunger);
    }

    public void cry() {
        System.out.println("Crying...");
    }

    public static void main(String[] args) {
        MyAttributesMethod person = new MyAttributesMethod();
        person.eat();
        person.cry();
    }
}