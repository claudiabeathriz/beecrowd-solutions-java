import java.util.Scanner;

public class Beecrowd1038 {

    public static void main(String args[]){

        //snacks

        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        double total = 0;

        switch(X){
            case 1:
                total = 4 * Y;
                break;
            case 2:
                total = 4.5 * Y;
                break;
            case 3:
                total = 5 * Y;
                break;
            case 4:
                total = 2 * Y;
                break;
            case 5:
                total = 1.50 * Y;
                break;
        }

        System.out.printf("Total: R$ %.2f\n" , total);

    }

}
