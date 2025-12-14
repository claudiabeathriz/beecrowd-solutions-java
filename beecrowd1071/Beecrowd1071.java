import java.util.Scanner;
import java.util.stream.IntStream;

public class Beecrowd1071 {

    public static void main(String[] args){

        // sum of consecutive odd numbers i

        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int sum = 0;
        int start;
        int end;

        if(X < Y){
           start = X;
           end = Y;
        }
        else{
            start = Y;
            end = X;
        }

        for(int i = start + 1; i < end; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}
