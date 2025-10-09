import java.util.Scanner;

public class Beecrowd1005 {
    public static void main(String[] args) {

        //average

        double A, B, MEDIA;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        MEDIA = ((A*3.5) + (B*7.5))/11.0;

        System.out.printf("MEDIA = %.5f\n" , MEDIA);

        scanner.close();
    }
}