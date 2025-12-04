import java.util.Arrays;
import java.util.Scanner;

public class Beecrowd1049 {

    public static void main(String[] args) {

        // animal

        Scanner scanner = new Scanner(System.in);

        String[] characteristics = new String[3];
        for(int i = 0; i < 3; i++){
            characteristics[i] = scanner.nextLine();
        }

        //System.out.println(Arrays.toString(characteristics));
        identifyAnimal(characteristics);

        scanner.close();
    }

    static void identifyAnimal(String[] characteristics){

        if(characteristics[0].equals("vertebrado")){
            if(characteristics[1].equals("ave")){
                if(characteristics[2].equals("carnivoro")){
                    System.out.println("aguia");
                } else if (characteristics[2].equals("onivoro")) {
                    System.out.println("pomba");
                }
            }
            else if(characteristics[1].equals("mamifero")){
                if (characteristics[2].equals("onivoro")){
                    System.out.println("homem");
                } else if (characteristics[2].equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (characteristics[0].equals("invertebrado")) {
            if(characteristics[1].equals("inseto")){
                if(characteristics[2].equals("hematofago")){
                    System.out.println("pulga");
                } else if (characteristics[2].equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            }
            else if(characteristics[1].equals("anelideo")){
                if (characteristics[2].equals("hematofago")){
                    System.out.println("sanguessuga");
                } else if (characteristics[2].equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
