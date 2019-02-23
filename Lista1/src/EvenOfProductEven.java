import java.util.Scanner;

public class EvenOfProductEven {

    public static Scanner input = new Scanner(System.in);

    public static int[] inputNums(){
        int[] nums = new int[10];
        for(int i = 1; i <= 10; i++){
            System.out.printf("Informe o %dº número: ", i);
            nums[i-1] = EvenOfProductEven.input.nextInt();
        }
        return nums;
    }

    public static void productEven(int num1, int num2){
        if(num1 != 0 && num2 != 0){
            if((num1 * num2) % 2 == 0){
                System.out.printf("%d e %d = %d\n", num1, num2, num1 * num2);
            }
        }
    }

    public static void main(String[] args){
        int[] nums = EvenOfProductEven.inputNums();
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                EvenOfProductEven.productEven(nums[i], nums[j]);
            }
        }
    }
}
