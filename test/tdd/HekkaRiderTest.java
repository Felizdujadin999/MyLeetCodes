package tdd;

import chapterFour.Rider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HekkaRiderTest {
    @Test
    public void riderTestOne(){
        Rider rider = new Rider();
        rider.sales(52);
        double award = rider.sales(52);
        assertEquals(10_400, award);
    }

    @Test
    public void riderTestTwo(){
        Rider rider = new Rider();
        rider.sales(67);
        double award = rider.sales(67);
        assertEquals(16_750, award);
    }

    @Test
    public void riderTestThree(){
        Rider rider = new Rider();
        rider.sales(70);
        double award = rider.sales(70);
        assertEquals(35_000, award);
    }

    @Test
    public void riderTestFour(){
        Rider rider = new Rider();
        rider.sales(7);
        double award = rider.sales(7);
        assertEquals(0, award);
       }
}
