import java.util.Scanner;

public class Beecrowd1010 {
    public static void main(String[] args) {

        //simple calculate

        Scanner scanner = new Scanner(System.in);

        int codeOfProduct1 = scanner.nextInt();
        int unitsOfProduct1 = scanner.nextInt();
        double costOfProduct1 = scanner.nextDouble();
        double totalProduct1 = unitsOfProduct1 * costOfProduct1;

        int codeOfProduct2 = scanner.nextInt();
        int unitsOfProduct2 = scanner.nextInt();
        double costOfProduct2 = scanner.nextDouble();
        double totalProduct2 = unitsOfProduct2 * costOfProduct2;

        double total = totalProduct1 + totalProduct2;
        System.out.printf("Valor a pagar: R$ %.2f\n", total);

        scanner.close();
    }
}

        /*versão otimizada

        import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Produto 1
                int code1 = scanner.nextInt();
                int qty1 = scanner.nextInt();
                double price1 = scanner.nextDouble();

                // Produto 2
                int code2 = scanner.nextInt();
                int qty2 = scanner.nextInt();
                double price2 = scanner.nextDouble();

                double total = qty1 * price1 + qty2 * price2;

                System.out.printf("Valor a pagar: R$ %.2f\n", total);

                scanner.close();
            }
        }
        */

        /*versão modular/ com função

        import java.util.Scanner;

        public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = lerTotalProduto(scanner) + lerTotalProduto(scanner);
        System.out.printf("Valor a pagar: R$ %.2f\n", total);

        scanner.close();
    }

            public static double lerTotalProduto(Scanner scanner) {
                    int codigo = scanner.nextInt();
            int unidades = scanner.nextInt();
            double preco = scanner.nextDouble();
            return unidades * preco;
    }
}
 */