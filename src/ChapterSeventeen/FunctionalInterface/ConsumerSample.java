package ChapterSeventeen.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
//        Consumer<String> consumer2 = System.out::println;
        consumerDeclarative.accept("Felix");
        consumerImperative("Prof");
        Consumer<String> andThen = consumerDeclarative.andThen(after);
        andThen.accept("JOSHUA");
    }

    static Consumer<String> consumerDeclarative = firstInput -> System.out.println(firstInput);
    static Consumer<String> after = name -> System.out.println(name + " 200");

    public static void consumerImperative(String name) {
        System.out.println(name);
    }
}
