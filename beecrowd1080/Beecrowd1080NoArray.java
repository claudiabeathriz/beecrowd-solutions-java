import java.util.Scanner;

public class Beecrowd1080NoArray {

    public static void main(String[] args){

        // highest and position (w/o using arrays)

        Scanner scanner = new Scanner(System.in);

        int highestNumber = 0;
        int position = 0;

        for (int i = 1; i <= 100; i++) {
            int value = scanner.nextInt();

            if (i == 1 || value > highestNumber) {
                highestNumber = value;
                position = i;
            }
        }

        System.out.println(highestNumber);
        System.out.println(position);

        scanner.close();
    }
}
