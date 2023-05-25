package ChapterSeventeen.Lamdas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamSample {
    public static void main(String[] args) {
//        int nums = IntStream
//                .rangeClosed(0, 10)
//                .boxed()
//                .reduce(0, Integer::sum);
//        System.out.println(nums);
//        Random random = new Random();
//
//        System.out.println(IntStream
//                .generate(() -> 1 + random.nextInt(20))
//                .limit(12)
//                .boxed()
//                .toList());
//        System.out.println(IntStream
//                .rangeClosed(0, 20)
//                .filter(x -> x % 2 == 0)
//                .boxed()
//                .toList()
//                .stream()
//                .toList());
//
//        System.out.println(IntStream
//                .iterate(0, i -> i < 20, x -> x + 2)
//                .boxed()
//                .toList()
//                .stream()
//                .toList());
        List<String> names = List.of(
                "Pauline",
                "Prof",
                "Joshua",
                "Zainab",
                "Deborah"
        );
        System.out.println(names
                .stream()
                .map(String::toUpperCase)
                .filter(x -> x.length() < 5)
                .toList());
        System.out.println(names
                .stream()
                .collect(Collectors.toMap(x -> x, String::length)));

        Map<String, Integer> name = new HashMap<>();
        name.put("Felix", 20);
        name.put("Joshua", 30);
        name.put("Yinka", 25);
        name.put("Spencer", 25);
        System.out.println(name
                .entrySet()
                .stream()
                .sorted((x, y) -> y.getValue()));


//        List<Integer> nums = List.of(1, 2, 3, 4);
//        System.out.println(nums.stream().map(x -> x + 5).map(x -> x - 2 ).toList());
    }

    public static List<Integer> mapMethod(List<Integer> numbers) {
        return numbers
                .stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
    }
}
