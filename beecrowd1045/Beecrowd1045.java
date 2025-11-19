import java.util.Scanner;
import java.util.Arrays;
public class Beecrowd1045 {

    public static void main(String []args){

        // triangle types

        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[3];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextDouble();
        }

        Arrays.sort(numbers);

        //double temp = numbers[0];
        //numbers[0] = numbers[2];
        //numbers[2] = temp;

        double A = numbers[2];
        double B = numbers[1];
        double C = numbers[0];

        if(A >= (B + C)){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else {
            checkAngles(A, B, C);
            checkSides(A, B, C);
        }

        scanner.close();
    }

    public static void checkAngles(double A, double B, double C){
        if ((Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2))){
            System.out.println("TRIANGULO RETANGULO");
        } else if ((Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2))){
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if ((Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2))){
            System.out.println("TRIANGULO ACUTANGULO");
        }
    }

    public static void checkSides(double A, double B, double C){
        if (A == B && B == C){
        System.out.println("TRIANGULO EQUILATERO");
        } else if((A == B && A != C) ||
            (A == C && A != B) ||
            (B == C && B != A)){
        System.out.println("TRIANGULO ISOSCELES");
        }
    }
}