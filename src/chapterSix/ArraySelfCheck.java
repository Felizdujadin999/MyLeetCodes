package chapterSix;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySelfCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do u wanna input?: ");
        int number = scanner.nextInt();
        int [] numberLength = new int[number];

        System.out.println("Enter a number that u would want the above numbers to add up to: ");
        int sum = scanner.nextInt();


        for (int index = 0; index < number ; index++) {
            System.out.println("Enter number: ");
            numberLength[index] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numberLength));

        for (int index = 0; index < numberLength.length; index++) {
            for (int i = 0; i <= numberLength[index]; i++) {
                if ((sum-i == numberLength[index])){
                    System.out.println(i + " " + numberLength[index]);
                }
            }
        }

          }
        }

//        int sum = 0;
//        for (int index = 0; index < number; index++) {
//            System.out.println("Enter score" +(index+1)+":");
//            score[index] = scanner.nextInt();
//        }
//
//        for (int index = 0; index <score.length ; index++) {
//            sum+=score[index];
//        }
//        System.out.println("The sum of the scores are " + sum);

