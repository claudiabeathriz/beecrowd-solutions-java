import java.util.Scanner;

public class Beecrowd1059 {

    public static void main(String[] args){

        // even numbers

        int x = 100;

        for (int i = 1; i <= x; i++) {
            // pq deve começar com 1?
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
