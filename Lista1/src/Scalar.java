import java.util.Scanner;

public class Scalar {

    public static Scanner input = new Scanner(System.in);

    public static int[] inputNums(){
        int[] values = new int[10];
        for(int i = 1; i <= 10; i++){
            System.out.printf("%dº número: ", i);
            values[i-1] = Scalar.input.nextInt();
        }
        return values;
    }

    public static int[] getScalar(int[] values1, int[] values2){
        int[] scalar = new int[values1.length];
        for(int i = 0; i < scalar.length; i++){
            scalar[i] = values1[i] * values2[i];
        }
        return scalar;
    }
    public static void main(String[] args){
        System.out.println("Valores de A");
        int[] a = Scalar.inputNums();
        System.out.println("Valores de B");
        int[] b = Scalar.inputNums();
        int scalar = 0;
        for(int value : Scalar.getScalar(a, b)){
            scalar += value;
        }
        System.out.printf("Escalar entre A e B: %d\n", scalar);
    }
}
