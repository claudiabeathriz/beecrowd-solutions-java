import java.util.Scanner;
public class Beecrowd1051 {

    public static void main(String[] args){

        // taxes

        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();
        double taxes;

        if(salary <= 2000){
            System.out.print("Isento\n");
        }
        else if(salary <= 3000){
            taxes = (salary - 2000) * 0.08;
            System.out.printf("R$ %.2f\n", taxes);
        }
        else if(salary <= 4500){
            taxes = (1000 * 0.08) + ((salary - 3000) * 0.18);
            System.out.printf("R$ %.2f\n", taxes);
        }
        else{
            taxes = (1000 * 0.08) + (1500 * 0.18) + ((salary - 4500) * 0.28);
            System.out.printf("R$ %.2f\n", taxes);
        }
    }
}
