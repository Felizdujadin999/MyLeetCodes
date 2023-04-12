package ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaceCourseTest {
    private RaceCourse raceCourse;

    @BeforeEach
    void setUp() {
        raceCourse = new RaceCourse();
    }

    @Test
    public void testThatRaceCourseExists(){
        assertNotNull(raceCourse);
    }

    @Test
    public void testThatRaceCourseHasRaceTrack(){
        assertNotNull(raceCourse);
        assertNotNull(raceCourse.getRaceTrack());
    }

    @Test
    public void testThatRaceCourseHasPail(){
        assertNotNull(raceCourse);
        assertNotNull(raceCourse.getPail());
    }

    @Test
    public void testGenerateRandomNumberBetween_1_and_10(){
        int number = RaceCourse.generateRandomNumber();
    }
}