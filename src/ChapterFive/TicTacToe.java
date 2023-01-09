package ChapterFive;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println();
        for (int i = 0; i<=1; i++) {
            System.out.println("O X O");
            for (int j = 1; j ==i ; j++) {
                System.out.print("X X O");
            }
        }
        System.out.println();
        System.out.println();
        for (int i=0; i<=1 ; i++) {
            System.out.println("X X O");
            for (int j=1; j==i; j++) {
                System.out.print("O O X");
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i<=1; i++) {
            System.out.println("X O O");
            for (int j = 1; j ==i ; j++) {
                System.out.print("O X X");
            }
        }
    }
}