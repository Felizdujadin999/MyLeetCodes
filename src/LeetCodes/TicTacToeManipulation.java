package LeetCodes;

public class TicTacToeManipulation {
    public static void main(String[] args) {
        char[][] value = {{'O', 'O', 'X'},
                          {'O', 'O', 'X'},
                          {'X', 'O', 'O'}};
        for (char[] i:value) {
            System.out.println(i);
        }

        for (char[] row:value) {
            for (char column:row) {
                if (column=='X'){column='1';}
                else {column='0';}
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
