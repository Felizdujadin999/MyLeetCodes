package ChapterSeven;
import java.util.Random;

public class TortoiseAndHareGame {
    public static void main(String[] args) {
        // Initialize variables for tortoise and hare's positions
        int tortoisePosition = 1;
        int harePosition = 1;

        // Initialize variables to track whether the tortoise and hare have won
        boolean tortoiseWins = false;
        boolean hareWins = false;

        // Initialize random number generator
        Random rand = new Random();

        // Print start of race message
        System.out.println("BANG !!!!! AND THEY'RE OFF !!!!!\n");

         // Loop until one of the animals wins
        while (!tortoiseWins && !hareWins) {
            // Move the tortoise
            int tortoiseRoll = rand.nextInt(10) + 1;
            if (tortoiseRoll <= 5) {
                // Tortoise moves fast
                tortoisePosition += 3;
            } else if (tortoiseRoll <= 7) {
                // Tortoise slips
                tortoisePosition -= 6;
            } else {
                // Tortoise moves slow
                tortoisePosition += 1;
            }

            // Move the hare
            int hareRoll = rand.nextInt(10) + 1;
            if (hareRoll <= 2) {
                // Hare moves fast
                harePosition += 9;
            } else if (hareRoll <= 4) {
                // Hare takes a nap
                harePosition += 0;
            } else if (hareRoll <= 5) {
                // Hare slips
                harePosition -= 12;
            } else {
                // Hare moves slow
                harePosition += 1;
            }

            // Check if the tortoise or hare has won
            if (tortoisePosition >= 70) {
                tortoiseWins = true;
            } else if (harePosition >= 70) {
                hareWins = true;
            }

            // Check if the tortoise or hare has gone out of bounds
            if (tortoisePosition < 1) {
                tortoisePosition = 1;
            }
            if (harePosition < 1) {
                harePosition = 1;
            }

            // Print the current positions of the tortoise and hare
            for (int i = 1; i <= 70; i++) {
                if (i == tortoisePosition && i == harePosition) {
                    System.out.print("OUCH!!!");
                } else if (i == tortoisePosition) {
                    System.out.print("T");
                } else if (i == harePosition) {
                    System.out.print("H");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            // Check if the race is over
            if (tortoiseWins && hareWins) {
                System.out.println("It's a tie.");
            } else if (tortoiseWins) {
                System.out.println("TORTOISE WINS!!! YAY!!!");
            } else if (hareWins) {
                System.out.println("Hare wins.");
            }
        }
    }
}
