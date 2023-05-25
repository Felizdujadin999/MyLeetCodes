package ChapterSeventeen.Stream;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsInterface {
    public static void main(String[] args) {
        List<String> words = List.of(
                "AAA",
                "BBB",
                "QWERTY",
                "DAMIEN",
                "THE LAW"
        );
        var s1 = words.stream()
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println(s1);
    }
}
