package ChapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TimeTest {

    @Test
    public void testTimeConstructor(){
        //Time time = new Time(22,33,12);
        assertThrows (IllegalArgumentException.class, ()->new Time(37,12,55));
    }
}