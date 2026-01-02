import java.util.Scanner;

public class Beecrowd1075 {

    public static void main(String[] args){

        // remaining 2

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 1; i < 10000; i++){
            if(i % N == 2){
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
