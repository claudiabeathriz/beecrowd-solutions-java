import java.util.Arrays;
import java.util.Scanner;
public class Beecrowd1042 {

    public static void main(String[] args){

        // simple sort

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
        // define the array with a fixed length

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        // iterate through the fixed length of the array to get 3 int numbers from user
        // and store them in the array

        int[] asRead = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            asRead[i] = numbers[i];
        }
        // manual array copy; creates a copy of the original array (asRead)
        // so we can print it in the same order as user entered
        // (before sorting, otherwise both arrays would be sorted)
        // alt: asRead = Arrays.copyOf(numbers, numbers.length);

        Arrays.sort(numbers);

        for(int num : numbers){
            System.out.println(num);
        }

        System.out.println();

        for (int num : asRead) {
            System.out.println(num);
        }

        scanner.close();
    }
}
