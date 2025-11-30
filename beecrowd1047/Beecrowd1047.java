import  java.util.Scanner;
public class Beecrowd1047 {

    public static void main(String[] args){

        // game time with minutes

        Scanner scanner = new Scanner(System.in);

        int startHour = scanner.nextInt();
        int startMinute = scanner.nextInt();
        int endHour = scanner.nextInt();
        int endMinute = scanner.nextInt();

        calculateDuration(startHour, startMinute, endHour, endMinute);

        scanner.close();

    }

    public static void calculateDuration(int startHour, int startMinute, int endHour, int endMinute){

        int startTotal = (startHour * 60) + (startMinute);
        int endTotal = (endHour * 60) + (endMinute);

        int duration = endTotal - startTotal;

        int durationHour = 0;
        int durationMinute = 0;

        if (duration <= 0) {
            duration += 1440;
        }

        durationHour = duration / 60;
        durationMinute = duration % 60;

    //    if(duration == 0) {
    //        durationHour = 24;
    //        durationMinute = 0;
    //    }
    //    else{
    //        durationHour = duration / 60;
    //        durationMinute = duration % 60;
    //    }

        System.out.println("O JOGO DUROU " + durationHour + " HORA(S) E " + durationMinute + " MINUTO(S)");

    }

}
