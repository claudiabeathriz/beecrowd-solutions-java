import java.util.Scanner;

public class Beecrowd1004 {
    public static void main(String[] args) {

        //simple product

        int A, B, PROD;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        PROD = A * B;

        System.out.println("PROD = " + PROD);

        scanner.close();
    }
}

