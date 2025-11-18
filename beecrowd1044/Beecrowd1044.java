import java.util.Scanner;
public class Beecrowd1044 {

    public static void main(String[] args){

        // multiples

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        scanner.close();

        if(isMultiple(A, B)){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
    }

    private static boolean isMultiple(int A, int B) {
        return B % A == 0 || A % B == 0;
    }
}
