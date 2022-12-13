package tdd;

import chapterThree.Clock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    @Test
    public void hourTest(){
        Clock clock = new Clock(0, 0, 0);
        clock.setHour(12);
        assertEquals(12, clock.getHour());
    }

    @Test
    public void minuteTest(){
        Clock clock = new Clock(0, 0, 0);
        clock.setMinute(23);
        assertEquals(23, clock.getMinute());
    }
    @Test
    public void secondTest(){
        Clock clock = new Clock(0, 0, 65);
        clock.setSecond(65);
        assertEquals(0,clock.getSecond());
    }

    @Test
    public void displayTest(){
        Clock clock = new Clock(0, 0, 0);
        clock.displayTime();
    }
}
