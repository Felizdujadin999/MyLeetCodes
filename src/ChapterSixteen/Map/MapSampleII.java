package ChapterSixteen.Map;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class MapSampleII {
    public static void main(String[] args) {

        LinkedList<?>[] linkedLists = new LinkedList[100];

        Map<String, Integer> people = new TreeMap<>();
        people.put("Zainab", 100);
        people.put("Damain", 81);
        people.put("Prof", 801);

        System.out.println(people);
    }
}
