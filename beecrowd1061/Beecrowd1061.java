import java.util.Scanner;

public class Beecrowd1061 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String startDayLine = scanner.nextLine();
        String startTimeLine = scanner.nextLine();
        String endDayLine = scanner.nextLine();
        String endTimeLine = scanner.nextLine();

        scanner.close();

        // extracting data
        int startDay = extractDay(startDayLine);
        int[] startTime = extractTime(startTimeLine);

        int endDay = extractDay(endDayLine);
        int[] endTime = extractTime(endTimeLine);

        // conversion total seconds
        int startTotal = toSeconds(startDay, startTime[0], startTime[1], startTime[2]);
        int endTotal = toSeconds(endDay, endTime[0], endTime[1], endTime[2]);

        int duration = endTotal - startTotal;

        // conversion back to d,h,m,s
        int days = duration / 86400; // 24*3600
        duration %= 86400;

        int hours = duration / 3600;
        duration %= 3600;

        int minutes = duration / 60;

        int seconds = duration % 60;

        System.out.println(days + " dia(s)");
        System.out.println(hours + " hora(s)");
        System.out.println(minutes + " minuto(s)");
        System.out.println(seconds + " segundo(s)");
    }

    public static int extractDay(String line) {
        String number = line.split(" ")[1];
        int day = Integer.parseInt(number);

        return day;
    }

    public static int[] extractTime(String line) {
        String[] parts = line.split(" : ");

        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        int second = Integer.parseInt(parts[2]);

        return new int[]{hour, minute, second};
    }

    public static int toSeconds(int day, int hour, int minute, int second) {
        return day * 24 * 3600 + hour * 3600 + minute * 60 + second;
    }
}
