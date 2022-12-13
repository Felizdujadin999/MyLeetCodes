package chapterSix;
import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainCoinGAme {
    private static CoinGame game = new CoinGame();

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println(CoinGame.getGameMenu());
        int userInput = input.nextInt();
        do {
            switch (userInput) {
                case 1 -> game.flip();
                case 2 -> goodbye();
            }
            System.out.println(CoinGame.getGameMenu());
            userInput = input.nextInt();
        }while (userInput > 0 && userInput < 3);

    }
    private static void goodbye() throws InterruptedException {
        displayGoodbye();
        System.out.println("Shutting down......");
        for (int counter = 0; counter < 5; counter++) {
            TimeUnit.SECONDS.sleep(5);
            System.out.println(".....");
            System.exit(0);

        }
    }

    private static void displayGoodbye(){
        game.displayGameResult();
    }
}
