package ChapterSeventeen.Stream;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Example {
    public static void main(String[] args) {

    }

    public static Map<String, Integer> sortMapEntries(Map<String, Integer> map) {
        Map<String, Integer> result = new TreeMap<>(Comparator.naturalOrder());
        result.putAll(map);
        return result;
    }
}
