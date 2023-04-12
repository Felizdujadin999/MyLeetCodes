package LeetCodes;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        System.out.println(index(3, 1053, 2));
    }

    public static int index(int x, int y, int index) {
        int number = ((y / x) - 1);
        int sum = 0;
        for (int i = 0; i < x; i++) {sum += (number + i);}
            return number+index;
     }
}
