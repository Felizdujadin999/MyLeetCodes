package chapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DistanceTest {


   @Test
    public void testThatTwoPointsInAPlaneRestOnLinePerpendicularToAxis(){
        assertTrue(Distance.isPerpendicular(2, 2, 3, 4));
    }

    @Test
    public void testThatCoordinatesWithoutSlopeDon_tLieOnPerpendicularLine(){
       assertFalse(Distance.isPerpendicular(3, 3, 4,4));
    }
}