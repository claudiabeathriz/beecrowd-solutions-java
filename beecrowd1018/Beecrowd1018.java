import java.util.Scanner;
public class Beecrowd1018 {
    public static void main(String[] args){

        //banknotes
        
        Scanner scanner = new Scanner(System.in);

        int N;
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int quantidade;

        N = scanner.nextInt();

        System.out.println(N);

        for(int nota : notas){
            quantidade = N / nota;
            //the / operation in Java between integers is integer division,
            // that is, the result is truncated downwards, discarding any decimal.
            N = N % nota;
            //the % operator calculates the remainder of integer division.

            System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
        }

        scanner.close();
    }
}
