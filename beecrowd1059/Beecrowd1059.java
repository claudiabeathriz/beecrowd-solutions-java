import java.util.Scanner;

public class Beecrowd1059 {

    public static void main(String[] args){

        // even numbers

        int x = 100;

        for (int i = 2; i <= x; i++) {
            // starting with 0 => counts 0 as even
            // starting with 1 => starts testing an odd number
            // starting with 2 => this approach avoids conditional checks
            // and iterates directly over even numbers
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
