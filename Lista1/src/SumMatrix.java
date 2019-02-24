import java.util.Random;

public class SumMatrix {

    public static int[][] genMatrix(){
        Random randomizer = new Random();
        int[][] matrix = new int[5][5];
        for(int l = 0; l < matrix.length; l++){
            for(int c = 0; c < matrix[l].length; c++){
                matrix[l][c] = randomizer.nextInt(5);
            }
        }
        return matrix;
    }

    public static int[][] sumMatrix(int[][] matrixA, int[][] matrixB){
        int[][] matrixC = new int[5][5];
        for(int l = 0; l < matrixC.length; l++){
            for(int c = 0; c < matrixC[l].length; c++){
                matrixC[l][c] = matrixA[l][c] + matrixB[l][c];
            }
        }
        return matrixC;
    }

    public static void showMatrix(int[][] matrix){
        for(int[] columns : matrix){
            for(int value : columns){
                System.out.printf("%2d", value);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        int[][] matrixA = SumMatrix.genMatrix();
        int[][] matrixB = SumMatrix.genMatrix();
        int[][] matrixC = SumMatrix.sumMatrix(matrixA, matrixB);

        SumMatrix.showMatrix(matrixC);
    }
}
