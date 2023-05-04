package ChapterSeventeen.FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        biConsumer.accept("Felix", 20);
        printNameAndAge("Tinu", 2);
        BiConsumer<String, Integer> andThen = biConsumer.andThen(after);
        andThen.accept("Joshua", 26);
    }
    static BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.println(name +" "+ age);
    static BiConsumer<String, Integer> after = (name, age)-> System.out.println(name);
    public static void printNameAndAge(String name, Integer age){
        System.out.println(name+" "+age);
    }
}
