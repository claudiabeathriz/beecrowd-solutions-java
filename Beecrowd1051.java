import java.util.Scanner;
public class Beecrowd1051 {
    //taxes - with presentation error (added inputs)
    public static void main(String[] args) {

        double salary;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please inform your monthly salary:");
        salary = scanner.nextDouble();

        if (salary <= 2000) {
            System.out.println("Isento.");
        } else if (salary <= 3000) {
            double tax = (salary - 2000) * 0.08;
            System.out.println("You have to pay: R$" + String.format("%.2f", tax) + " in taxes.");
        } else if (salary <= 4500) {
            double tax = 1000 * 0.08 + (salary - 3000.00) * 0.18;
            System.out.println("You have to pay: R$" + String.format("%.2f", tax) + " in taxes.");
        } else {
            double tax = 1000 * 0.08 + 1500.00 * 0.18 + (salary - 4500.00) * 0.28;
            System.out.println("You have to pay: R$" + String.format("%.2f", tax) + " in taxes.");
        }
    }
}
