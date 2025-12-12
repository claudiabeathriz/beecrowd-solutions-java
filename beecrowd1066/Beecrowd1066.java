import java.util.Arrays;
import java.util.Scanner;

public class Beecrowd1066 {

    public static void main(String[] args){

        // even, odd, positive and negative

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        // there is no need to create a method for this, BUT if i wanted to, how would i do it?

        scanner.close();

        int[] results = countNumbers(numbers); // ← array after method

        scanner.close();

        // print each array index
        System.out.println(results[0] + " valor(es) par(es)");
        System.out.println(results[1] + " valor(es) impar(es)");
        System.out.println(results[2] + " valor(es) positivo(s)");
        System.out.println(results[3] + " valor(es) negativo(s)");

    }
    public static int[] countNumbers(int[] numbers) {

        int even = 0;
        int odd = 0;
        int positive = 0;
        int negative = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            if (number > 0) {
                positive++;
            } else if (number < 0){
                negative++;
            }
        }

        return new int[]{even, odd, positive, negative};
        // error = return even,odd, positive, negative;
    }
}