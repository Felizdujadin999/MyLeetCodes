package ChapterSix;
import chapterSix.CoinGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTossGameTest {
    private CoinGame coinGame;

    @BeforeEach
    public void setUp(){
        coinGame = new CoinGame();
    }

    @Test
    public void testThatGameExists(){
        assertNotNull(coinGame);
    }

    @Test
    public void testMenuOption(){
        String menu = CoinGame.getGameMenu();
        assertTrue(menu.equals("""
                1. Toss Coin
                2. Exit Game
                """));
    }

    @Test
    public void testFlipCoin(){
    String outcome = coinGame.flip();
    assertNotNull(outcome);
    assertTrue(outcome.equals("HEADS") || outcome.equals("TAILS"));
    }

    @Test
    public void testCountOutcome(){
        coinGame.flip();
        assertTrue(coinGame.getHeadCount() == 1 || coinGame.getTailCount() == 1);
    }
}
