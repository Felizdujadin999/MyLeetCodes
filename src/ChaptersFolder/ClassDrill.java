package ChaptersFolder;

import java.util.Scanner;

public class ClassDrill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();
        if (number2<0) NegativeCase(number1, number2);
        else {
        int count = 1;
        int result = 1;
        while(count <= number2){
            result *= number1;
             count++;
          }
        System.out.println(result);
            System.out.println("Thanks for using my small app.....");
      }
    }

    private static void NegativeCase(int number1, int  number2){
     number2 *= -1;
     int result = 1;
        for (int i = 0; i < number2; i++) {
            result *= number1;
        }
        System.out.println(1 + "/" + result);
        System.out.println("Thanks for using my small app.....");
    }
}