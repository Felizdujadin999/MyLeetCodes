package LeetCodes;

public class NumberOfDigitsInAnArray {
    public static void main(String[] args) {
        String[] letter = {"AB1396", "Q2RBS", "G381AC"};
        System.out.println(countDigits(letter));
    }

    public static int countDigits(String[] arr){
        int count = 0;
        for (String str : arr) {
            for (int j = 0; j < str.length(); j++) {
                if (Character.isDigit(str.charAt(j))) {
                    count++;
                }
            }
        }
        return count;
    }

}
