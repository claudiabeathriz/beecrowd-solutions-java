import java.util.Scanner;

public class Beecrowd1037 {
    public static void main(String[]args){

        //interval

        Scanner scanner = new Scanner(System.in);

        double N = scanner.nextDouble();

        if(N < 0 || N > 100){
            System.out.println("Fora de intervalo");
        }
        else if(N >= 0 && N <= 25 ){
            System.out.println("Intervalo [0,25]");
        }
        else if(N > 25 && N <= 50 ){
            System.out.println("Intervalo (25,50]");
        }
        else if(N > 50 && N <= 75 ){
            System.out.println("Intervalo (50,75]");
        }
        else if(N > 75 && N <= 100 ){
            System.out.println("Intervalo (75,100]");
        }
        scanner.close();
    }
}
