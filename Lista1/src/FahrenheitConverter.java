import java.util.Scanner;

public class FahrenheitConverter {
    public static Scanner input = new Scanner(System.in);

    public static double inputCelsius(){
        System.out.print("Temperatura em °C: ");
        return FahrenheitConverter.input.nextDouble();
    }

    public static double convertC2F(double celsius){
        return celsius * 1.8 + 32;
    }

    public static void printFahrenheit(double fahrenheit, double tempConverted, char unityConverted){
        System.out.print(String.format("%.2f°%c -> %.2f°F\n", tempConverted, unityConverted, fahrenheit));
    }

    public static void main(String[] args){
        double celsius = FahrenheitConverter.inputCelsius();
        double fahrenheit = FahrenheitConverter.convertC2F(celsius);
        FahrenheitConverter.printFahrenheit(fahrenheit, celsius, 'C');
    }
}