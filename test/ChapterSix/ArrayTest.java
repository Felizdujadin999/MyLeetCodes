package ChapterSix;

import chapterSix.ArrayExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {

    @Test
     public void testGetListOfEven(){
        int [] values = new int[5];
        values[0] =12;
        values[1] =9;
        values[2] =28;
        values[3] =21;
        values[4] =1;

        int[] evenNumbersFromList = ArrayExample.getListOfEvenNumbers(values);
        assertEquals(2, evenNumbersFromList.length);
    }

    @Test
    public void testGetEvenFromListFromDifferentIndex(){
        int [] values = new int[5];
        values[0] =11;
        values[1] =7;
        values[2] =24;
        values[3] =22;
        values[4] =1;

        int[] evenNumbersFromList = ArrayExample.getListOfEvenNumbers(values);
        assertEquals(2, evenNumbersFromList.length);

    }
}
