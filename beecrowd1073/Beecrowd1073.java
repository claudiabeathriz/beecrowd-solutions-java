import java.util.Scanner;

public class Beecrowd1073 {

    public static void main(String[] args){

        // even square

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        // int[] numbers;
        // numbers = new int[N];
        // the problem doesn't require arrays

        for(int i = 1; i <= N; i++){
            if(i % 2 == 0){
                int square = i * i;
                System.out.println(i + "^2 = " + square);
            }
        }

        scanner.close();
    }
}
