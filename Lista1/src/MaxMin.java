import java.util.Scanner;

public class MaxMin {

    public static Scanner input = new Scanner(System.in);

    public static int[] inputValues(){
        int[] values = new int[10];
        for(int i = 1; i <= values.length; i++){
            System.out.printf("%dº número: ", i);
            values[i-1] = MaxMin.input.nextInt();
        }
        return values;
    }

    public static void getMaxMin(int[] values){
        int max = values[0];
        int min = values[0];

        for(int value : values){
            if(value > max){
                max = value;
            }
            else if(value < min){
                min = value;
            }
        }

        System.out.printf("Maior: %d\nMenor: %d\n", max, min);
    }
    public static void main(String[] args){
        int[] values = MaxMin.inputValues();
        MaxMin.getMaxMin(values);
    }
}
