import java.util.Scanner;

public class Beecrowd1009 {
    public static void main(String[] args) {
        //salary with bonus
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double salary = scanner.nextDouble();
        double totalsales = scanner.nextDouble();

        double total = (salary + (totalsales*0.15));

        System.out.printf("TOTAL = R$ %.2f\n" , total);

        scanner.close();
    }
}

