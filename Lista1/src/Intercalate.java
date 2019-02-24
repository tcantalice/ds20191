import java.util.Scanner;

public class Intercalate {

    public static Scanner input = new Scanner(System.in);

    public static String[] inputValues(String vectorName){
        System.out.printf("Capturando valores de %s\n", vectorName);
        String[] vector = new String[5];
        for(int i = 0; i < 5; i++){
            System.out.printf("%d° valor: ", i + 1);
            vector[i] = Intercalate.input.nextLine();
        }
        return vector;
    }

    public static String[] interleaver(String[] vectorA, String[] vectorB){
        String[] vectorC = new String[vectorA.length + vectorB.length];
        for(int i = 0, j = 0; i < vectorC.length; i++){
            if(i % 2 == 0 || i == 0){
                vectorC[i] = vectorA[j];
            }
            else{
                vectorC[i] = vectorB[j];
                j++;
            }
        }
        return vectorC;
    }

    public static void showVector(String[] vector, String vectorName){
        System.out.printf("Vetor %s\n->", vectorName);
        for(String value : vector){
            System.out.printf(" %s", value);
        }
        System.out.println();
    }
    public static void main(String[] args){
        String[] vectorA = Intercalate.inputValues("Vetor A");
        String[] vectorB = Intercalate.inputValues("Vetor B");
        String[] vectorC = Intercalate.interleaver(vectorA, vectorB);
        Intercalate.showVector(vectorA, "A");
        Intercalate.showVector(vectorB, "B");
        Intercalate.showVector(vectorC, "C");
    }
}
