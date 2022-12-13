package chapterOne;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                1. 
                2. 
                3. 
                4. 
                5. 
                6. 
                7. 
                8. 
                9.
                10.
                11.
                """);

        System.out.println("Enter any number listed above: ");
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println("Goal-Keeper. ");
            case 2 -> System.out.println("Right back defender. ");
            case 3 -> System.out.println("Left back defender. ");
            case 4 -> System.out.println("Defensive Mid-fielder. ");
            case 5 -> System.out.println("Center Back . ");
            case 6 -> System.out.println("Center Back. ");
            case 7 -> System.out.println("Left-wing Forwarder. ");
            case 8 -> System.out.println("Attacking Midfielder. ");
            case 9 -> System.out.println("Striker. ");
            case 10 -> System.out.println("Center Mid-Fielder. ");
            case 11 -> System.out.println("Right-wing Forwarder. ");
            default -> System.out.println("Comrade, you no sabi ball, go and learn!!!!!!!!. ");
        }
        System.out.println("Thanks for using my small app. ");
    }
}
