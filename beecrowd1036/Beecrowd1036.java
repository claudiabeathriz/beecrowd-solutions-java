import java.util.Scanner;

public class Beecrowd1036 {
    public static void main(String[] args) {

        //bhaskara's formula

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double delta = (Math.pow(B, 2)) - (4 * A * C);

        if(delta < 0 || A == 0){
            System.out.println("Impossivel calcular");
        }
        else{
            double R1 = (-B + (Math.sqrt(delta)))/ (2 * A);
            double R2 = (-B - (Math.sqrt(delta)))/ (2 * A);

            System.out.printf("R1 = %.5f\n" , R1);
            System.out.printf("R2 = %.5f\n" , R2);
        }

        scanner.close();

    }
}


//double[] numeros = scanner.nextDouble() double[3];

//double R1 = -numeros[1] + numeros[1]^2 - 4*numeros[0]*numeros[2] / 2*numeros[0];
//double R2 = -numeros[1] - numeros[1]^2 - 4*numeros[0]*numeros[2] / 2*numeros[0];


        /* public class Beecrowd1036 {
            public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);

                double[] numeros = new double[3];

                // Input do usuário
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print("Digite o número " + (i+1) + ": ");
                    numeros[i] = scanner.nextDouble();
                }

                double a = numeros[0];
                double b = numeros[1];
                double c = numeros[2];

                double delta = Math.pow(b, 2) - 4 * a * c;

                if (delta < 0 || a == 0) {
                    System.out.println("Impossível calcular");
                } else {
                    double R1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double R2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.printf("R1 = %.5f\n", R1);
                    System.out.printf("R2 = %.5f\n", R2);
                }

      */
