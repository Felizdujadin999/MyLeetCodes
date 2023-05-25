package VickyStikks;

import ChapterSeven.Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TestDrivenRubbishTest {
   TestDrivenRubbish test = new TestDrivenRubbish();
   @Test
   public void testThatICanAdd(){
      //given

      //when
      int add = test.addition(20, 21);
      //assert that
      assertEquals(41, add);
   }
   @Test
   public void testThatICanSubtract(){
      //given
      //when
      int subtract = test.subtraction(24, 7);
      //assert that
      assertEquals(17, subtract);
   }
   @Test
   public void testThatICanMultiply(){
      //given
      //when
      int multiply = test.multiply(3, 5);
      //assert that
      assertEquals(15, multiply);
   }
}