import java.util.Scanner;

public class Beecrowd1012 {
    public static void main(String[] args) {

        //area
        /*Make a program that reads three floating point values: A, B and C. Then, calculate and show:
        a) the area of the rectangled triangle that has base A and height C.
        b) the area of the radius's circle C. (pi = 3.14159)
        c) the area of the trapezium which has A and B by base, and C by height.
        d) the area of the square that has side B.
        e) the area of the rectangle that has sides A and B.
        */
        
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double triangulo = (a * c)/2;
        System.out.printf("TRIANGULO: %.3f\n", triangulo);

        double pi = 3.14159;
        double circulo = pi * Math.pow(c, 2);
        System.out.printf("CIRCULO: %.3f\n", circulo);

        double trapezio = (a + b) * c / 2;
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);

        double quadrado = Math.pow(b, 2);
        System.out.printf("QUADRADO: %.3f\n", quadrado);

        double retangulo = a * b;
        System.out.printf("RETANGULO: %.3f\n", retangulo);

        scanner.close();
    }
}