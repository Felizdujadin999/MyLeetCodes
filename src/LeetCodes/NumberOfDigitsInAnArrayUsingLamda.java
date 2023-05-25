package LeetCodes;

import java.util.Arrays;

public class NumberOfDigitsInAnArrayUsingLamda {
    public static void main(String[] args) {
        String[] letter = {"AB1396", "Q2RBS", "G381AC8"};
        System.out.println(Arrays.stream(letter)
                .flatMapToInt(CharSequence::chars)
                .filter(Character::isDigit)
                .count());
    }
}
