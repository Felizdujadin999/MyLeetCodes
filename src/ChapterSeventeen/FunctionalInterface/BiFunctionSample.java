package ChapterSeventeen.FunctionalInterface;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        System.out.println(biFunction.apply(4, 5));

    }
    static BiFunction<Integer, Integer, String> biFunction = (inputOne, inputTwo) -> inputTwo + inputTwo + " A string";
}
