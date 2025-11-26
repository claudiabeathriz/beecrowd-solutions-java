import java.util.Scanner;
public class Beecrowd1046 {

    public static void main(String[] args){

        // game time

        //Read the start time and end time of a game, in hours. Then calculate
        // the duration of the game, knowing that the game can begin in a day and
        // finish in another day, with a maximum duration of 24 hours. The message
        // must be printed in portuguese “O JOGO DUROU X HORA(S)” that means
        // “THE GAME LASTED X HOUR(S)”
        //
        //Input
        //Two integer numbers representing the start and end time of a game.
        //
        //Output
        //Print the duration of the game as in the sample output.

        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        calculateDuration(start, end);

        scanner.close();

    }

    public static void calculateDuration (int start, int end){

        int duration = 0;

        if(start == end) duration = 24;
        else if (start < end) duration = duration = end - start;
        else if(start > end) duration = (24 - start) + end;

        System.out.printf("O JOGO DUROU %d HORA(S)\n", duration);
    }
}
