package capitulo04condicionales;

public class MyTernary {
    public static void main(String[] args) {


        int x,y,result;
         x =10;
         y=5;

        if (x>y){
            result = x;
        }else {
            result = y;
        }

        System.out.println("With If: "+result);

        System.out.println("---------------------------");

        result=(x>y)?x:y;

        System.out.println("Ternary\"?\":"+result);

        System.out.println("---------------------------");




    }
}
