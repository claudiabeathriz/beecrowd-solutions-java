import java.util.Scanner;

public class Beecrowd1060 {

    public static void main(String[] args){

        // positive numbers

        Scanner scanner = new Scanner(System.in);

        double[] numbers;
        numbers = new double[6];

        int positives = 0;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextDouble();
        }

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] >= 0){
                positives++;
            };
        }

        System.out.println(positives + " valores positivos");

        scanner.close();
    }
}
