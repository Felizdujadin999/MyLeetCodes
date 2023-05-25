package ChapterSeventeen.Stream;

import java.util.Random;
import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {
        Stream<Integer> s =  Stream.generate(()-> new Random().nextInt()).limit(10);
        System.out.println(s.reduce(0, (x, y) -> x + y));

        Stream<Integer> stream = Stream.iterate(1, (number)->number+1).limit(5);
        stream.forEach(System.out::println);
    }
}
