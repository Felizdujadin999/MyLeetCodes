package LeetCodes;

public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String result = convert(s, numRows);
        System.out.println(result);
    }
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int count = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += count) {
                result.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + count - i < n) {
                    result.append(s.charAt(j + count - i));
                }
            }
        }
        return result.toString();
    }
}
