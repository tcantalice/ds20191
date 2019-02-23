import java.util.Scanner;

public class Inversor {

    public static Scanner input = new Scanner(System.in);

    public static String[] inputLine(){
        System.out.print("Digite os valores separados por espaço: ");
        return Inversor.input.nextLine().split(" ");

    }

    public static String[] inversorLine(String[] line){
        String aux;
        if(line.length % 2 == 0){
            for(int i = 0, j = line.length - 1; i < line.length / 2; i++, j--){
                aux = line[i];
                line[i] = line[j];
                line[j] = aux;
            }
        }
        else{
            for(int i = 0, j = line.length - 1; i < (int) Math.floor(line.length / 2); i++, j--){
                aux = line[i];
                line[i] = line[j];
                line[j] = aux;
            }
        }
        return line;
    }
    public static void main(String[] args){
        String[] line = Inversor.inputLine();
        line = Inversor.inversorLine(line);
        for(String value : line){
            System.out.printf("%s ", value);
        }
    }
}
