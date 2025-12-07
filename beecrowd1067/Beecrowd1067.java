import java.util.Scanner;

public class Beecrowd1067 {
    public static void main(String[] args) {

        //odd numbers

        int x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
