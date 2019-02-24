import java.util.Scanner;

public class VectorDescribe {

    public static Scanner input = new Scanner(System.in);

    public static int[] inputValues(){
        int[] vector = new int[20];
        for(int i = 0; i < vector.length; i++){
            System.out.printf("%2d° valor: ", i+1);
            vector[i] = VectorDescribe.input.nextInt();
        }
        return vector;
    }

    public static long factorial(int value){
        long valueFactor;
        if(value <= 1){
            valueFactor = 1;
        }
        else{
            valueFactor = value * VectorDescribe.factorial(value - 1);
        }
        return valueFactor;
    }

    public static boolean cousin(int value){
        int divisor = 2;
        boolean cousin = false;
        value = Math.abs(value);
        if(value == 1 || value == 2 || value == 3){
            cousin = true;
        }
        else if(value != 0){
            for(int dv = 2; divisor == 2 && dv < value; dv++){
                divisor = value % dv == 0 ? divisor + 1 : divisor;
            }
            cousin = divisor == 2 ? true : cousin;
        }

        return cousin;
    }

    public static void describe(int[] vector){
        int max = vector[0];
        int min = vector[0];
        for(int value : vector){
            long factor = VectorDescribe.factorial(value);
            boolean cousin = VectorDescribe.cousin(value);
            if(value > max){
                max = value;
            }
            else if(value < min){
                min = value;
            }

            if(cousin){
                System.out.printf("%3d --\tFatorial: %d\t-- É primo\n", value, factor);
            }
            else{
                System.out.printf("%3d --\tFatorial: %d\n", value, factor);
            }
        }
        System.out.printf("Maior: %d\tMenor: %d", max, min);
    }
    public static void main(String[] args){
        int[] vector = VectorDescribe.inputValues();
        VectorDescribe.describe(vector);
    }
}
