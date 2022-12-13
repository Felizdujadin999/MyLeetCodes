package ChapterFive;

public class TicTacToe {
    public static void main(String[] args) {
        for (int i=1; i < 4; i++) {
            for (int j=1; j <=3; j++) {
                if (j == 1){
                    System.out.print("O ");
                } else if (j == 2) {
                    System.out.print("X ");
                }else
                    System.out.print("O ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=1; i<4 ; i++) {
            for (int j=1; j<=3 ; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}