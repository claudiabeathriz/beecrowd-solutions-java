import java.util.Scanner;
public class Beecrowd1020 {
    public static void main(String[] args){

        //age in days

        Scanner scanner = new Scanner(System.in);

        int ageInDays = scanner.nextInt();

        int years = ageInDays / 365;
        ageInDays = ageInDays % 365;
        int months = ageInDays / 30;
        int days = ageInDays % 30;

        System.out.println(years + " ano(s)\n" +
                           months + " mes(es)\n" +
                           days + " dia(s)" );
    }
}
