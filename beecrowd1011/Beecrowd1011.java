import java.util.Scanner;

public class Beecrowd1011 {
    public static void main(String[] args) {
        //sphere
        Scanner scanner = new Scanner(System.in);

        double R = scanner.nextDouble();

        //erro: o problema pede que considere pi = 3.14159
        // double VOLUME = (4.0 / 3.0) * Math.PI * Math.pow(R, 3);

        //double VOLUME = (4.0 / 3.0) * 3.14159 * Math.pow(R,3);
        //outro jeito, melhor: declarar pi

        double pi = 3.14159;
        double VOLUME = (4.0 / 3.0) * pi * Math.pow(R,3);

        System.out.printf("VOLUME = %.3f\n", VOLUME);

        scanner.close();
    }
}