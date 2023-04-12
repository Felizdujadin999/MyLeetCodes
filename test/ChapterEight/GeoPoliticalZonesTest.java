package ChapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeoPoliticalZonesTest {

    @Test
    public void userCheckTest() {
        //StateInPoliticalZones findState = new StateInPoliticalZones(GeoPoliticalZones.NORTH_EAST);
        assertNotNull(GeoPoliticalZones.zoneFinder("FCT"));
    }
}