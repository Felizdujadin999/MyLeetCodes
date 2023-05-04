package LeetCodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDigitsInAnArrayTest {
    @Test
    public void testThatDigitInArrayIsTen(){
        String[] letter = {"AB1396", "Q32RBS", "G3831AC"};
        assertEquals(10, NumberOfDigitsInAnArray.countDigits(letter));
    }

}