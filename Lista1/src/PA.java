import java.util.Scanner;

public class PA {

    public static Scanner input = new Scanner(System.in);

    public static int inputValue(String msg){
        System.out.printf("%s: ", msg);
        return PA.input.nextInt();
    }

    public static int[] genPA(int n1, int reason){
        int[] pa = new int[10];
        pa[0] = n1;
        for(int i = 1; i < pa.length; i++){
            pa[i] = n1 + (i) * reason;
        }
        return pa;
    }

    public static void main(String[] args){
        int n1 = PA.inputValue("Número incial");
        int reason = PA.inputValue("Razão da PA");
        int[] pa = PA.genPA(n1, reason);
        for(int i = 1; i <= pa.length; i++){
            System.out.printf("%2d° termo: %d\n", i, pa[i-1]);
        }
    }
}
