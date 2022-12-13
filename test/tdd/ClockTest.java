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
        Clock clock = new Clock(0, 0, 0);
        clock.setSecond(56);
        assertEquals(56,clock.getSecond());
    }
}
