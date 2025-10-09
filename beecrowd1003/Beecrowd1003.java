import java.util.Scanner;

public class Beecrowd1003 {
    public static void main(String[] args) {

        //simple sum

        int A, B, SOMA;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        scanner.close();
    }
}