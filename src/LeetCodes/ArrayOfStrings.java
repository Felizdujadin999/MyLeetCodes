package LeetCodes;
import java.util.Arrays;

public class ArrayOfStrings {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringArray(new String[]{"05241", "0", "000111224", "24"})));
    }

    public static String[] stringArray(String[] string){
        String[] outputArray = new String[string.length];
        for (int i = 0; i < string.length; i++) {
            outputArray[i] = String.valueOf(string[i].length());
        }
        return outputArray;

    }
}
