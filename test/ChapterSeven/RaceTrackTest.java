package ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaceTrackTest {
    private RaceTrack raceTrack;

    @BeforeEach
    public void setUp() {
        raceTrack = new RaceTrack();
    }

    @Test
    public void testThatRaceTrackExists(){
        assertNotNull(raceTrack);
    }

    @Test
    public void testThatRaceTrackHas_70_Squares(){
        String[][] lanes = raceTrack.getLanes();
        String[] laneOne = lanes[0];
        String[] laneTwo = lanes[1];
        assertEquals(70, laneOne.length);
        assertEquals(70, laneTwo.length);
    }

    @Test
    public void testThatRaceTrackLaneSquareIsBlankByDefault(){
        String[][] lanes = raceTrack.getLanes();
        for (String[] lane:lanes) {
            for (String square:lane){
                assertEquals(" ", square);
            }
        }
    }

    @Test
    public void testTortoiseFast_PlodMove(){
        raceTrack.move(5);
        String[] tortoiseLane = raceTrack.getLanes()[0];
        assertEquals("T", tortoiseLane);
    }
}