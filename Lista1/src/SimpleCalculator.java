import java.util.Scanner;

/*
    Não consegui entender muito bem o enunciado
*/

public class SimpleCalculator {

    public static Scanner input = new Scanner(System.in);
    
    public static double inputNumber(){
	System.out.print(">> ");
	return new Double(SimpleCalculator.input.nextLine());
    }

    public static char inputOperation(){
	System.out.print(">> ");
	return SimpleCalculator.input.nextLine().charAt(0);
    }

    public static double calculate(double number1, double number2, char operation){
	double result 0.0;
	switch(operation){
	    case '+':
		result = number1 + number2;
		break;
	    case '-':
		result = number1 - number2;
		break;
	    case '*':
		result = number1 * number2;
		break;
	    case '/':
		if(number2 != 0.0){
		    result = number1 / number2:
		}
		break;
	}
	return result;
    }
    public static void main(String[] args){
    	double number1 = SimpleCalculator.inputNumber();
	char operation = SimpleCalculator.inputOperation();
	double number2 = SimpleCalculator.inputNumber();
	System.out.printf(":>> %.2", SimpleCalculator.calculate(number1, number2, operation));
    }
}
