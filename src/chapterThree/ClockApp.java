package chapterThree;

public class ClockApp {
    public static void main(String[] args) {
        Clock clock = new Clock(0, 0, 0);
        clock.setHour(9);
        clock.setMinute(58);
        clock.setSecond(60);
        clock.displayTime();
    }
}
