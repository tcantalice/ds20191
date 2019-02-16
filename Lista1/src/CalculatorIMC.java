import java.util.Scanner;

public class CalculatorIMC {
    public static Scanner input = new Scanner(System.in);

    public static double inputData(String mesage){
        System.out.print(String.format("%s: ", mesage));
        return CalculatorIMC.input.nextDouble();
    }

    public static double getIMC(double height, double weight){
        return weight / Math.pow(height, 2.0);
    }

    public static void printResult(double imc){
        String result;
        String format = "%.1f -> %s";
        if(imc < 18.6){
            result = String.format(format, imc, "Abaixo do peso");
        }else if(imc < 25){
            result = String.format(format, imc, "Peso normal");
        }else if(imc < 30){
            result = String.format(format, imc,  "Acima do peso");
        }else{
            result = String.format(format, imc, "Obeso");
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        double weight = CalculatorIMC.inputData("Peso em quilogramas");
        double height = CalculatorIMC.inputData("Altura em metros");
        double imc = CalculatorIMC.getIMC(height, weight);
        CalculatorIMC.printResult(imc);
    }
}
