package TurtleApplication;

import static TurtleApplication.Direction.*;

public class Turtle {
    private boolean penIsUp = true;
    private Direction direction = EAST;
    private Position position = new Position(0,0);

    public boolean penIsUp() {
        return penIsUp;
    }
    public void penDown() {
        penIsUp = false;
    }

    public void penUp() {
        penIsUp = true;
    }

    public Direction getCurrentDirection() {
        return direction;
    }

    public void turnRight() {
        if (direction==SOUTH) face(WEST);
        else if (direction==EAST) face(SOUTH);
        else if (direction==WEST) face(NORTH);
        else if (direction==NORTH) face(EAST);
    }
    public void turnLeft() {
        if (direction==EAST) face(NORTH);
        else if (direction==NORTH) face(WEST);
        else if (direction==WEST) face(SOUTH);
        else if (direction==SOUTH) face(EAST);
    }
    public Position getPosition() {
        return position;
    }
    public void moveForward(int numberOfSteps) {
        if (direction==EAST) increaseColumn(numberOfSteps);
    }

    public void increaseColumn(int numberOfSteps){
        position.setColumns(position.getColumns()+numberOfSteps);
    }
    private void face(Direction direction){
        this.direction = direction;
    }
}
