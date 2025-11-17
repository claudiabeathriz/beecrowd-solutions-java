import java.util.Scanner;
public class Beecrowd1043clean {

    public static void main(String[] args){

        // triangle

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        scanner.close();

        if (isTriangle(a, b, c)) {
            System.out.printf("Perimetro = %.1f%n", a + b + c);
        } else {
            double area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f%n", area);
        }
    }

    private static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}