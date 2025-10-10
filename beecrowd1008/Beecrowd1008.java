import java.util.Scanner;

public class Beecrowd1008 {
    public static void main(String[] args) {

        //salary per hour

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int hoursworked = scanner.nextInt();
        double amountperhour = scanner.nextDouble();

        double SALARY = (hoursworked * amountperhour);

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n" , SALARY);

        scanner.close();
    }
}