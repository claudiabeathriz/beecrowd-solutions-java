import java.util.Scanner;

public class Beecrowd1064 {

    public static void main(String[] args){

        // positives and average

        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[6];
        int positives = 0;
        double positivesSum = 0;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextDouble();
        }

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 0){
                positives++;
                positivesSum += numbers[i];
            }
        }

        double average = positivesSum/positives;

        System.out.println(positives + " valores positivos");
        System.out.printf("%.1f\n", average);

        scanner.close();

    }
}
