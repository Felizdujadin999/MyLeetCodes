package ChapterSeventeen.Stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<String> words = List.of(
                "AAA",
                "BBB",
                "QWERTY",
                "DAMIEN",
                "THE LAW"
        );
        Stream<Integer> s1 = words.stream()
                .flatMap((word)-> Stream.of(word.length()));
        s1.forEach(System.out::println);

        List<String> list = List.of(
                "AAA",
                "BBB",
                "QWERTY",
                "DAMIEN",
                "THE LAW"
        );
        System.out.println(list.stream()
                .flatMap(s -> Stream.of(s.split(""))).collect(Collectors.toList()));

        //PartitioningBy method is a predicate method that returns tru or false
        List<String> letters = List.of(
            "AAA",
            "BBB",
            "QWERTY",
            "ASDFG"
        );
        Map<Boolean, List<String>> map = letters.stream()
                .collect(Collectors.partitioningBy((w)->w.length()%2==0));
        System.out.println(map);

        Map<Boolean, Set<String>> map1 = letters.stream()
                        .collect(Collectors.partitioningBy((w)->w.length()%2==0, Collectors.toSet()));
        System.out.println(map1);
    }
}
