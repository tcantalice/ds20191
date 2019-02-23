import java.util.Random;

public class MaxMatrix {

    public static int[][] genMatrix(){
        int[][] matrix = new int[4][4];
        Random randomizer = new Random();
        for(int l = 0; l < matrix.length; l++){
            for(int c = 0; c < matrix[l].length; c++){
                matrix[l][c] = randomizer.nextInt(10);
            }
        }
        return matrix;
    }

    public static void maxInMatrix(int[][] matrix){
        int max = matrix[0][0];
        int line = 0;
        int column = 0;

        for(int l = 0; l < matrix.length; l++){
            for(int c = 0; c < matrix[l].length; c++){
                if(matrix[l][c] > max){
                    max = matrix[l][c];
                    line = l;
                    column = c;
                }
            }
        }

        System.out.printf("Maior: %d\tLinha: %d\tColuna: %d\n", max, line, column);
    }
    public static void main(String[] args){
        int[][] matrix = MaxMatrix.genMatrix();
        MaxMatrix.maxInMatrix(matrix);
    }
}
