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

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public void setSecond(int second) {
        validateSeconds(second);
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    private static void validate(int hour, int minute, int second) {
        validateHour(hour);
        validateMinute(minute);
        validateSeconds(second);
    }

    private static void validateSeconds(int second) {
        boolean secondIsInvalid = second < 0 || second > 59;
        if (secondIsInvalid) throw new IllegalArgumentException("Second is Invalid");
    }

    private static void validateMinute(int minute) {
        boolean minuteIsInvalid = minute < 0 || minute > 59;
        if (minuteIsInvalid) throw new IllegalArgumentException("Minute is Invalid");
    }

    private static void validateHour(int hour) {
        boolean hourIsInvalid = hour < 0 || hour > 23;
        if (hourIsInvalid) throw new IllegalArgumentException("Hour is Invalid");
    }
}
