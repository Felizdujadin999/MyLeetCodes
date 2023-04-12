package RemiLove;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        String input = "email@gmail.com";
        String regex = "[a-zA-Z0-9]+@[a-z]+\\.[a-z]{2,}";
        System.out.println(input.matches(regex));
        System.out.println(Pattern.matches(regex,input));

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.matches());
    }
}