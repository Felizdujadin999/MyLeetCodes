package tdd;

import ChapterFive.Mp3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class mp3Test {

    @Test
    public void openMusic(){
        Mp3 beatz = new Mp3();
        beatz.getIsOpen();
        assertTrue(true);
    }
}
