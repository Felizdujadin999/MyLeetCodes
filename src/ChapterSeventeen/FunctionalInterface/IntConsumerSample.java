package ChapterSeventeen.FunctionalInterface;

import java.util.function.IntConsumer;

public class IntConsumerSample {
    public static void main(String[] args) {
        IntConsumer intConsumer = System.out::print;
        intConsumer.accept(10000);
    }
}
