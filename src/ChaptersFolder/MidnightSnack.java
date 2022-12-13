package ChaptersFolder;

import java.util.Scanner;

public class MidnightSnack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number or 0 to quit: ");
        int number = scanner.nextInt();
        int count = 0;
        int sum = 0;
        while ((sum < number)&&(number!=0)){
            System.out.println("Enter a number: ");
            int number2 = scanner.nextInt();
            sum+= number2;

            count++;
                }
        System.out.println(sum);
        }

}

