import java.util.Scanner;
import java.util.Random;

public class InArray {

    public static Scanner input = new Scanner(System.in);

    public static int[] genNumbers(){
        int[] numbers = new int[10];
        Random randomizer = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = randomizer.nextInt();
        }
        return numbers;
    }

    public static int indexOf(int[] values, int value){
        int pos = -1;
        for(int i = 0; i < values.length; i++){
            if(values[i] == value){
                pos = i;
                break;
            }
        }
        return pos;
    }
    public static void main(String[] args){
        int[] numbers = InArray.genNumbers();
        System.out.print("Número a pesquisar: ");
        int value = InArray.input.nextInt();
        int pos = InArray.indexOf(numbers, value);
        if(pos == -1){
            System.out.println("O valor não está no vetor!");
        }
        else{
            System.out.printf("O valor está na posição: %d\n", pos);
        }
    }
}
