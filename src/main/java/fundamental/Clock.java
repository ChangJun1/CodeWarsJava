package fundamental;

public class Clock {
    public static int Past(int h, int m, int s) {
        //Happy Coding! ^_^
        int millisecond = 1;
        int second = 1000 * millisecond;
        int minute = 60 * second;
        int hour = 60 * minute;
        return h * hour + m * minute + s * second;
//        return (int) Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
    }
}