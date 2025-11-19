import java.util.Scanner;

public class Beecrowd1070 {
    public static void main(String[] args) {

        //six odd numbers

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = 0;

        while (count < 6) {
            if (x % 2 == 1) { // se for ímpar
                System.out.println(x);
                count++;
            }
            x++;
        }
        scanner.close();
    }
}
