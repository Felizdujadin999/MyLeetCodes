package TurtleApplication;

public class Position {
    private int row;
    private int columns;

    public Position(int row, int column) {
        this.row=row;
        this.columns=column;
    }
    public int getRow(){
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    @Override
    public boolean equals(Object obj) {
        Position position = (Position) obj;
        return position.getRow()==row&&position.getColumns()==columns;
    }
}
