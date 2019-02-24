import java.util.Scanner;

public class EvenOddMatrix {

    public static Scanner input = new Scanner(System.in);

    public static int[][] inputValues(){
        int[][] matrix = new int[3][3];
        for(int l = 0; l < matrix.length; l++){
            System.out.println("Valores da linha " + (l + 1));
            for(int c = 0; c < matrix[l].length; c++){
                System.out.printf("Coluna %d: ", c+1);
                matrix[l][c] = EvenOddMatrix.input.nextInt();
            }
        }
        return matrix;
    }

    public static void countEvenOdd(int[][] matrix){
        int even = 0;
        int odd = 0;
        for(int[] columns : matrix){
            for(int value : columns){
                if(value != 0 && value % 2 == 0){
                    even++;
                }
                else if(value % 2 != 0){
                    odd++;
                }
            }
        }
        System.out.printf("Par: %d\tÍmpar: %d", even, odd);
    }

    public static void main(String[] args){
        int[][] matrix = EvenOddMatrix.inputValues();
        EvenOddMatrix.countEvenOdd(matrix);
    }
}
