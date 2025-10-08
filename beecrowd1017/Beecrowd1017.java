import java.util.Scanner;
public class Beecrowd1017 {
    public static void main(String[] args) {

        //fuel spent

        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();
        int speed = scanner.nextInt();
        double capacity = 12.0;

        double liters = (speed*time)/capacity;

        System.out.printf("%.3f\n", liters);

        scanner.close();
    }
}