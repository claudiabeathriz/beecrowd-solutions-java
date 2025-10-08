import java.io.IOException;
import java.util.Scanner;
public class Beecrowd1002 {

    //area of a circle

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double R = scanner.nextDouble();
        double n = 3.14159;
        double A = n * Math.pow(R, 2);

        System.out.printf("A=%.4f\n", A);  // print with 4 decimals

        scanner.close();
    }
}
