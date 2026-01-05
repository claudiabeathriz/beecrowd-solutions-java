import java.util.Scanner;

public class Beecrowd1080 {

    public static void main(String[] args){

        // highest and position

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[100];
        numbers[0] = scanner.nextInt();
        int highestNumber = numbers[0];
        int position = 1;

        for(int i = 1; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();

            if(numbers[i] > highestNumber){
                highestNumber = numbers[i];
                position = i + 1;
            }
        }

        System.out.println(highestNumber);
        System.out.println(position);

        scanner.close();
    }
}
