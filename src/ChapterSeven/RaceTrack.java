package ChapterSeven;

import java.util.Arrays;
public class RaceTrack {
    private final String[][] lanes;
    private final String TORTOISE = "T";
    private int tortoisePosition;
    private int harePosition;
    private final String HARE = "H";
    private final String blankSpace = " ";
    private final int TORTOISE_LANE = 0;
    private final int HARE_LANE = 1;

    public RaceTrack() {
        int numberOfLanes = 2;
        int numberOfSquaresPerLane = 70;
        this.lanes = new String[numberOfLanes][numberOfSquaresPerLane];
        for (String[] lane : lanes) {
            Arrays.fill(lane, blankSpace);
        }
        lanes[TORTOISE_LANE][tortoisePosition] = TORTOISE;
        lanes[HARE_LANE][harePosition] = HARE;
    }

    public String[][] getLanes() {
        return lanes;
    }

    public String getTortoise() {
        return TORTOISE;
    }

    public int getTortoiseLane() {
        return TORTOISE_LANE;
    }

    public int getHareLane() {
        return HARE_LANE;
    }

    public String getHare() {
        return HARE;
    }
    public void move(int number) {
        moveTortoise(number);
        moveHare(number);
    }
    private int setAnimalPosition(int move, int animalPosition) {
        if (animalPosition + move < 0) return 0;
        else if (animalPosition + move > 69) return 69;
        else return animalPosition;
    }
    private void moveHare(int number) {
        String[] lane = lanes[HARE_LANE];
        if (number >= 1 && number <= 2) makeSleepMove(lane);
        else if (number >= 3 && number <= 4) makeBigHopMove(lane);
        else if (number == 5) makeBigSlipMove(lane);
        else if (number >= 6 && number <= 8) makeSmallHopMove(lane);
        else makeSmallSlipMove(lane);
    }
    private void makeSmallSlipMove(String[] lane) {
        lane[harePosition] = blankSpace;
        if (harePosition < 2) slipHareToRaceStart(lane);
        else {
            lane[harePosition + RaceMove.SMALL_SLIP] = HARE;
            harePosition += RaceMove.SMALL_SLIP;
        }
    }
    private void makeSmallHopMove(String[] lane) {
        lane[harePosition] = blankSpace;
        lane[harePosition + RaceMove.SMALL_HOP] = HARE;
        harePosition += RaceMove.SMALL_HOP;
    }
    private void makeSleepMove(String[] lane) {
        lane[harePosition + RaceMove.SLEEP] = HARE;
        harePosition += RaceMove.SLEEP;
    }
    private void makeBigSlipMove(String[] lane) {
        lane[harePosition] = blankSpace;
        if (harePosition < 12) slipHareToRaceStart(lane);
        else hareBigSlipMove(lane);
    }
    private void hareBigSlipMove(String[] lane) {
        lane[harePosition + RaceMove.BIG_SLIP] = HARE;
        harePosition += RaceMove.BIG_SLIP;
    }
    private void slipHareToRaceStart(String[] lane) {
        lane[0] = HARE;
        harePosition = 0;
    }
    private void makeBigHopMove(String[] lane) {
        lane[harePosition] = blankSpace;
        harePosition = setAnimalPosition(RaceMove.BIG_HOP, harePosition);
        lane[harePosition] = HARE;
        harePosition += RaceMove.BIG_HOP;
    }
    private void moveTortoise(int number) {
        String[] lane = lanes[TORTOISE_LANE];
        if (number >= 1 && number <= 5) makeFastPlodMove(lane);
        else if (number >= 6 && number <= 7) makeSlipMove(lane);
        else if (number >= 8 && number <= 10) makeSlowPlodMove(lane);
    }
    private void makeSlowPlodMove(String[] lane) {
        lane[tortoisePosition] = blankSpace;
        lane[tortoisePosition + RaceMove.SLOW_PLOD] = TORTOISE;
        tortoisePosition += RaceMove.SLOW_PLOD;
    }
    private void makeFastPlodMove(String[] lane) {
        lane[tortoisePosition] = blankSpace;
        lane[tortoisePosition + RaceMove.FAST_PLOD] = TORTOISE;
        tortoisePosition += RaceMove.FAST_PLOD;
    }
    private void makeSlipMove(String[] lane) {
        if (tortoisePosition < 6) {
            lane[0] = TORTOISE;
            tortoisePosition = 0;
        } else {
            lane[tortoisePosition + RaceMove.SLIP] = TORTOISE;
            tortoisePosition += RaceMove.SLIP;
        }
    }

    public void setTortoisePosition(int tortoisePosition) {
        this.tortoisePosition = tortoisePosition;
    }

    public void setHarePosition(int harePosition) {
        this.harePosition = harePosition;
    }

    public String getBlankSpace() {
        return blankSpace;
    }

    public int getTortoisePosition() {
        return tortoisePosition;
    }
}