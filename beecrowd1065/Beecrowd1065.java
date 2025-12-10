import java.util.Scanner;

public class Beecrowd1065 {

    public static void main(String[] args){

        // even between five numbers

        Scanner scanner = new Scanner(System.in);

        int numbers[] = new int[5];
        int evenNumbers = 0;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        for(int number : numbers){
            if(number % 2 == 0){
                evenNumbers++;
            }
        }

        System.out.println(evenNumbers + " valores pares");

        scanner.close();

    }
}
