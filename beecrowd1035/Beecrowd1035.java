import java.util.Scanner;

public class Beecrowd1035 {
    public static void main(String[] args){

        //selection test 1

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        if(C > 0 &&
           D > 0 &&
           A % 2 == 0 &&
           B > C &&
           D > A &&
           C + D > A + B){

            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }

        scanner.close();
    }
}
