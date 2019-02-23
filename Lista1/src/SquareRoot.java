import java.util.Scanner;

public class SquareRoot {

    public static Scanner input = new Scanner(System.in);

    public static int getNumber(){
        System.out.print("Número: ");
        return SquareRoot.input.nextInt();
    }

    public static void sqrt(int num){
        int count = 0;
        int odd = 1;
        while(num > 0){
            num -= odd;
            odd += 2;
            count++;
        }
        if(num == 0){
            System.out.printf("A raiz exata é %d\n", count);
        }
        else{
            System.out.printf("A raiz é aproximadamente %d\n", count);
        }
    }
    public static void main(String[] args){
        int num = SquareRoot.getNumber();
        SquareRoot.sqrt(num);
    }
}
