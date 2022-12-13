package ChaptersFolder;

public class RecursionSample {
    private static final int DEFAULT_VALUE = 4;

    public static void main(String[] args) {
    printRightFacingRightAngledTriangle(5);
    printLeftFacingRightAngledTriangle(5);
    }
    private static void printRightFacingRightAngledTriangle(int number){
        if(number<1) {
            return;
        }
        number=number-1;
        printRightFacingRightAngledTriangle(number);
        for (int i = 0; i < number; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    private static void printLeftFacingRightAngledTriangle(int number){
        if(number<1) {
            return;
        }
        number=number-1;
        printLeftFacingRightAngledTriangle(number);
        for (int i = number; i < DEFAULT_VALUE; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
