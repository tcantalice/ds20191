import java.util.Random;

public class MinMaxMatrix {

    public static int[][] getMatrix(){
        int[][] matrix = new int[10][10];
        Random randomizer = new Random();

        for(int l = 0; l < matrix.length; l++){
            for(int c = 0; c < matrix[l].length; c++){
                matrix[l][c] = randomizer.nextInt(10);
            }
        }
        return matrix;
    }

    public static void minMaxMatrix(int[][] matrix, int column, int line){
        int max = -1;
        int min = -1;

        if(line == -1){
            max = matrix[0][column];
            min = matrix[0][column];

            for(int l = 0; l < matrix.length; l++){
                if(matrix[l][column] > max){
                    max = matrix[l][column];
                }
                else if(matrix[l][column] < min){
                    min = matrix[l][column];
                }
            }
            System.out.printf("Coluna: %d\tMaior: %d\tMenor: %d\n", column, max, min);
        }else if(column == -1){
            max = matrix[line][0];
            min = matrix[line][0];
            for(int c = 0; c < matrix[line].length; c++){
                if(matrix[line][c] > max){
                    max = matrix[line][c];
                }
                else if(matrix[line][c] < min){
                    min = matrix[line][c];
                }
            }
            System.out.printf("Linha: %d\tMaior: %d\tMenor: %d\n", line, max, min);
        }
        
    }

    public static void main(String[] args){
        int[][] matrix = MinMaxMatrix.getMatrix();
        MinMaxMatrix.minMaxMatrix(matrix, -1, 5);
        MinMaxMatrix.minMaxMatrix(matrix, 7, -1);
    }
}
