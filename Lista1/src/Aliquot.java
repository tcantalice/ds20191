import java.util.Scanner;

public class Aliquot {

    public static Scanner input = new Scanner(System.in);

    public static double getSalary(){
        System.out.print("Informe o salário: R$");
        return Aliquot.input.nextDouble();
    }

    public static String getName(){
        System.out.print("Nome: ");
        return Aliquot.input.nextLine();
    }

    public static void getAliquot(String name, double salary){
        String notFree = "%s: %s - R$%.2f\n";
        if(salary < 600.0){
            System.out.printf("%s: %s\n", name, "Isento");
        }
        else if(salary < 1500.0){
            System.out.printf(notFree, name, "10% do salário bruto", salary*0.1);
        }
        else{
            System.out.printf(notFree, name, "15% do salário bruto", salary*0.15);
        }
    }
    public static void main(String[] args){
        String name = Aliquot.getName();
        double salary = Aliquot.getSalary();
        Aliquot.getAliquot(name, salary);
    }
}
