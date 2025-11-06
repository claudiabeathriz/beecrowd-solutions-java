import java.util.Scanner;
public class Beecrowd1040 {

    public static void main(String[] args){

        // average 3

        Scanner scanner = new Scanner(System.in);

        double N1 = scanner.nextDouble();
        double N2 = scanner.nextDouble();
        double N3 = scanner.nextDouble();
        double N4 = scanner.nextDouble();

        double media = ((N1*2) + (N2*3) + (N3*4) + (N4*1))/10;

        media = Math.floor(media * 10) / 10.0;
        // corta qualquer coisa depois da primeira casa decimal.

        System.out.printf("Media: %.1f\n",  media);
        //System.out.printf("Media: %.1f\n", Math.floor(media * 10) / 10);
        // não funciona pq so mostra o valor truncado no print, e nao no valor armazenado

        if(media >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 5.0 && media < 6.9) {
            System.out.println("Aluno em exame.");
            double N5 = scanner.nextDouble();

            System.out.printf("Nota do exame: %.1f\n", N5);

            double newMedia = (media+N5)/2;

            if(newMedia >= 5.0){
                System.out.println("Aluno aprovado.");
            }
            else{
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f\n", newMedia);
        }

    }
}
