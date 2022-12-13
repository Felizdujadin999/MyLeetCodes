package ChapterFive;

public class SleepTaker {
    public static void main(String[] args) {


        int blank = 4;
        for (int increase = 1; increase <= 10; increase+=2) {
            for (int space = 0; space < blank; space++) {
                System.out.print("  ");
            }
            for (int diamond = 1; diamond <= increase;  diamond++) {
                System.out.print("*");
            }
            System.out.println();
            blank--;
        }
        System.out.println();

        int blanks = 4;
        for (int i = 1; i <= 10; i+=2) {
            for (int j = 1; j < blanks; j++) {
                System.out.print("");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            blanks--;
        }
        System.out.println();

        for (int i =1; i <=10; i+=2) {
            for (int j =9; j >= i; j--) {
                System.out.print("*");
            }
          System.out.println();
        }
        System.out.println();

        int space = 0;
        for (int i =9; i > 0; i-=2) {
            for (int j=0; j < space;j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ;k+=1) {
                System.out.print("*");
            }
            System.out.println();
            space+=2;
        }
    }
}
