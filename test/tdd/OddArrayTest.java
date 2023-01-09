package tdd;

import ClassWork.OddArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OddArrayTest {

    @Test
    public void testFindOdd(){
        int[] numbers = {11,15,12,17,14,5};
        int[] oddElements = OddArray.findOdd(numbers);
        int[] expected = {11,15,17,5};
        assertArrayEquals(expected, oddElements);
    }
}
