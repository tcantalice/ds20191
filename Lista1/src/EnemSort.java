import java.util.Scanner;

public class EnemSort {

    public static Scanner input = new Scanner(System.in);

    public static double[] inputValues(){
        double[] gradesEnem = new double[10];
        for(int i = 0; i < gradesEnem.length; i++){
            System.out.printf("%2d° nota: ", i+1);
            double value = EnemSort.input.nextDouble();
            gradesEnem = EnemSort.enemInsertSort(gradesEnem, value);
        }
        return gradesEnem;
    }

    public static double[] enemInsertSort(double[] current, double nvalue){
        int firstFree = 0;
        while(current[firstFree] != 0.0){
            firstFree++;
        }
        for(int i = 0; i <= firstFree; i++){
            double aux = 0;
            if(current[i] < nvalue){
                aux = current[i];
                current[i] = nvalue;
                nvalue = aux;
            }
        }
        return current;
    }
    public static void main(String[] args){
        double[] grades = EnemSort.inputValues();
        for(int i = 0; i < grades.length; i++){
            System.out.printf("%2d° -> %.1f\n", i+1, grades[i]);
        }
    }
}
