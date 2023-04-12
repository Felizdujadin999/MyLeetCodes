package TicTacToe;

public class TicTacToe {
    public  static final String[][] BOARD = new String[3][3];
    public final String PLAYER_ONE = "X";
    public final String PLAYER_TWO = "O";
    public static final int [][] BOARD_NUMBER = new int[3][3];

    public void movePlayer(int point) {
        int boardNumber = 0;
        for (int row = 0; row < BOARD_NUMBER.length; row++) {
            for (int column = 0; column < BOARD_NUMBER.length; column++) {
                BOARD_NUMBER[row][column] = boardNumber;
                boardNumber++;
                if (boardNumber == point){
                    
                }
            }
        }
    }
}
