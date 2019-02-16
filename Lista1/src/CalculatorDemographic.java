import java.util.Scanner;

public class CalculatorDemographic {
    public static Scanner input = new Scanner(System.in);

    public static long inputPopulation(){
        System.out.print("População: ");
        return CalculatorDemographic.input.nextLong();
    }

    public static double inputAnualTaxGrowth(){
        System.out.print("Taxa de crescimento anual (%): ");
        return CalculatorDemographic.input.nextDouble() / 100;
    }

    public static void resultNextYears(long population, double tax, int years){
        for(int i = 1; i <= years; i++){
            long yearTotal = CalculatorDemographic.calcGrowth(i, population, tax);
            System.out.printf("Em %d ano(s) -> %d pessoas\n", i, yearTotal);
        }
    }

    private static long calcGrowth(int years, long population, double tax){
        if(years > 0){
            return CalculatorDemographic.calcGrowth(years - 1, (Math.round(population * tax) + population), tax);
        }
        return population;
    }
    public static void main(String[] args){
        long population = CalculatorDemographic.inputPopulation();
        double tax = CalculatorDemographic.inputAnualTaxGrowth();
        int years = 5;
        CalculatorDemographic.resultNextYears(population, tax, years);
    }
}
