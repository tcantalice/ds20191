import java.util.Scanner;

public class PG {

    public static Scanner input = new Scanner(System.in);

    public static int inputValue(String msg){
        System.out.printf("%s: ", msg);
        return PG.input.nextInt();
    }

    public static int[] genPG(int n1, int reason){
        int[] pg = new int[10];
        pg[0] = n1;
        for(int i = 1; i < pg.length; i++){
            pg[i] = n1 * (int) Math.pow((double)reason, (double) i);
        }
        return pg;
    }

    public static void main(String[] args){
        int n1 = PG.inputValue("Número incial");
        int reason = PG.inputValue("Razão da PG");
        int[] pg = PG.genPG(n1, reason);
        for(int i = 1; i <= pg.length; i++){
            System.out.printf("%2d° termo: %d\n", i, pg[i-1]);
        }
    }
}