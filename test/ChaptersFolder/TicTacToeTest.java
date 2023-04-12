package ChaptersFolder;

import TicTacToe.TicTacToe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static TicTacToe.TicTacToe.BOARD;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    private TicTacToe ticTacToe;
    @BeforeEach
        public void setUp(){ticTacToe = new TicTacToe();}
    @Test
    public void playerOneExist() {
        assertEquals("X", ticTacToe.PLAYER_ONE);
        assertEquals("O", ticTacToe.PLAYER_TWO);
    }

    @Test
    public void testThatThereAre_9_PositionsOnTheBoard(){
        assertEquals(3, BOARD.length);
    }

    @Test
    public void testThatPlayerOneIsBoard(){
        BOARD[0][0] = ticTacToe.PLAYER_ONE;
        BOARD[0][1] = ticTacToe.PLAYER_TWO;
        assertEquals(ticTacToe.PLAYER_ONE, BOARD[0][0]);
        assertEquals(ticTacToe.PLAYER_TWO, BOARD[0][1]);
    }

    @Test
    public void playersCanMoveOnTheBoard(){
        ticTacToe.movePlayer(5);
        System.out.println(Arrays.deepToString(BOARD));
        assertEquals(ticTacToe.PLAYER_ONE, BOARD[1][2]);
    }
}