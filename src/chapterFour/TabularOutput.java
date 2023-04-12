package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.printf("%-7s%-7s%-7s%-7s%n", "N", "N2", "N3", "N4");
        for (int i = 1; i <= 5; i++) {
            int copyOfI = i;
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-7s", copyOfI);
                copyOfI *= i;
            }
            System.out.println();
        }
    }
}
