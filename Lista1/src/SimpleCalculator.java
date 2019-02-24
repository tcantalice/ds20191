import java.util.Scanner;

/*
    Não consegui entender muito bem o enunciado
*/

public class SimpleCalculator {

    public static Scanner input = new Scanner(System.in);

    public static String inputValues(){
        StringBuilder operation = new StringBuilder();
        boolean hasEqual = false;
        do{
            System.out.print("-> ");
            String line = SimpleCalculator.input.nextLine();
            line = line.replaceAll(" ", "");
            operation.append(line);
            
            if(operation.indexOf("=") != -1){
                hasEqual = true;
            }
            else{
                System.out.printf("%s\n", operation.toString());
            }
        }while(!hasEqual);
        return operation.toString().replace("=", "");
    }

    public static void main(String[] args){
        String operation = SimpleCalculator.inputValues();
        System.out.println(operation);
    }
}
