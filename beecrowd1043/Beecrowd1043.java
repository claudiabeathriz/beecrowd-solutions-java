import java.util.Scanner;
public class Beecrowd1043 {

    public static void main(String[] args){

        // triangle
        // a + b > c
        // a + c > b
        // b + c > a

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if(a + b > c && a + c > b && b + c > a){
            double p = a + b + c;
            System.out.printf("Perimetro = %.1f\n", p);
        }
        else{
            double t = ((a + b) * c)/2;
            System.out.printf("Area = %.1f\n", t);
        }

        scanner.close();
    }
}
