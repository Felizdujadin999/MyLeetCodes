package TurtleApplication;

import org.junit.jupiter.api.Test;

import static TurtleApplication.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private final Turtle turtle = new Turtle();


    @Test
    public void turtleCanMovePenDownTest(){
        assertTrue(turtle.penIsUp());
        turtle.penDown();
        assertFalse(turtle.penIsUp());
    }

    @Test
    public void turtleCanMovePenUpTest(){
        turtle.penDown();
        assertFalse(turtle.penIsUp());
        turtle.penUp();
        assertTrue(turtle.penIsUp());
    }

    @Test
    public void turtleCanTurnRightWhileFacingEastTest(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingSouthTest(){
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingWestTest(){
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingNorthTest(){
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingEastTest(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingNorthTest(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingWestTest(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingSouthTest(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveForwardWhileFacingEastTest(){
        assertSame(turtle.getCurrentDirection(), EAST);
        assertEquals(new Position(0,0), turtle.getPosition());
        turtle.moveForward(5);
        assertEquals(new Position(0,5), turtle.getPosition());
    }
}