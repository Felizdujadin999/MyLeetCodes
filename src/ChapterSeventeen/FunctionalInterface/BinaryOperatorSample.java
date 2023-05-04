package ChapterSeventeen.FunctionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        System.out.println(binaryOperator.apply("Zainab", "Prof"));
    }
    static BinaryOperator<String> binaryOperator = (firstName, lastName) -> firstName +" "+ lastName;
}
