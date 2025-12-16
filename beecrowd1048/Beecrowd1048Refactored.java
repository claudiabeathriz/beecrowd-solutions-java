import java.util.Scanner;

public class Beecrowd1048Refactored {

    public static void main(String[] args){

        // salary increase

        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();
        double percentage = getIncreasePercentage(salary);
        double moneyEarned = salary * percentage;
        double newSalary = salary + moneyEarned;

        System.out.printf("Novo salario: %.2f%n", newSalary);
        System.out.printf("Reajuste ganho: %.2f%n", moneyEarned);
        System.out.printf("Em percentual: %.0f %%\n", percentage * 100);
    }

    static double getIncreasePercentage(double salary){

        if (salary <= 400) {
            return 0.15;
        } else if (salary <= 800) {
            return 0.12;
        } else if (salary <= 1200) {
            return 0.10;
        } else if (salary <= 2000) {
            return 0.07;
        } else {
            return 0.04;
        }
    }
}