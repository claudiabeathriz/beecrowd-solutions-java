import java.util.Scanner;

public class Beecrowd1074 {

    public static void main(String[] args){

        // even or odd

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 0; i < N; i++){

            int x = scanner.nextInt();

            if(x == 0){
                System.out.println("NULL");
            }
            else if(x > 0){
                if(x % 2 == 0){
                    System.out.println("EVEN POSITIVE");
                }
                if(x % 2 != 0){
                    System.out.println("ODD POSITIVE");
                }
            }
            else{
                if(x % 2 == 0){
                    System.out.println("EVEN NEGATIVE");
                }
                if(x % 2 != 0){
                    System.out.println("ODD NEGATIVE");
                }
            }
        }

        scanner.close();
    }
}
