package chapterSix;

import java.security.SecureRandom;

public class CoinGame {
    private int headCount;
    private int tailCount;
    private Coin coin;

    public static String getGameMenu() {
            return """
                1. Toss Coin
                2. Exit Game
                """;
    }
    public String flip(){
        int randomNumber = generateRandomNumbers();
        if (randomNumber == 0) {
            headCount++;
            return Coin.HEADS.name();}
         tailCount++;
        return Coin.TAILS.name();
        }

    private static int generateRandomNumbers(){
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(2);
    }

    public int getHeadCount(){
        return headCount;
    }
    public int getTailCount(){
        return tailCount;
    }

    public void displayGameResult(){
        int totalFlip = headCount+tailCount;
        System.out.printf("Total Head Count is %d%n" + "Total Tail is %d%n" + "Total Time Played %d%n", headCount, tailCount, totalFlip);
    }
}

