import java.util.Scanner;
public class Beecrowd1016 {
    public static void main(String[] args) {

        //distance

        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();

        int time = distance*2;

        System.out.println(time + " minutos");

        scanner.close();

    }
}