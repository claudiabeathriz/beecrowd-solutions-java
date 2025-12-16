import java.text.DecimalFormat;
import java.util.Scanner;

public class Beecrowd1048 {

    public static void main(String[] args){

        // salary increase

        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();
        // DecimalFormat format = new DecimalFormat("#.##");
        // salary = Double.valueOf(format.format(salary));
        // previous error: never format values before calculating; only format them when printing

        double newSalary = calcNewSalary(salary);
        double moneyEarned = calcMoneyEarned(salary, newSalary);
        double percentage = calcPercentage(salary, newSalary);

        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", moneyEarned);
        System.out.printf("Em percentual: %.0f %%\n", percentage);

        scanner.close();
    }

    static double calcNewSalary(double salary){

        double newSalary = 0;

        if(salary <= 400){
            newSalary = salary + (0.15 * salary);
        } else if (salary <= 800) {
            newSalary = salary + (0.12 * salary);
        }
        else if (salary <= 1200) {
            newSalary = salary + (0.10 * salary);
        }
        else if (salary <= 2000.00) {
            newSalary = salary + (0.07 * salary);
        }
        else if (salary > 2000.01) {
            newSalary = salary + (0.04 * salary);
        }

        return newSalary;
    }

    static double calcMoneyEarned(double salary, double newSalary){

        double moneyEarned = newSalary - salary;

        return moneyEarned;

    }

    static double calcPercentage(double salary, double newSalary){

        double percentage = ((newSalary - salary) / salary) * 100;

        return percentage;
    }
}