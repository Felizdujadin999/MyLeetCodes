package LeetCodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCMOfANumberTest {
    @Test
    public void testLcmOf10Is2And5(){
        int[] check = LCMOfANumber.findFactors(10);
        int[] expected = {2, 5};
        assertArrayEquals(check, expected);
    }

    @Test
    public void testLcmOf20Is2_2And5(){
        int[] check = LCMOfANumber.findFactors(20);
        int[] expected = {2, 2, 5};
        assertArrayEquals(check, expected);
    }

    @Test
    public void testLcmOf100Is2_2_5And5(){
        int[] check = LCMOfANumber.findFactors(100);
        int[] expected = {2, 2, 5, 5};
        assertArrayEquals(check, expected);
    }
}