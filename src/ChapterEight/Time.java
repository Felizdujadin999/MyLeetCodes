package ChapterEight;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static void validate(int hour, int minute, int second){
        boolean hourIsInvalid = hour < 0 || hour >23;
        if (hourIsInvalid) throw new IllegalArgumentException("Hour is Invalid");
        boolean minuteIsInvalid = minute < 0 || minute > 59;
        if (minuteIsInvalid) throw new IllegalArgumentException("Minute is Invalid");
        boolean secondIsInvalid = second < 0 || second > 59;
        if (secondIsInvalid) throw new IllegalArgumentException("Second is Invalid");
    }
}
