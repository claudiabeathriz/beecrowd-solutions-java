import java.util.Scanner;
public class Beecrowd1019 {
    public static void main(String[] args){

        //time conversion

        int N;
        int hours;
        int minutes;
        int seconds;

        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        hours = N/3600;
        N = N % 3600;
        minutes = N/60;
        seconds = N % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
