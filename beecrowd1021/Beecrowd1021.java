import java.util.Scanner;

public class Beecrowd1021 {
    public static void main(String[] args){

        //banknotes and coins

        Scanner scanner = new Scanner(System.in);

        double N = scanner.nextDouble();

        int parteInteira = (int) N;
        int centavos = (int) Math.round((N - parteInteira) * 100);

        int[] notas = {100, 50, 20, 10, 5, 2};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        int quantidade;

        System.out.println("NOTAS:");

        for(int nota : notas){
            quantidade = parteInteira / nota;
            parteInteira = parteInteira % nota;
            System.out.println(quantidade + " nota(s) de R$ " + nota + ".00");
        }

        centavos += parteInteira * 100;
        parteInteira = 0;

        System.out.println("MOEDAS:");

        for(int moeda : moedas){
            quantidade = centavos / moeda;
            centavos = centavos % moeda;
            System.out.printf("%d moeda(s) de R$ %.2f\n", quantidade, moeda/100.00);
        }
    }
}
