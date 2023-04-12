package ChapterSeven;

import java.security.SecureRandom;

public class RaceCourse {
    private final RaceTrack raceTrack;

    private static final Pail pail = new Pail();

    public RaceCourse() {
        this.raceTrack = new RaceTrack();
    }

    public static int generateRandomNumber() {
        SecureRandom random = new SecureRandom();
        return 1 + random.nextInt(10);
    }

    public RaceTrack getRaceTrack() {
        return raceTrack;
    }


    public Pail getPail() {
        return pail;
    }

}