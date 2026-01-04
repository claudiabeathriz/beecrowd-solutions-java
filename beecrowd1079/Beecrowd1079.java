import java.util.Scanner;

public class Beecrowd1079 {

    public static void main(String[] args){

        // weighted averages

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 0; i < N; i++){
            double floating1 = scanner.nextDouble();
            double floating2 = scanner.nextDouble();
            double floating3 = scanner.nextDouble();

            double floatingResult = ((floating1 * 2) + (floating2 * 3) + (floating3 * 5))/10;

            System.out.printf("%.1f", floatingResult);
            System.out.println();
        }
        scanner.close();
    }
}
