package capitulo12_arreglos;

public class ArregloBidimensional {
    public static void main(String[] args) {
        int [][] arreglo = new int [10][10];
        int i,j;


        for ( i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                arreglo[i][j]=i+j;
            }
        }

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print(arreglo[i][j]+ "\t");
            }
            System.out.println();
        }





    }
}
