package ChapterEight;

import java.util.Arrays;

public class StateInPoliticalZones {
    private GeoPoliticalZones zone;

    public StateInPoliticalZones(GeoPoliticalZones zone){
        this.zone = zone;
    }

    public GeoPoliticalZones getZone() {
        return zone;
    }

    public void setZone(String nameOfState) {
        this.zone = GeoPoliticalZones.zoneFinder(nameOfState);
    }
}
