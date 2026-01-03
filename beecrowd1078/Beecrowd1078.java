import java.util.Scanner;

public class Beecrowd1078 {

    public static void main(String[] args){

        // multiplication table

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            int multi = N * i;
            System.out.println(i + " x " + N + " = "  + multi);
        }

        scanner.close();
    }
}
