import java.util.Scanner;

public class Beecrowd1013 {
    public static void main(String[] args) {

        //the greatest
        /*Make a program that reads 3 integer values and present the greatest one followed by the message "eh o maior".
        Use the following formula: MaiorAB = (a+b+abs(a-b))/2
        Input
        The input file contains 3 integer values.
        Output
        Print the greatest of these three values followed by a space and the message “eh o maior”.
        */
        
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maior + " eh o maior\n");

        scanner.close();
    }
}