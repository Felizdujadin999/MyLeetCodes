package ChapterSeventeen.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        System.out.println(predicate.test(10));

        Predicate<Integer> andOperation = predicate.and(after);
        System.out.println(andOperation.test(10));

        Predicate<Integer> orOperation = predicate.or(or);
        System.out.println(orOperation.test(5));
    }
    static Predicate<Integer> predicate = input -> input%2==0;
    static Predicate<Integer> after = afterInput -> afterInput >= 5;
    static Predicate<Integer> or = afterFirstOperation -> afterFirstOperation == 5;

}
